import numpy as np
# Dataset from site
x_public = np.array([
    [-2, 4, -1],
    [4, 1, -1],
    [1, 6, -1],
    [2, 4, -1],
    [6, 2, -1],

])
y_public = np.array([-1, -1, 1, 1, 1])
eta_public = 1

# Private dataset
x_private = np.array([
    [4, 3, -1],
    [7, 3, -1],
    [1, 6.5, -1],
    [2.6, 4.5, -1],
    [2.4, 6.5, -1],
    [4, 6.5, -1],
    [2.5, 8.5, -1],

])
y_private = np.array([-1, -1, 1, 1, 1, 1, 1])

eta_private = 0.1
