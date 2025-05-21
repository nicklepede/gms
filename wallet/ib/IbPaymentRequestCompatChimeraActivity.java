package com.google.android.gms.wallet.ib;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Message;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.InstrumentInfo;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.PaymentMethodToken;
import com.google.android.gms.wallet.WebPaymentData;
import com.google.android.gms.wallet.WebPaymentDataRequest;
import com.google.android.gms.wallet.service.ib.LoadFullWalletServiceRequest;
import com.google.android.gms.wallet.service.ib.LoadFullWalletServiceResponse;
import com.google.android.gms.wallet.service.ib.LoadMaskedWalletServiceRequest;
import com.google.android.gms.wallet.service.ib.LoadMaskedWalletServiceResponse;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.arxd;
import defpackage.dies;
import defpackage.dimg;
import defpackage.dirb;
import defpackage.diud;
import defpackage.dixi;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class IbPaymentRequestCompatChimeraActivity extends Activity {
    public static final /* synthetic */ int d = 0;
    private static final String e = dimg.b("ibPaymentRequestCompat");
    FullWallet a;
    MaskedWallet b;
    private BuyFlowConfig f;
    private LoadMaskedWalletServiceRequest g;
    private dimg h;
    private WebPaymentDataRequest i;
    private int j;
    int c = 0;
    private final diud k = new dirb(this);

    private final void e() {
        JSONObject jSONObject;
        JSONArray jSONArray;
        int i = this.c;
        if (i == 0) {
            this.c = 1;
            Message.obtain(a().b.u, 47, this.g).sendToTarget();
            return;
        }
        if (i == 2) {
            this.c = 3;
            FullWalletRequest fullWalletRequest = new FullWalletRequest();
            fullWalletRequest.a = this.b.a;
            fullWalletRequest.c = this.i.a;
            a().b.u(new LoadFullWalletServiceRequest(this.g.a, fullWalletRequest, false));
            return;
        }
        if (i != 4) {
            return;
        }
        this.c = 5;
        try {
            dies a = WebPaymentData.a();
            FullWallet fullWallet = this.a;
            ExecutorService executorService = dixi.a;
            JSONObject jSONObject2 = new JSONObject();
            UserAddress userAddress = fullWallet.h;
            JSONArray jSONArray2 = null;
            if (userAddress == null) {
                jSONObject = null;
            } else {
                jSONObject = new JSONObject();
                jSONObject.put("address1", userAddress.b).put("address2", userAddress.c).put("address3", userAddress.d).put("address4", userAddress.e).put("address5", userAddress.f).put("administrativeArea", userAddress.g).put("companyName", userAddress.n).put("countryCode", userAddress.i).put("locality", userAddress.h).put("name", userAddress.a).put("postalCode", userAddress.j).put("sortingCode", userAddress.k);
            }
            JSONObject put = jSONObject2.put("billingAddress", jSONObject);
            InstrumentInfo[] instrumentInfoArr = fullWallet.j;
            if (instrumentInfoArr == null) {
                jSONArray = null;
            } else {
                jSONArray = new JSONArray();
                for (InstrumentInfo instrumentInfo : instrumentInfoArr) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("instrumentType", instrumentInfo.a).put("instrumentDetails", instrumentInfo.b);
                    jSONArray.put(jSONObject3);
                }
            }
            JSONObject put2 = put.put("instrumentInfos", jSONArray);
            String[] strArr = fullWallet.g;
            if (strArr != null && (strArr.length) != 0) {
                jSONArray2 = new JSONArray();
                for (String str : strArr) {
                    jSONArray2.put(str);
                }
            }
            put2.put("paymentDescriptions", jSONArray2);
            PaymentMethodToken paymentMethodToken = fullWallet.k;
            if (paymentMethodToken != null) {
                jSONObject2.put("paymentMethodToken", paymentMethodToken.b);
            }
            a.a(jSONObject2.toString());
            WebPaymentData webPaymentData = a.a;
            Intent intent = new Intent();
            WebPaymentData.c(intent, webPaymentData);
            f(-1, intent);
        } catch (JSONException unused) {
            d(8);
        }
    }

    private final void f(int i, Intent intent) {
        setResult(i, intent);
        finish();
    }

    private final void g() {
        if (this.j == -1) {
            this.j = a().b.a(this.k);
        }
    }

    final dimg a() {
        if (this.h == null) {
            this.h = (dimg) getSupportFragmentManager().findFragmentByTag(e);
        }
        return this.h;
    }

    public final void b(LoadFullWalletServiceResponse loadFullWalletServiceResponse) {
        Bundle bundle = loadFullWalletServiceResponse.a;
        ConnectionResult connectionResult = new ConnectionResult(loadFullWalletServiceResponse.c, bundle != null ? (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT") : null);
        if (connectionResult.b()) {
            try {
                connectionResult.a(getContainerActivity(), 502);
                return;
            } catch (IntentSender.SendIntentException unused) {
                d(8);
                return;
            }
        }
        FullWallet fullWallet = loadFullWalletServiceResponse.b;
        if (fullWallet == null) {
            d(loadFullWalletServiceResponse.c);
            return;
        }
        this.a = fullWallet;
        this.c = 4;
        e();
    }

    public final void c(LoadMaskedWalletServiceResponse loadMaskedWalletServiceResponse) {
        Bundle bundle = loadMaskedWalletServiceResponse.a;
        ConnectionResult connectionResult = new ConnectionResult(loadMaskedWalletServiceResponse.c, bundle != null ? (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT") : null);
        if (connectionResult.b()) {
            try {
                connectionResult.a(getContainerActivity(), 501);
                return;
            } catch (IntentSender.SendIntentException unused) {
                d(8);
                return;
            }
        }
        MaskedWallet maskedWallet = loadMaskedWalletServiceResponse.b;
        if (maskedWallet == null) {
            d(loadMaskedWalletServiceResponse.c);
            return;
        }
        this.b = maskedWallet;
        this.c = 2;
        e();
    }

    public final void d(int i) {
        Intent intent = new Intent();
        intent.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", i);
        f(1, intent);
    }

    @Override // defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 501) {
            if (i2 == -1) {
                this.b = (MaskedWallet) intent.getParcelableExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET");
                this.c = 2;
                e();
                return;
            } else if (i2 == 0) {
                f(0, null);
                return;
            } else {
                d(intent != null ? intent.getIntExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", 8) : 8);
                return;
            }
        }
        if (i != 502) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        if (i2 == -1) {
            this.a = (FullWallet) intent.getParcelableExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET");
            this.c = 4;
            e();
        } else if (i2 == 0) {
            f(0, null);
        } else {
            d(intent != null ? intent.getIntExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", 8) : 8);
        }
    }

    @Override // defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_Wallet_No_Display);
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f = (BuyFlowConfig) intent.getParcelableExtra("com.google.android.gms.wallet.buyFlowConfig");
        this.i = (WebPaymentDataRequest) arxd.b(intent, "webPaymentDataRequest", WebPaymentDataRequest.CREATOR);
        this.g = (LoadMaskedWalletServiceRequest) intent.getParcelableExtra("loadMaskedWalletServiceRequest");
        if (bundle != null) {
            this.c = bundle.getInt("state");
            this.j = bundle.getInt("serviceConnectionSavePoint");
            this.b = (MaskedWallet) bundle.getParcelable("maskedWallet");
            this.a = (FullWallet) bundle.getParcelable("fullWallet");
        } else {
            this.c = 0;
            this.j = -1;
        }
        if (a() == null) {
            BuyFlowConfig buyFlowConfig = this.f;
            this.h = dimg.a(8, buyFlowConfig, buyFlowConfig.b.b);
            getSupportFragmentManager().beginTransaction().add(this.h, e).commit();
        }
        setFinishOnTouchOutside(false);
    }

    @Override // defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onPause() {
        super.onPause();
        g();
    }

    @Override // defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        super.onResume();
        a().b.d(this.k, this.j);
        this.j = -1;
        e();
    }

    @Override // defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        g();
        bundle.putInt("state", this.c);
        bundle.putInt("serviceConnectionSavePoint", this.j);
        MaskedWallet maskedWallet = this.b;
        if (maskedWallet != null) {
            bundle.putParcelable("maskedWallet", maskedWallet);
        }
        FullWallet fullWallet = this.a;
        if (fullWallet != null) {
            bundle.putParcelable("fullWallet", fullWallet);
        }
    }
}
