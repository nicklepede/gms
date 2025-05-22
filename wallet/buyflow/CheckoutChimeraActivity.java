package com.google.android.gms.wallet.buyflow;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.wallet.analytics.events.OrchestrationClosedEvent;
import com.google.android.gms.wallet.common.ui.BottomSheetView;
import com.google.android.gms.wallet.common.ui.PopoverView;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import com.google.android.gms.wallet.intentoperation.AnalyticsIntentOperation;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.ui.common.WalletExitResult;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.a;
import defpackage.atzb;
import defpackage.dkqk;
import defpackage.dksm;
import defpackage.dkva;
import defpackage.dkvx;
import defpackage.dkwk;
import defpackage.dkxa;
import defpackage.dkxd;
import defpackage.dkxo;
import defpackage.dkxq;
import defpackage.dkyr;
import defpackage.dkzu;
import defpackage.dlpc;
import defpackage.dlpe;
import defpackage.dlqw;
import defpackage.ehnw;
import defpackage.ehqn;
import defpackage.eihd;
import defpackage.eihe;
import defpackage.ejyg;
import defpackage.eoqn;
import defpackage.eoqq;
import defpackage.eort;
import defpackage.eoru;
import defpackage.eosb;
import defpackage.fddh;
import defpackage.fgrc;
import defpackage.fgru;
import defpackage.fgsa;
import defpackage.fgtg;
import defpackage.fvra;
import defpackage.fvtp;
import defpackage.fvts;
import defpackage.fvty;
import defpackage.ikv;
import defpackage.ioj;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class CheckoutChimeraActivity extends dkqk implements dkxo, eihd, dkxd {
    int h;
    eihe i;
    PopoverView j;
    BottomSheetView k;
    Toolbar l;
    private boolean m;

    static int Z(Context context, BuyFlowConfig buyFlowConfig) {
        WalletCustomTheme walletCustomTheme = buyFlowConfig.b.f;
        boolean z = walletCustomTheme != null && walletCustomTheme.d().getInt("windowTransitionsStyle", -1) == 4;
        boolean z2 = dkyr.K(context.getResources()) && fvts.c();
        boolean a = fvtp.a.lK().a();
        if (z && z2) {
            return 2;
        }
        if (z) {
            return 3;
        }
        if (z2) {
            return 1;
        }
        return a ? 4 : 0;
    }

    public static Intent aa(Context context, Intent intent, BuyFlowConfig buyFlowConfig) {
        atzb.s(buyFlowConfig);
        atzb.s(buyFlowConfig.b);
        atzb.b(!buyFlowConfig.b.d);
        Intent intent2 = new Intent();
        intent2.setClassName(context, "com.google.android.gms.wallet.buyflow.CheckoutActivity");
        intent2.putExtras(intent.getExtras());
        intent2.setAction("com.google.android.gms.wallet.ACTION_CHECKOUT");
        intent2.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig);
        int Z = Z(context, buyFlowConfig);
        if (Z != 2 && Z != 3 && Z != 4) {
            intent2.addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE);
        }
        return intent2;
    }

    private static int am(ejyg ejygVar) {
        if (ejygVar == null) {
            return -1;
        }
        if ((ejygVar.c & 512) != 0) {
            return ejygVar.n;
        }
        fddh fddhVar = ejygVar.p;
        if (fddhVar == null) {
            fddhVar = fddh.a;
        }
        if ((fddhVar.b & 1) == 0) {
            return -1;
        }
        fddh fddhVar2 = ejygVar.p;
        if (fddhVar2 == null) {
            fddhVar2 = fddh.a;
        }
        return fddhVar2.c;
    }

    private static int an(ejyg ejygVar) {
        if (ejygVar == null) {
            return -1;
        }
        if ((ejygVar.c & 1024) != 0) {
            return ejygVar.o;
        }
        fddh fddhVar = ejygVar.p;
        if (fddhVar == null) {
            fddhVar = fddh.a;
        }
        if ((fddhVar.b & 2) == 0) {
            return -1;
        }
        fddh fddhVar2 = ejygVar.p;
        if (fddhVar2 == null) {
            fddhVar2 = fddh.a;
        }
        return fddhVar2.d;
    }

    private final ejyg ao() {
        if (getIntent().getExtras().containsKey("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS")) {
            return (ejyg) ehqn.b(getIntent(), "com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS", (fgtg) ejyg.b.iQ(7, null));
        }
        if (getIntent().getExtras().containsKey("com.google.android.gms.wallet.firstparty.EXTRA_CLIENT_PARAMETERS")) {
            return (ejyg) ehqn.b(getIntent(), "com.google.android.gms.wallet.firstparty.EXTRA_CLIENT_PARAMETERS", (fgtg) ejyg.b.iQ(7, null));
        }
        return null;
    }

    private final void ap() {
        dkva aA;
        if (!dlpe.a(this)) {
            if (this.i != null) {
                getSupportFragmentManager().beginTransaction().remove(this.i).commit();
            }
            eihe d = eihe.d();
            this.i = d;
            d.a = this;
            d.show(getSupportFragmentManager(), "CheckoutChimeraActivity.NETWORK_ERROR_DIALOG");
            return;
        }
        if (!this.m) {
            this.m = true;
            getSupportFragmentManager().beginTransaction().add(dkxq.a(ll(), dlpc.e(l().b)), "RetrieveAuthTokensFragment").commit();
        }
        Intent intent = getIntent();
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_AUTH_TOKEN");
        if (intent.getExtras().containsKey("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN")) {
            aA = dkva.az(intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN"), null, null, byteArrayExtra, l(), this.a, null, this.b);
        } else {
            if (!intent.getExtras().containsKey("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS")) {
                throw new IllegalArgumentException("CheckoutChimeraActivity requires either buyflow params or InitializeResponse token");
            }
            aA = dkva.aA(intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS"), intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS"), byteArrayExtra, l(), this.a, null, this.b);
        }
        B(aA, R.id.popover_content_holder);
    }

    private final void aq(int i) {
        Intent au = au(5, i, 9, false);
        au.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ERROR_CODE", i);
        setResult(1, au);
        finish();
    }

    private final void ar(WalletExitResult walletExitResult) {
        Intent au = au(4, 0, walletExitResult.c(), false);
        if (dkvx.a(l().c)) {
            walletExitResult.a().b(au);
        }
        setResult(0, au);
        finish();
    }

    private static boolean as(dkzu dkzuVar, int i, int i2, List list) {
        if (!dkzuVar.b.isEmpty() && !dkzuVar.b.contains(Integer.valueOf(i))) {
            return false;
        }
        if (dkzuVar.c.isEmpty() || dkzuVar.c.contains(Integer.valueOf(i2))) {
            return dkzuVar.d.isEmpty() || !Collections.disjoint(dkzuVar.d, list);
        }
        return false;
    }

    private final boolean at() {
        return l().b.j == 1;
    }

    private final Intent au(int i, int i2, int i3, boolean z) {
        Intent T = T(z);
        eoru b = AnalyticsIntentOperation.b(this, new OrchestrationClosedEvent(i, i2, i3, ll() != null ? ll().name : "", this.a));
        if (b != null) {
            for (eort eortVar : b.b) {
                eoqn eoqnVar = eortVar.i;
                if (eoqnVar == null) {
                    eoqnVar = eoqn.a;
                }
                if (eoqnVar.e.size() != 0) {
                    eoqn eoqnVar2 = eortVar.i;
                    if (eoqnVar2 == null) {
                        eoqnVar2 = eoqn.a;
                    }
                    for (eoqq eoqqVar : eoqnVar2.e) {
                        fgrc fgrcVar = (fgrc) eoqqVar.iQ(5, null);
                        fgrcVar.X(eoqqVar);
                        if (!fgrcVar.b.L()) {
                            fgrcVar.U();
                        }
                        eoqq eoqqVar2 = (eoqq) fgrcVar.b;
                        eoqq eoqqVar3 = eoqq.a;
                        eoqqVar2.b &= -9;
                        eoqqVar2.f = eoqq.a.f;
                    }
                }
            }
        }
        ehqn.k(T, "com.google.android.gms.wallet.firstparty.EXTRA_ANALYTICS_PROTO", b);
        byte[] bArr = this.c;
        if (bArr != null && bArr.length > 0) {
            T.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_SERVER_ANALYTICS_TOKEN", bArr);
        }
        ehnw.r(this.b, dkwk.a(i), i2);
        return T;
    }

    private final void av(int i) {
        setResult(0, au(4, 0, i, false));
        finish();
    }

    @Override // defpackage.dkqk
    protected final boolean N() {
        ejyg ao;
        if (l() != null && (ao = ao()) != null) {
            int an = an(ao);
            int am = am(ao);
            fddh fddhVar = ao.p;
            if (fddhVar == null) {
                fddhVar = fddh.a;
            }
            fgru fgruVar = fddhVar.e;
            fgsa fgsaVar = fvra.b().b;
            int size = fgsaVar.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (!as((dkzu) fgsaVar.get(i), am, an, fgruVar)) {
                    i++;
                } else if (getIntent().getExtras().containsKey("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS")) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.dkqk
    protected final void U() {
        ejyg ao;
        if (!fvty.a.lK().g() || (ao = ao()) == null) {
            return;
        }
        int an = an(ao);
        int am = am(ao);
        fddh fddhVar = ao.p;
        if (fddhVar == null) {
            fddhVar = fddh.a;
        }
        fgru fgruVar = fddhVar.e;
        fgsa fgsaVar = fvra.b().b;
        int size = fgsaVar.size();
        Integer[] numArr = new Integer[size];
        for (int i = 0; i < size; i++) {
            dkzu dkzuVar = (dkzu) fgsaVar.get(i);
            if (as(dkzuVar, am, an, fgruVar)) {
                numArr[i] = Integer.valueOf(dkzuVar.e);
            } else {
                numArr[i] = Integer.valueOf(dkzuVar.f);
            }
        }
        ehnw.h(this.b, 1L, numArr);
    }

    @Override // defpackage.dkqk, defpackage.dlqp
    public final void X(int i) {
        if (this.j != null) {
            if (dkyr.K(getResources())) {
                av(i);
                return;
            } else {
                this.j.p(i);
                return;
            }
        }
        if (this.k == null) {
            av(i);
            return;
        }
        ab();
        findViewById(R.id.bottom_sticky_button_container).setVisibility(8);
        this.k.f(i);
    }

    final void ab() {
        this.l.setVisibility(4);
        getWindow().getDecorView().setBackgroundColor(0);
        getWindow().setStatusBarColor(0);
    }

    @Override // defpackage.dkxo
    public final void ac() {
        av(8);
    }

    @Override // defpackage.dkxo
    public final void ad(int i) {
        aq(-1);
    }

    @Override // defpackage.dkxo
    public final void ae() {
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("RetrieveAuthTokensFragment");
        if (findFragmentByTag != null) {
            getSupportFragmentManager().beginTransaction().remove(findFragmentByTag).commit();
        }
    }

    @Override // defpackage.dkxd
    public final void af(WalletExitResult walletExitResult) {
        ar(walletExitResult);
    }

    @Override // defpackage.dkxd
    public final void ag() {
        if (this.k != null) {
            kY().C();
            int[] iArr = {android.R.attr.colorBackground, R.attr.colorPrimaryDark};
            Arrays.sort(iArr);
            TypedArray obtainStyledAttributes = obtainStyledAttributes(iArr);
            int color = obtainStyledAttributes.getColor(Arrays.binarySearch(iArr, android.R.attr.colorBackground), -1);
            int color2 = obtainStyledAttributes.getColor(Arrays.binarySearch(iArr, R.attr.colorPrimaryDark), -16777216);
            obtainStyledAttributes.recycle();
            getWindow().getDecorView().setBackgroundColor(color);
            getWindow().setStatusBarColor(color2);
        }
    }

    @Override // defpackage.dkxd
    public final void ah() {
        if (m() != null) {
            ((dkva) m()).al();
        }
    }

    @Override // defpackage.dkxd
    public final void ai() {
        dlqw b = WalletExitResult.b();
        b.c(0);
        b.d(401);
        b.b(3);
        A(b.a);
    }

    public final void aj(boolean z) {
        View findViewById;
        if (!at() || (findViewById = findViewById(R.id.initialize_progress_spinner)) == null) {
            return;
        }
        findViewById.setVisibility(true != z ? 8 : 0);
    }

    @Override // defpackage.eihd
    public final void ak(int i, int i2) {
        if (i2 != 1000) {
            Log.e("CheckoutChimeraActivity", a.j(i2, "Unknown error dialog error code: "));
            aq(-1);
        } else if (i != 1) {
            av(7);
        } else {
            ap();
        }
    }

    @Override // defpackage.dkxd
    public final void al(int i) {
        av(i);
    }

    @Override // defpackage.dkqk
    protected final int e() {
        return am(ao());
    }

    @Override // defpackage.dkqk, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void finish() {
        super.finish();
        if (this.h == 3) {
            overridePendingTransition(0, dkyr.c(l()));
        }
    }

    @Override // defpackage.dkqk
    protected final int g() {
        return an(ao());
    }

    @Override // defpackage.dkqk
    protected final Intent i() {
        return dksm.i(this, 1, getIntent().getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS"), getIntent().getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS"), l(), getIntent().getLongExtra("com.google.android.gms.wallet.intentBuildTimeMs", 0L));
    }

    @Override // defpackage.dkqk, defpackage.rhf, defpackage.rxc, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        BuyFlowConfig l = l();
        if (!Q()) {
            int Z = Z(this, l);
            this.h = Z;
            dkyr.C(this, l, (Z == 1 || Z == 2 || Z == 3) ? dkyr.e : Z != 4 ? dkyr.b : dkyr.c, true);
        }
        q(bundle, true, 1, eosb.FLOW_TYPE_BUYFLOW);
        super.onCreate(bundle);
        if (Q()) {
            return;
        }
        int i = this.h;
        if (i == 1 || i == 2 || i == 3) {
            setContentView(R.layout.wallet_activity_checkout_fullscreen);
            Toolbar toolbar = (Toolbar) findViewById(R.id.buyflow_toolbar);
            this.l = toolbar;
            d(toolbar);
        } else if (i != 4) {
            setContentView(R.layout.wallet_activity_checkout);
            TypedArray obtainStyledAttributes = obtainStyledAttributes(new int[]{R.attr.colorWalletActionBarForeground});
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            Resources resources = getResources();
            Resources.Theme theme = getTheme();
            ThreadLocal threadLocal = ioj.a;
            Drawable drawable = resources.getDrawable(2131233324, theme);
            if (color != 0 && drawable != null) {
                drawable.setTint(color);
                kY().w(drawable);
                kY().u(R.string.close_button_label);
            }
        } else {
            setContentView(R.layout.wallet_activity_checkout_bottom_sheet);
            Toolbar toolbar2 = (Toolbar) findViewById(R.id.buyflow_toolbar);
            this.l = toolbar2;
            d(toolbar2);
            ab();
        }
        kY().o(true);
        BottomSheetView bottomSheetView = (BottomSheetView) findViewById(R.id.bottom_sheet);
        this.k = bottomSheetView;
        if (bottomSheetView != null) {
            boolean at = at();
            double d = l.b.h;
            if (at) {
                bottomSheetView.setVisibility(8);
            }
            bottomSheetView.f = d;
            bottomSheetView.i = new BottomSheetBehavior();
            ((ikv) bottomSheetView.getLayoutParams()).b(bottomSheetView.i);
            bottomSheetView.i.A(new dkxa(bottomSheetView));
            bottomSheetView.i.H(4);
            bottomSheetView.i.E(false);
            this.k.k = this;
        }
        PopoverView popoverView = (PopoverView) findViewById(R.id.popover);
        this.j = popoverView;
        if (popoverView != null) {
            if (at()) {
                this.j.setVisibility(8);
            }
            PopoverView.c(this);
            PopoverView popoverView2 = this.j;
            popoverView2.f = this;
            ApplicationParameters applicationParameters = l.b;
            popoverView2.j(applicationParameters.h, applicationParameters.i);
        }
        if (bundle != null) {
            this.m = bundle.getBoolean("hasAuthTokens");
            if (bundle.getBoolean("initializeProgressSpinnerVisible")) {
                aj(true);
            }
        } else {
            ap();
        }
        dkyr.A(findViewById(R.id.wallet_root));
    }

    @Override // defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onNewIntent(Intent intent) {
        if (m() != null) {
            ((dkva) m()).X(intent);
        }
    }

    @Override // defpackage.rxc, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        eihe eiheVar = (eihe) getSupportFragmentManager().findFragmentByTag("CheckoutChimeraActivity.NETWORK_ERROR_DIALOG");
        this.i = eiheVar;
        if (eiheVar != null) {
            eiheVar.a = this;
        }
    }

    @Override // defpackage.dkqk, defpackage.rhf, defpackage.rxc, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("hasAuthTokens", this.m);
        View findViewById = findViewById(R.id.initialize_progress_spinner);
        if (findViewById != null) {
            bundle.putBoolean("initializeProgressSpinnerVisible", findViewById.getVisibility() == 0);
        }
    }

    @Override // defpackage.dkqk
    protected final String p() {
        ejyg ao = ao();
        if (ao == null || (ao.c & 2048) == 0) {
            return null;
        }
        fddh fddhVar = ao.p;
        if (fddhVar == null) {
            fddhVar = fddh.a;
        }
        return fddhVar.f;
    }

    @Override // defpackage.dkqk, defpackage.dlqp
    public final void v(WalletExitResult walletExitResult) {
        if (this.j != null) {
            if (dkyr.K(getResources())) {
                ar(walletExitResult);
                return;
            } else {
                this.j.d(walletExitResult);
                return;
            }
        }
        if (this.k == null) {
            ar(walletExitResult);
            return;
        }
        ab();
        findViewById(R.id.bottom_sticky_button_container).setVisibility(8);
        this.k.f(walletExitResult.c());
    }

    @Override // defpackage.dkqk, defpackage.dlqp
    public final void w(int i) {
        aq(i);
    }

    @Override // defpackage.dkqk, defpackage.dlqp
    public final void x(WalletExitResult walletExitResult) {
        Intent au = au(5, walletExitResult.e, 9, false);
        au.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ERROR_CODE", walletExitResult.e);
        if (dkvx.a(l().c)) {
            walletExitResult.a().b(au);
        }
        setResult(1, au);
        finish();
    }

    @Override // defpackage.dkqk, defpackage.dlqp
    public final /* synthetic */ void z(Parcelable parcelable, boolean z) {
        BuyFlowResult buyFlowResult = (BuyFlowResult) parcelable;
        Intent au = au(2, 0, 2, z);
        if (buyFlowResult != null) {
            byte[] bArr = buyFlowResult.d;
            if (bArr != null) {
                au.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN", bArr);
            }
            if (!TextUtils.isEmpty(buyFlowResult.b)) {
                au.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ORDER_ID", buyFlowResult.b);
            }
            if (!TextUtils.isEmpty(buyFlowResult.c)) {
                au.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_DISPLAY_MESSAGE", buyFlowResult.c);
            }
            byte[] bArr2 = buyFlowResult.g;
            if (bArr2 != null) {
                au.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_CLIENT_CALLBACK_DATA_TOKEN", bArr2);
            }
        }
        setResult(-1, au);
        finish();
    }
}
