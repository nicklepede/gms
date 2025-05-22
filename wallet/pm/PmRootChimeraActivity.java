package com.google.android.gms.wallet.pm;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.gms.wallet.firstparty.pm.SecurePaymentsData;
import com.google.android.gms.wallet.firstparty.pm.SecurePaymentsPayload;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.bender3.framework.client.ParcelableKeyValue;
import com.google.android.wallet.clientlog.LogContext;
import defpackage.dkqk;
import defpackage.dkql;
import defpackage.dkuo;
import defpackage.dkyr;
import defpackage.dlev;
import defpackage.ehqn;
import defpackage.eijr;
import defpackage.ejwc;
import defpackage.ejzq;
import defpackage.eosb;
import defpackage.fddm;
import defpackage.fdgc;
import defpackage.fdiz;
import defpackage.fdje;
import defpackage.fgtg;
import defpackage.fvra;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class PmRootChimeraActivity extends dkqk implements View.OnFocusChangeListener {
    public static final /* synthetic */ int h = 0;
    private Toolbar i;
    private View j;
    private SecurePaymentsPayload k;
    private byte[] l;
    private byte[] m;
    private List n;
    private fdje o;

    private final void Z() {
        if (this.l == null) {
            this.l = getIntent().getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
        }
    }

    private final void aa() {
        if (this.m == null) {
            this.m = getIntent().getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS");
        }
    }

    private final void ab() {
        if (this.o == null) {
            SecurePaymentsPayload securePaymentsPayload = (SecurePaymentsPayload) getIntent().getParcelableExtra("com.google.android.gms.wallet.firstparty.SECURE_PAYMENTS_PAYLOAD");
            this.k = securePaymentsPayload;
            if (securePaymentsPayload != null) {
                this.o = (fdje) ehqn.c(securePaymentsPayload.a, (fgtg) fdje.a.iQ(7, null));
                SecurePaymentsData[] securePaymentsDataArr = securePaymentsPayload.b;
                this.n = new ArrayList(securePaymentsDataArr.length);
                for (SecurePaymentsData securePaymentsData : securePaymentsDataArr) {
                    this.n.add(new ParcelableKeyValue(securePaymentsData.a, securePaymentsData.b));
                }
            }
        }
    }

    @Override // defpackage.dkqk
    protected final boolean N() {
        ab();
        fdje fdjeVar = this.o;
        if (fdjeVar != null && fdjeVar.i.d() > 0) {
            return true;
        }
        Z();
        if (fvra.d() && this.l != null) {
            return true;
        }
        aa();
        return fvra.d() && this.m != null;
    }

    @Override // defpackage.dkqk
    protected final Intent i() {
        BuyFlowConfig l = l();
        Intent intent = getIntent();
        List list = this.n;
        Intent a = dkuo.a(this, 3, l, intent);
        SecurePaymentsPayload securePaymentsPayload = (SecurePaymentsPayload) intent.getParcelableExtra("com.google.android.gms.wallet.firstparty.SECURE_PAYMENTS_PAYLOAD");
        byte[] bArr = null;
        if (securePaymentsPayload != null) {
            fdje fdjeVar = (fdje) ehqn.c(securePaymentsPayload.a, (fgtg) fdje.a.iQ(7, null));
            if (((fdjeVar.c == 3 ? (fdgc) fdjeVar.d : fdgc.a).b & 2) != 0) {
                a.putExtra("serverEesBasePath", (fdjeVar.c == 3 ? (fdgc) fdjeVar.d : fdgc.a).d);
            }
            if ((fdjeVar.b & 8) != 0) {
                bArr = fdjeVar.i.M();
            }
        }
        dkuo.f(a, bArr);
        if (list != null) {
            a.putParcelableArrayListExtra("secureDataArray", new ArrayList<>(list));
        }
        a.putExtra("com.google.android.gms.wallet.firstparty.SUPPORTS_SECURE_PAYMENTS_PAYLOAD_PROTO", intent.getBooleanExtra("com.google.android.gms.wallet.firstparty.SUPPORTS_SECURE_PAYMENTS_PAYLOAD_PROTO", false));
        return a;
    }

    @Override // defpackage.dkqk, defpackage.rhf, defpackage.rxc, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        dlev dlevVar;
        if (Q()) {
            q(bundle, true, 3, eosb.FLOW_TYPE_PURCHASE_MANAGER);
            super.onCreate(bundle);
            return;
        }
        Intent intent = getIntent();
        dkyr.C(this, l(), dkyr.f, false);
        byte[] bArr = new byte[0];
        ab();
        fdje fdjeVar = this.o;
        if (fdjeVar != null) {
            fdiz fdizVar = fdjeVar.e;
            if (fdizVar == null) {
                fdizVar = fdiz.a;
            }
            ejzq ejzqVar = fdizVar.d;
            if (ejzqVar == null) {
                ejzqVar = ejzq.c;
            }
            bArr = ejzqVar.g.M();
        }
        r(bundle, true, 3, eosb.FLOW_TYPE_PURCHASE_MANAGER, bArr);
        super.onCreate(bundle);
        dkql.b(this);
        setContentView(R.layout.wallet_activity_purchase_manager);
        this.k = (SecurePaymentsPayload) intent.getParcelableExtra("com.google.android.gms.wallet.firstparty.SECURE_PAYMENTS_PAYLOAD");
        Z();
        aa();
        Toolbar toolbar = (Toolbar) findViewById(R.id.purchase_manager_toolbar);
        this.i = toolbar;
        d(toolbar);
        kY().o(false);
        View findViewById = findViewById(R.id.focus_stealer);
        this.j = findViewById;
        findViewById.setOnFocusChangeListener(this);
        if (((dlev) m()) == null) {
            if (this.k != null) {
                BuyFlowConfig l = l();
                String str = this.a;
                SecurePaymentsPayload securePaymentsPayload = this.k;
                LogContext logContext = this.b;
                dlevVar = new dlev();
                Bundle bY = dlev.bY(l, str, logContext);
                bY.putParcelable("securePaymentsPayload", securePaymentsPayload);
                dlevVar.setArguments(bY);
            } else if (this.l != null) {
                BuyFlowConfig l2 = l();
                String str2 = this.a;
                byte[] bArr2 = this.l;
                LogContext logContext2 = this.b;
                dlevVar = new dlev();
                Bundle bY2 = dlev.bY(l2, str2, logContext2);
                bY2.putByteArray("encryptedParameters", bArr2);
                dlevVar.setArguments(bY2);
            } else {
                BuyFlowConfig l3 = l();
                String str3 = this.a;
                byte[] bArr3 = this.m;
                LogContext logContext3 = this.b;
                dlevVar = new dlev();
                Bundle bY3 = dlev.bY(l3, str3, logContext3);
                bY3.putByteArray("unencryptedParameters", bArr3);
                dlevVar.setArguments(bY3);
            }
            B(dlevVar, R.id.purchase_manager_container);
        }
        dkyr.A(findViewById(R.id.wallet_root));
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z && view == this.j) {
            eijr.ai(this, view);
        }
    }

    @Override // defpackage.dkqk, defpackage.dlqp
    public final /* bridge */ /* synthetic */ void z(Parcelable parcelable, boolean z) {
        PmResult pmResult = (PmResult) parcelable;
        Intent T = T(z);
        if (pmResult != null) {
            String str = pmResult.b;
            if (!TextUtils.isEmpty(str)) {
                T.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ORDER_ID", str);
            }
            byte[] bArr = pmResult.c;
            if (bArr != null && bArr.length > 0) {
                T.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN", bArr);
            }
            SecurePaymentsPayload securePaymentsPayload = pmResult.a;
            if (securePaymentsPayload != null) {
                if (getIntent().getBooleanExtra("com.google.android.gms.wallet.firstparty.SUPPORTS_SECURE_PAYMENTS_PAYLOAD_PROTO", false)) {
                    T.putExtra("com.google.android.gms.wallet.firstparty.SECURE_PAYMENTS_PAYLOAD_PROTO", dkyr.t(securePaymentsPayload).r());
                } else {
                    T.putExtra("com.google.android.gms.wallet.firstparty.SECURE_PAYMENTS_PAYLOAD", securePaymentsPayload);
                }
            }
            String str2 = pmResult.d;
            if (str2 != null) {
                T.putExtra("com.google.android.gms.wallet.firstparty.REAL_PAN", str2);
            }
            fddm fddmVar = pmResult.e;
            if (fddmVar != null) {
                T.putExtra("com.google.android.gms.wallet.firstparty.SECURE_DATA_RESULT", fddmVar.r());
            }
            String str3 = pmResult.f;
            if (str3 != null) {
                T.putExtra("com.google.android.gms.wallet.cvnFromServer", str3);
            }
            ejwc ejwcVar = pmResult.g;
            if (ejwcVar != null) {
                T.putExtra("com.google.android.gms.firstparty.EXPIRATION_DATE", ejwcVar.r());
            }
        }
        H(-1, T);
    }
}
