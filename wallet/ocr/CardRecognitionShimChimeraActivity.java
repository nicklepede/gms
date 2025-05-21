package com.google.android.gms.wallet.ocr;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.R;
import com.google.android.gms.ocr.CreditCardOcrResult;
import com.google.android.gms.wallet.CreditCardExpirationDate;
import com.google.android.gms.wallet.PaymentCardRecognitionResult;
import defpackage.arwm;
import defpackage.arxd;
import defpackage.assx;
import defpackage.csft;
import defpackage.eiig;
import defpackage.qet;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class CardRecognitionShimChimeraActivity extends qet {
    private final void a(int i) {
        Intent intent = new Intent();
        intent.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", i);
        setResult(1, intent);
    }

    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        super.onActivityResult(i, i2, intent);
        if (i != 1001) {
            a(8);
            finish();
            return;
        }
        boolean z = false;
        if (i2 != -1) {
            if (i2 == 0 || i2 == 10004 || i2 == 10007) {
                setResult(0, new Intent().putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", 416));
            } else {
                a(8);
            }
        } else {
            if (intent == null || !intent.hasExtra("com.google.android.gms.ocr.CREDIT_CARD_OCR_RESULT")) {
                a(8);
                throw new IllegalArgumentException("OcrShimChimeraActivity receives successful callback from CREDIT_CARD_OCR, but data is null or data doesn't have EXTRA_CREDIT_CARD_OCR_RESULT field.");
            }
            CreditCardOcrResult creditCardOcrResult = (CreditCardOcrResult) intent.getParcelableExtra("com.google.android.gms.ocr.CREDIT_CARD_OCR_RESULT");
            eiig.y(creditCardOcrResult, "CreditCardOcrResult must be non-nul if the resultCode is RESULT_OK.");
            PaymentCardRecognitionResult paymentCardRecognitionResult = new PaymentCardRecognitionResult();
            paymentCardRecognitionResult.a = creditCardOcrResult.a;
            int i4 = creditCardOcrResult.b;
            if (i4 != -1 && (i3 = creditCardOcrResult.c) != -1) {
                if (i4 > 0 && i4 <= 12) {
                    z = true;
                }
                arwm.b(z);
                paymentCardRecognitionResult.b = new CreditCardExpirationDate(i4, i3);
            }
            arwm.q(paymentCardRecognitionResult.a);
            Intent intent2 = new Intent();
            arxd.l(paymentCardRecognitionResult, intent2, "com.google.android.gms.wallet.PaymentCardRecognitionResult");
            setResult(-1, intent2);
        }
        finish();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_Wallet_Blank);
        super.onCreate(bundle);
        setTitle("");
        if (bundle == null) {
            int i = getIntent().getIntExtra("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", 3) == 3 ? 4 : 3;
            String callingPackage = getCallingPackage();
            String str = null;
            if (!TextUtils.isEmpty(callingPackage)) {
                try {
                    str = assx.b(this).h(callingPackage).toString();
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("OcrShimChimeraActivity", "Failed to find application name.", e);
                }
            }
            String stringExtra = getIntent().getStringExtra("callerPackageName");
            eiig.b(!TextUtils.isEmpty(stringExtra), "The caller package name is absent while creating this PendingIntent.");
            eiig.x(stringExtra);
            int i2 = !stringExtra.equals(callingPackage) ? 414 : TextUtils.isEmpty(str) ? 415 : 0;
            if (i2 != 0) {
                a(i2);
                finish();
                return;
            }
            csft csftVar = new csft(this);
            csftVar.b.addAll(Arrays.asList(Integer.valueOf(i)));
            eiig.x(callingPackage);
            csftVar.e(callingPackage);
            eiig.x(str);
            arwm.c(!TextUtils.isEmpty(str), "A non-empty appLabel is required.");
            csftVar.a.putExtra("com.google.android.gms.ocr.INTEGRATOR_APP_LABEL", str);
            csftVar.g(2);
            startActivityForResult((Intent) Objects.requireNonNull(csftVar.a()), 1001);
        }
    }
}
