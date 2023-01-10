package ru.kremenia.structural.expression;

public abstract class BinaryExpression implements Expression{
    private final Expression left, right;
    private final BinaryOperation operation;

    public BinaryExpression(Expression left, Expression right, BinaryOperation operation) {
        this.left = left;
        this.right = right;
        this.operation = operation;
    }

    @Override
    public int eval() {
        return operation.apply(left, right);
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }
}
