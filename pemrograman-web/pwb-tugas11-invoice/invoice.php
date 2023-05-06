<?php
if (isset($_POST['username']) && isset($_POST['name']) && isset($_POST['email']) && isset($_POST['plan']) && isset($_POST['payment'])) {
    
    // validate input
    $username = $_POST['username'];
    $name = $_POST['name'];
    $email = $_POST['email'];
    $plan = $_POST['plan'];
    $payment = $_POST['payment'];

      $invoice = str_pad(mt_rand(1,9999), 4, '0', STR_PAD_LEFT);

      if ($payment == 'gopay') {
        $img_name = 'gopay.png';
      } else if ($payment == 'dana') {
        $img_name = 'dana.png';
      } else {
        $img_name = 'mandiri.png';
      }

      if ($plan == 'Personal Plan') {
        $price = '120.000';
      } else if ($plan == 'Exclusive Plan') {
        $price = '700.000';
      }
      }
?>

<!DOCTYPE html>
      <html lang="en">
      <head>
          <meta charset="UTF-8">
          <meta http-equiv="X-UA-Compatible" content="IE=edge">
          <meta name="viewport" content="width=device-width, initial-scale=1.0">
          <link rel="stylesheet" href="src/css/postget.css">
          <title>Invoice</title>
      </head>
      <body>
          <div class="kotakInvoice">
              <div class="kontenInvoice">
                  <div class="kontenHeading">
                      <h1>Welcome to <b>Arurang</b></h1>
                      <span>Thank you for subscribing Arurang Membership</span>
                  </div>
                  <div class="invoice">
                      <div class="invoice-detail">
                          <div class="invoice-detail-heading">
                              <div class="statusInvoice">
                                  <span>Receipt #<?php echo $invoice;?></span>
                                  <div class="paid"><p>Paid</p></div>
                                  </div>
                                  <div class="planInvoice">
                                      <table>
                                          <tr>
                                              <td><?php echo $plan;?></td>
                                              <td>Rp <?php echo $price;?></td>
                                          </tr>
                                      </table>
                                  </div>
                              </div>
                              <div class="identityInvoice">
                                  <div class="invoice-detail-content">
                                      <table>
                                          <tr>
                                              <td>Username</td>
                                              <td><?php echo $username;?></td>
                                          </tr>
                                      </table>
                                      <table>
                                          <tr>
                                              <td>Name</td>
                                              <td><?php echo $name;?></td>
                                          </tr>
                                      </table>
                                      <table>
                                          <tr>
                                              <td>Email</td>
                                              <td><?php echo $email;?></td>
                                          </tr>
                                      </table>
                                  </div>
                              </div>
                          </div>
                          <div class="invoice-detail-footer">
                              <div class="payInvoice">
                                  <span>Paid with</span>
                                  <img src="img/<?php echo $img_name;?>" alt="">
                              </div>
                              <p>This invoice is valid and processed by Arurang Secure</p>
                          </div>
                      </div>
                      <button onclick="window.location.href = 'form.php';">Go to Membership</button>
                  </div>
              </div>
            </body>
            </html>
            