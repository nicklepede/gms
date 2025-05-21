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
import defpackage.diez;
import defpackage.difa;
import defpackage.dije;
import defpackage.ding;
import defpackage.ditk;
import defpackage.efdk;
import defpackage.efwo;
import defpackage.ehiw;
import defpackage.ehmk;
import defpackage.emen;
import defpackage.faox;
import defpackage.farn;
import defpackage.fauk;
import defpackage.faup;
import defpackage.feen;
import defpackage.fsvg;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PmRootChimeraActivity extends diez implements View.OnFocusChangeListener {
    public static final /* synthetic */ int h = 0;
    private Toolbar i;
    private View j;
    private SecurePaymentsPayload k;
    private byte[] l;
    private byte[] m;
    private List n;
    private faup o;

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
                this.o = (faup) efdk.c(securePaymentsPayload.a, (feen) faup.a.iB(7, null));
                SecurePaymentsData[] securePaymentsDataArr = securePaymentsPayload.b;
                this.n = new ArrayList(securePaymentsDataArr.length);
                for (SecurePaymentsData securePaymentsData : securePaymentsDataArr) {
                    this.n.add(new ParcelableKeyValue(securePaymentsData.a, securePaymentsData.b));
                }
            }
        }
    }

    @Override // defpackage.diez
    protected final boolean N() {
        ab();
        faup faupVar = this.o;
        if (faupVar != null && faupVar.i.d() > 0) {
            return true;
        }
        Z();
        if (fsvg.d() && this.l != null) {
            return true;
        }
        aa();
        return fsvg.d() && this.m != null;
    }

    @Override // defpackage.diez
    protected final Intent i() {
        BuyFlowConfig l = l();
        Intent intent = getIntent();
        List list = this.n;
        Intent a = dije.a(this, 3, l, intent);
        SecurePaymentsPayload securePaymentsPayload = (SecurePaymentsPayload) intent.getParcelableExtra("com.google.android.gms.wallet.firstparty.SECURE_PAYMENTS_PAYLOAD");
        byte[] bArr = null;
        if (securePaymentsPayload != null) {
            faup faupVar = (faup) efdk.c(securePaymentsPayload.a, (feen) faup.a.iB(7, null));
            if (((faupVar.c == 3 ? (farn) faupVar.d : farn.a).b & 2) != 0) {
                a.putExtra("serverEesBasePath", (faupVar.c == 3 ? (farn) faupVar.d : farn.a).d);
            }
            if ((faupVar.b & 8) != 0) {
                bArr = faupVar.i.M();
            }
        }
        dije.f(a, bArr);
        if (list != null) {
            a.putParcelableArrayListExtra("secureDataArray", new ArrayList<>(list));
        }
        a.putExtra("com.google.android.gms.wallet.firstparty.SUPPORTS_SECURE_PAYMENTS_PAYLOAD_PROTO", intent.getBooleanExtra("com.google.android.gms.wallet.firstparty.SUPPORTS_SECURE_PAYMENTS_PAYLOAD_PROTO", false));
        return a;
    }

    @Override // defpackage.diez, defpackage.pob, defpackage.qdy, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        ditk ditkVar;
        if (Q()) {
            q(bundle, true, 3, emen.FLOW_TYPE_PURCHASE_MANAGER);
            super.onCreate(bundle);
            return;
        }
        Intent intent = getIntent();
        ding.C(this, l(), ding.f, false);
        byte[] bArr = new byte[0];
        ab();
        faup faupVar = this.o;
        if (faupVar != null) {
            fauk faukVar = faupVar.e;
            if (faukVar == null) {
                faukVar = fauk.a;
            }
            ehmk ehmkVar = faukVar.d;
            if (ehmkVar == null) {
                ehmkVar = ehmk.c;
            }
            bArr = ehmkVar.g.M();
        }
        r(bundle, true, 3, emen.FLOW_TYPE_PURCHASE_MANAGER, bArr);
        super.onCreate(bundle);
        difa.b(this);
        setContentView(R.layout.wallet_activity_purchase_manager);
        this.k = (SecurePaymentsPayload) intent.getParcelableExtra("com.google.android.gms.wallet.firstparty.SECURE_PAYMENTS_PAYLOAD");
        Z();
        aa();
        Toolbar toolbar = (Toolbar) findViewById(R.id.purchase_manager_toolbar);
        this.i = toolbar;
        d(toolbar);
        kJ().o(false);
        View findViewById = findViewById(R.id.focus_stealer);
        this.j = findViewById;
        findViewById.setOnFocusChangeListener(this);
        if (((ditk) m()) == null) {
            if (this.k != null) {
                BuyFlowConfig l = l();
                String str = this.a;
                SecurePaymentsPayload securePaymentsPayload = this.k;
                LogContext logContext = this.b;
                ditkVar = new ditk();
                Bundle bZ = ditk.bZ(l, str, logContext);
                bZ.putParcelable("securePaymentsPayload", securePaymentsPayload);
                ditkVar.setArguments(bZ);
            } else if (this.l != null) {
                BuyFlowConfig l2 = l();
                String str2 = this.a;
                byte[] bArr2 = this.l;
                LogContext logContext2 = this.b;
                ditkVar = new ditk();
                Bundle bZ2 = ditk.bZ(l2, str2, logContext2);
                bZ2.putByteArray("encryptedParameters", bArr2);
                ditkVar.setArguments(bZ2);
            } else {
                BuyFlowConfig l3 = l();
                String str3 = this.a;
                byte[] bArr3 = this.m;
                LogContext logContext3 = this.b;
                ditkVar = new ditk();
                Bundle bZ3 = ditk.bZ(l3, str3, logContext3);
                bZ3.putByteArray("unencryptedParameters", bArr3);
                ditkVar.setArguments(bZ3);
            }
            B(ditkVar, R.id.purchase_manager_container);
        }
        ding.A(findViewById(R.id.wallet_root));
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z && view == this.j) {
            efwo.ai(this, view);
        }
    }

    @Override // defpackage.diez, defpackage.djew
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
                    T.putExtra("com.google.android.gms.wallet.firstparty.SECURE_PAYMENTS_PAYLOAD_PROTO", ding.t(securePaymentsPayload).r());
                } else {
                    T.putExtra("com.google.android.gms.wallet.firstparty.SECURE_PAYMENTS_PAYLOAD", securePaymentsPayload);
                }
            }
            String str2 = pmResult.d;
            if (str2 != null) {
                T.putExtra("com.google.android.gms.wallet.firstparty.REAL_PAN", str2);
            }
            faox faoxVar = pmResult.e;
            if (faoxVar != null) {
                T.putExtra("com.google.android.gms.wallet.firstparty.SECURE_DATA_RESULT", faoxVar.r());
            }
            String str3 = pmResult.f;
            if (str3 != null) {
                T.putExtra("com.google.android.gms.wallet.cvnFromServer", str3);
            }
            ehiw ehiwVar = pmResult.g;
            if (ehiwVar != null) {
                T.putExtra("com.google.android.gms.firstparty.EXPIRATION_DATE", ehiwVar.r());
            }
        }
        H(-1, T);
    }
}
