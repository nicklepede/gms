package com.google.android.gms.wallet.selector;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.Toolbar;
import com.google.android.gms.R;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.ui.common.WalletExitResult;
import com.google.android.wallet.clientlog.LogContext;
import defpackage.arwm;
import defpackage.diez;
import defpackage.dikm;
import defpackage.ding;
import defpackage.ditv;
import defpackage.efdk;
import defpackage.eidd;
import defpackage.eidg;
import defpackage.emen;
import defpackage.feay;
import defpackage.feen;
import defpackage.fsye;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class InitializeGenericSelectorRootChimeraActivity extends diez {
    private byte[] h;
    private int i = 1;

    public static Intent Z(Context context, Intent intent, BuyFlowConfig buyFlowConfig) {
        arwm.s(buyFlowConfig);
        arwm.s(buyFlowConfig.b);
        Intent intent2 = new Intent();
        intent2.setClassName(context, "com.google.android.gms.wallet.selector.InitializeGenericSelectorRootActivity");
        intent2.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig);
        intent2.putExtra("com.google.android.gms.wallet.account", buyFlowConfig.b.b);
        if (intent.getExtras() != null) {
            intent2.putExtras(intent.getExtras());
        }
        return intent2;
    }

    @Override // defpackage.diez, defpackage.pob, defpackage.qdy, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        ditv ditvVar;
        ding.C(this, l(), ding.e, true);
        int i = this.i;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        q(bundle, (i2 == 1 || i2 == 2) ? true : i2 != 3 ? fsye.a.a().j() : fsye.a.a().h(), 10, emen.FLOW_TYPE_GENERIC_SELECTOR);
        super.onCreate(bundle);
        this.i = eidd.a(getIntent().getIntExtra("com.google.android.gms.wallet.firstparty.EXTRA_GENERIC_SELECTOR_SCENARIO", 2));
        this.h = getIntent().getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
        if (ding.V(this.i)) {
            arwm.t(this.h, "GenericSelectorParameters are required.");
        }
        if (bundle == null) {
            arwm.l((getIntent().hasExtra("com.google.android.gms.identity.intents.EXTRA_REQUEST") && getIntent().hasExtra("com.google.android.gms.wallet.firstparty.EXTRA_COUNTRY_CODE")) ? false : true);
        }
        setContentView(R.layout.wallet_activity_initialize_generic_selector);
        d((Toolbar) findViewById(R.id.tool_bar));
        kJ().o(true);
        findViewById(R.id.wallet_root);
        if (((ditv) m()) == null) {
            if (getIntent().hasExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN")) {
                byte[] byteArrayExtra = getIntent().getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN");
                BuyFlowConfig l = l();
                int i3 = this.i;
                byte[] bArr = this.h;
                String str = this.a;
                LogContext logContext = this.b;
                if (ding.V(i3)) {
                    arwm.s(bArr);
                }
                arwm.s(byteArrayExtra);
                eidg eidgVar = (eidg) efdk.c(byteArrayExtra, (feen) eidg.a.iB(7, null));
                ditvVar = new ditv();
                Bundle bZ = ditv.bZ(l, str, logContext);
                bZ.putByteArray("genericParameters", bArr);
                efdk.j(bZ, "initializeToken", eidgVar);
                ditvVar.setArguments(bZ);
            } else {
                BuyFlowConfig l2 = l();
                byte[] bArr2 = this.h;
                String str2 = this.a;
                LogContext logContext2 = this.b;
                arwm.s(bArr2);
                ditv ditvVar2 = new ditv();
                Bundle bZ2 = ditv.bZ(l2, str2, logContext2);
                bZ2.putByteArray("genericParameters", bArr2);
                ditvVar2.setArguments(bZ2);
                ditvVar = ditvVar2;
            }
            B(ditvVar, R.id.selector_fragment_holder);
        }
    }

    @Override // defpackage.diez, defpackage.djew
    public final void w(int i) {
        Intent intent = new Intent();
        intent.putExtra("exitAction", 8);
        int i2 = this.i;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 1) {
            intent.putExtra("com.google.android.gms.identity.intents.EXTRA_ERROR_CODE", i);
            intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ERROR_CODE", i);
            H(1, intent);
        } else if (i3 != 3) {
            intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ERROR_CODE", i);
            H(1, intent);
        } else {
            intent.putExtra("com.google.android.gms.identity.intents.EXTRA_ERROR_CODE", i);
            intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ERROR_CODE", i);
            H(1, intent);
        }
    }

    @Override // defpackage.diez, defpackage.djew
    public final void x(WalletExitResult walletExitResult) {
        Intent intent = new Intent();
        intent.putExtra("exitAction", 8);
        if (dikm.a(l().c)) {
            walletExitResult.a().b(intent);
        }
        int i = walletExitResult.e;
        int i2 = this.i;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 1) {
            intent.putExtra("com.google.android.gms.identity.intents.EXTRA_ERROR_CODE", i);
            intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ERROR_CODE", i);
            H(1, intent);
        } else if (i3 != 3) {
            intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ERROR_CODE", i);
            H(1, intent);
        } else {
            intent.putExtra("com.google.android.gms.identity.intents.EXTRA_ERROR_CODE", i);
            intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ERROR_CODE", i);
            H(1, intent);
        }
    }

    @Override // defpackage.diez, defpackage.djew
    public final /* bridge */ /* synthetic */ void z(Parcelable parcelable, boolean z) {
        GenericSelectorResult genericSelectorResult = (GenericSelectorResult) parcelable;
        Intent T = T(z);
        if (genericSelectorResult != null) {
            if (genericSelectorResult.b()) {
                T.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN", genericSelectorResult.f);
            }
            if (genericSelectorResult.c()) {
                T.putExtra("com.google.android.gms.identity.intents.EXTRA_ADDRESS", genericSelectorResult.b);
            }
            if (!genericSelectorResult.c() && !genericSelectorResult.b()) {
                T.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_CUSTOMER_ID", genericSelectorResult.c);
                T.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_NEW_CUSTOMER", genericSelectorResult.d);
                feay feayVar = genericSelectorResult.e;
                if (feayVar != null) {
                    T.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_CUSTOMER_OPTION_TOKEN", feayVar.M());
                }
            }
        }
        H(-1, T);
    }
}
