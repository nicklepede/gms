package com.google.android.gms.wallet.ib;

import android.accounts.Account;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import com.google.android.chimera.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.Cart;
import com.google.android.gms.wallet.WebPaymentData;
import com.google.android.gms.wallet.WebPaymentDataRequest;
import com.google.android.gms.wallet.service.ib.LoadWebPaymentDataServiceRequest;
import com.google.android.gms.wallet.service.ib.LoadWebPaymentDataServiceResponse;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.a;
import defpackage.dkqf;
import defpackage.dkxr;
import defpackage.dlck;
import defpackage.dlcl;
import defpackage.dlfo;
import defpackage.ekvl;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class IbLoadWebPaymentDataChimeraActivity extends Activity {
    public static final /* synthetic */ int d = 0;
    private static final String e = dkxr.b("ibPaymentRequestCompat");
    BuyFlowConfig b;
    WebPaymentData c;
    private dkxr f;
    private int g;
    int a = 0;
    private final dlfo h = new dlck(this);

    private final void c() {
        int i = this.a;
        int i2 = 3;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException(a.j(i, "Unknown processing state: "));
                }
                this.a = 3;
                Intent intent = new Intent();
                Bundle extras = getIntent().getExtras();
                ekvl.y(extras);
                Bundle bundle = extras.getBundle("methodData");
                ekvl.y(bundle);
                String str = "https://google.com/pay";
                if (!bundle.containsKey("https://google.com/pay") && bundle.containsKey("https://pay.google.com/authentication")) {
                    str = "https://pay.google.com/authentication";
                }
                intent.putExtra("methodName", str);
                WebPaymentData webPaymentData = this.c;
                if (webPaymentData != null) {
                    intent.putExtra("details", webPaymentData.a);
                }
                setResult(-1, intent);
                finish();
                return;
            }
            return;
        }
        this.a = 1;
        try {
            Bundle extras2 = getIntent().getExtras();
            BuyFlowConfig buyFlowConfig = this.b;
            Bundle bundle2 = new Bundle();
            JSONObject a = dlcl.a(extras2);
            if (!a.has("environment") || !a.getString("environment").equals("TEST")) {
                i2 = 1;
            }
            bundle2.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", i2);
            bundle2.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", true);
            bundle2.putString("androidPackageName", buyFlowConfig.c);
            Account account = buyFlowConfig.b.b;
            if (account != null) {
                bundle2.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", account);
            }
            bundle2.putInt("com.google.android.gms.wallet.EXTRA_THEME", buyFlowConfig.b.e);
            ekvl.y(extras2);
            dkqf a2 = WebPaymentDataRequest.a();
            a2.c(true);
            Object obj = extras2.get("paymentRequestOrigin");
            ekvl.y(obj);
            String obj2 = obj.toString();
            Object obj3 = extras2.get("topLevelOrigin");
            ekvl.y(obj3);
            String obj4 = obj3.toString();
            Object obj5 = extras2.get("total");
            ekvl.y(obj5);
            JSONObject jSONObject = new JSONObject(obj5.toString());
            ekvl.r(jSONObject.has("currency") && jSONObject.has("value"), "cartJsonObject should have currency and value.");
            a2.d(dlcl.a(extras2).toString());
            if (true == obj2.startsWith("about:")) {
                obj2 = obj4;
            }
            a2.b(obj2);
            Cart cart = new Cart();
            cart.b = jSONObject.getString("currency");
            cart.a = jSONObject.getString("value");
            a2.a(cart);
            Message.obtain(a().b.u, 66, new LoadWebPaymentDataServiceRequest(bundle2, a2.a)).sendToTarget();
        } catch (IllegalStateException | NullPointerException | JSONException e2) {
            Log.e("IbLpdActivity", "Failed to loadWebPaymentData", e2);
            setResult(0);
            finish();
        }
    }

    private final void d(int i) {
        Intent intent = new Intent();
        intent.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", i);
        e(1, intent);
    }

    private final void e(int i, Intent intent) {
        setResult(i, intent);
        finish();
    }

    private final void f() {
        if (this.g == -1) {
            this.g = a().b.a(this.h);
        }
    }

    final dkxr a() {
        if (this.f == null) {
            this.f = (dkxr) getSupportFragmentManager().findFragmentByTag(e);
        }
        return this.f;
    }

    public final void b(LoadWebPaymentDataServiceResponse loadWebPaymentDataServiceResponse) {
        Status status = loadWebPaymentDataServiceResponse.c;
        if (!status.d()) {
            Log.e("IbLpdActivity", "No response from LoadWebPaymentAction");
            d(loadWebPaymentDataServiceResponse.c.i);
        } else {
            try {
                status.c(getContainerActivity(), 1001);
            } catch (IntentSender.SendIntentException unused) {
                d(8);
            }
        }
    }

    @Override // defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1001) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        if (i2 == -1) {
            this.c = WebPaymentData.b(intent);
            this.a = 2;
            c();
        } else if (i2 == 0) {
            e(0, null);
        } else {
            d(8);
        }
    }

    @Override // defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b = (BuyFlowConfig) getIntent().getParcelableExtra("com.google.android.gms.wallet.buyFlowConfig");
        if (bundle != null) {
            this.a = bundle.getInt("processingState");
            this.g = bundle.getInt("serviceConnectionSavePoint");
            this.c = (WebPaymentData) bundle.getParcelable("webPaymentDataFromResponse");
        } else {
            this.a = 0;
            this.g = -1;
        }
        if (a() == null) {
            String.valueOf(this.b.b.b);
            BuyFlowConfig buyFlowConfig = this.b;
            this.f = dkxr.a(8, buyFlowConfig, buyFlowConfig.b.b);
            getSupportFragmentManager().beginTransaction().add(this.f, e).commit();
        }
    }

    @Override // defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onPause() {
        super.onPause();
        f();
    }

    @Override // defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        a().b.d(this.h, this.g);
        this.g = -1;
        c();
    }

    @Override // defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        f();
        bundle.putInt("processingState", this.a);
        bundle.putInt("serviceConnectionSavePoint", this.g);
        WebPaymentData webPaymentData = this.c;
        if (webPaymentData != null) {
            bundle.putParcelable("webPaymentDataFromResponse", webPaymentData);
        }
    }
}
