����   5 T  somaABC  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this 	LsomaABC; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   java/lang/StringBuilder " 	digite o 
  $  % (Ljava/lang/String;)V
  ' ( ) append (I)Ljava/lang/StringBuilder; + o valor do vetor A:
  - ( . -(Ljava/lang/String;)Ljava/lang/StringBuilder;
  0 1 2 toString ()Ljava/lang/String;
 4 6 5 java/io/PrintStream 7 % println
  9 : ; nextInt ()I =   ? 	Digite o  A o valor do vetor b: C 
Apresente  E o valor do vetor C: args [Ljava/lang/String; Ljava/util/Scanner; A [I B C i I StackMapTable G J 
SourceFile somaABC.java !               /     *� �    
                    	      �     ܻ Y� � L
�
M
�
N
�
:6� ,� � Y!� #`� &*� ,� /� 3,+� 8O�
��Ӳ <� 36� :� � Y>� #`� &@� ,� /� 3-+� 8O,.-.`O�
��Ų <� 36� ,� � YB� #`� &D� ,.� &� /� 3�
��ӱ    
   N      
       !  ?  G  Q  Y  _  }  �  �  �  �  �  �  �     >    � F G    �  H   � I J   � K J   � L J   � M N  O    � !  P  Q Q Q  (6(  R    S