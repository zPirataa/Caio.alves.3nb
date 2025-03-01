// Estrutura do Nó
pub struct No<T> {
    dado: T,
    proximo: Option<Box<No<T>>>,
}

// fila genérica
pub struct Fila<T> {
    cabeca: Option<Box<No<T>>>,
    tamanho: usize,
}

impl<T> Fila<T> {
    // fila vazia
    pub fn nova() -> Self {
        Fila {
            cabeca: None,
            tamanho: 0,
        }
    }

    // elemento no final da fila
    pub fn enfileirar(&mut self, elemento: T) {
        let novo_no = Box::new(No {
            dado: elemento,
            proximo: None,
        });

        if self.cabeca.is_none() {
            self.cabeca = Some(novo_no);
        } else {
            // encontrar o último nó e adicionar o novo nó após ele
            let mut atual = self.cabeca.as_mut().unwrap();
            loop {
                if atual.proximo.is_none() {
                    atual.proximo = Some(novo_no);
                    break;
                }
                atual = atual.proximo.as_mut().unwrap();
            }
        }

        self.tamanho += 1;
    }

    // remove e retorna o elemento da frente da fila
    pub fn desenfileirar(&mut self) -> Option<T> {
        self.cabeca.take().map(|cabeca| {
            self.cabeca = cabeca.proximo;
            self.tamanho -= 1;
            cabeca.dado
        })
    }

    // retorna uma referencia ao elemento da frente da fila sem removê-lo
    pub fn espiar(&self) -> Option<&T> {
        self.cabeca.as_ref().map(|no| &no.dado)
    }

    // retorna o numero atual de elementos na fila
    pub fn tamanho(&self) -> usize {
        self.tamanho
    }
}

// trait Drop para limpar recursos
impl<T> Drop for Fila<T> {
    fn drop(&mut self) {
        let mut atual = self.cabeca.take();
        while let Some(mut no) = atual {
            atual = no.proximo.take();
        }
    }
}

// testes unitarios
#[cfg(test)]
mod testes {
    use super::*;

    #[test]
    fn testar_fila_nova() {
        let fila: Fila<i32> = Fila::nova();
        assert_eq!(fila.tamanho(), 0);
    }

    #[test]
    fn testar_enfileirar() {
        let mut fila: Fila<i32> = Fila::nova();
        fila.enfileirar(1);
        fila.enfileirar(2);
        assert_eq!(fila.tamanho(), 2);
    }

    #[test]
    fn testar_desenfileirar() {
        let mut fila: Fila<i32> = Fila::nova();
        fila.enfileirar(1);
        fila.enfileirar(2);
        assert_eq!(fila.desenfileirar().unwrap(), 1);
        assert_eq!(fila.desenfileirar().unwrap(), 2);
        assert_eq!(fila.desenfileirar(), None);
    }

    #[test]
    fn testar_espiar() {
        let mut fila: Fila<i32> = Fila::nova();
        fila.enfileirar(1);
        assert_eq!(*fila.espiar().unwrap(), 1);
    }

    #[test]
    fn testar_tamanho() {
        let mut fila: Fila<i32> = Fila::nova();
        fila.enfileirar(1);
        fila.enfileirar(2);
        assert_eq!(fila.tamanho(), 2);
    }
}
