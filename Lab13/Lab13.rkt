;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-advanced-reader.ss" "lang")((modname Lab11) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #t #t none #f () #f)))
;part 1 starts here
(print "Hello Ben")
486
( + 1 3 )
( - 7 4 )
( - 4 7 )
( * 3 5 )
( / 35 7 )
( / 7 35 )
;comments
( + 1 2 3 4)
( * 3 5 7)
( / 7 5 3)
( * ( + 3 4) ( + 10 3 ) )
;single line
( + ( * 3 ( + ( * 2 4) (+ 3 5))) (+ ( - 10 7 )  6 ))
;multiple line

(+ ( * 3
       ( + (  * 2 4 )
           ( + 3 5)))
   ( + ( - 10 7)
       6 ))
(< 3 0)
(> 3 0)
(and (> 3 0) (< 3 0))
( or (> 3 0) (< 3 0))
( print "Hello, world")

;part 2
(define length2 13)
length2
(* 3 length2)
;(* 3 width)
(define width 17)
(* length2 width)
(define area (* width length2))
area
(define my_pi 3.14159)
(define radius 11)
(* my_pi (* radius radius))
(define circumference(* 2 my_pi radius))
circumference

;part 3
;define((name)(parameters))(body))
(define (square x) (* x x))
(square 10)
(square length2)
(+ (square 5) (square 4))
(square (square 3))
(define (sum-of-squares x y) (+ (square x) (square y)))
(sum-of-squares 3 4)
;part 4
;if(predicate)(consequent)(alternative)
(if (< width 3) (print "short") (print "long"))
(define width2 2)
(if (< width2 3) (print "short") (print "long"))
(if (> length2 2)  7 11)
;absolte value
(define (absolute-value x)
  (if (< x 0 )
      ( - x)
      x
      )
  )
(absolute-value -3)
(absolute-value (* 7 -3))
;max
(define (maximum x y) (if (> x y ) x y))
(maximum 3 7)
;recursion
(define (factorial n)
  (if ( < n 1 ) 1 ( * n ( factorial( - n 1 )))))
(factorial 3)
(factorial 7)
;GCD recursion
(define (my_GCD a b)
  (if ( = b 0 ) a ( my_GCD b (remainder a b))))

(my_GCD 9 21)
(my_GCD 15 35)
