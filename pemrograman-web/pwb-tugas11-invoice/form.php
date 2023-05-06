<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="src/css/postget.css" />
    <title>Invoice</title>
  </head>
  <body>
    <div class="kotakForm">
      <div class="kontenInvoice">
        <div class="kontenHeading">
          <h1>Order</h1>
          <span>Please finish your order to proceed with payment</span>
        </div>
        <form action="invoice.php" method="POST">
          <div class="formOrder">
            <div class="formData">
              <h2>Choose your plan</h2>
              <div class="planPack">
                <div class="plan-item">
                  <input
                    id="personal"
                    type="radio"
                    name="plan"
                    value="Personal Plan"
                    required /><label for="personal">
                    Personal Plan - Rp 120.000
                  </label>
                </div>
                <div class="plan-item">
                  <input
                    id="exclusive"
                    type="radio"
                    name="plan"
                    value="Exclusive Plan"
                    required /><label for="exclusive"
                    >Exclusive Plan - Rp 700.000</label
                  >
                </div>
              </div>
            </div>
            <div class="formData">
              <h2>Details</h2>
              <div class="userData">
                <label>
                  Username<br />
                  <input
                    class="inputan"
                    type="text"
                    name="username"
                    placeholder="Insert your username"
                    required
                    pattern="[A-Za-z0-9]{4,}" />
                </label>
                <label>
                  Nama<br />
                  <input
                    class="inputan"
                    type="text"
                    name="name"
                    placeholder="Inser your name"
                    required
                    pattern="^[a-zA-Z\s]+$" />
                </label>
                <label>
                  Email<br />
                  <input
                    class="inputan"
                    type="email"
                    name="email"
                    placeholder="Insert your email"
                    required />
                </label>
              </div>
            </div>
            <div class="formData">
              <h2>Payment Method</h2>
              <div class="payment">
                <select name="payment" class="menuBayar" required>
                  <option value="">Choose your payment</option>
                  <option value="gopay">Gopay</option>
                  <option value="dana">DANA</option>
                  <option value="mandiri">Mandiri</option>
                </select>
              </div>
            </div>

            <button type="submit" value="Bayar">Pay</button>
          </div>
        </form>
      </div>
    </div>
  </body>
</html>
