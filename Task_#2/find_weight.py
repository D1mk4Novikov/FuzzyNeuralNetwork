
#bимоптр либы
import numpy as np

# входные данные
# строка - набор данных
# первый столбец - первый x
# второй столбец -
# третий столбец -
X = np.array([
    [-2, 4, -1],
    [4, 1, -1],
    [1, 6, -1],
    [2, 4, -1],
    [6, 2, -1],

])

# к какой группе относятся данные
y = np.array([-1, -1, 1, 1, 1])

def perceptron_sgd(X, Y):
    w = np.zeros(len(X[0]))
    eta = 1
    epochs = 20

    # подбор весов (обучение)
    for t in range(epochs):
        for i, x in enumerate(X):
            if (np.dot(X[i], w)*Y[i]) <= 0:
                w = w + eta*X[i]*Y[i]

    return w


# w1*x1 + w2*x2 + w3

w = perceptron_sgd(X,y)
print(w)