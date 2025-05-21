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
import defpackage.arwm;
import defpackage.diez;
import defpackage.dihb;
import defpackage.dijq;
import defpackage.dikm;
import defpackage.dikz;
import defpackage.dilp;
import defpackage.dils;
import defpackage.dimd;
import defpackage.dimf;
import defpackage.ding;
import defpackage.dioj;
import defpackage.djdj;
import defpackage.djdl;
import defpackage.djfd;
import defpackage.efat;
import defpackage.efdk;
import defpackage.efua;
import defpackage.efub;
import defpackage.ehla;
import defpackage.emcz;
import defpackage.emdc;
import defpackage.emef;
import defpackage.emeg;
import defpackage.emen;
import defpackage.faos;
import defpackage.fecj;
import defpackage.fedb;
import defpackage.fedh;
import defpackage.feen;
import defpackage.fsvg;
import defpackage.fsxv;
import defpackage.fsxy;
import defpackage.fsye;
import defpackage.ijf;
import defpackage.ims;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class CheckoutChimeraActivity extends diez implements dimd, efua, dils {
    int h;
    efub i;
    PopoverView j;
    BottomSheetView k;
    Toolbar l;
    private boolean m;

    static int Z(Context context, BuyFlowConfig buyFlowConfig) {
        WalletCustomTheme walletCustomTheme = buyFlowConfig.b.f;
        boolean z = walletCustomTheme != null && walletCustomTheme.d().getInt("windowTransitionsStyle", -1) == 4;
        boolean z2 = ding.K(context.getResources()) && fsxy.c();
        boolean a = fsxv.a.a().a();
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
        arwm.s(buyFlowConfig);
        arwm.s(buyFlowConfig.b);
        arwm.b(!buyFlowConfig.b.d);
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

    private static int am(ehla ehlaVar) {
        if (ehlaVar == null) {
            return -1;
        }
        if ((ehlaVar.c & 512) != 0) {
            return ehlaVar.n;
        }
        faos faosVar = ehlaVar.p;
        if (faosVar == null) {
            faosVar = faos.a;
        }
        if ((faosVar.b & 1) == 0) {
            return -1;
        }
        faos faosVar2 = ehlaVar.p;
        if (faosVar2 == null) {
            faosVar2 = faos.a;
        }
        return faosVar2.c;
    }

    private static int an(ehla ehlaVar) {
        if (ehlaVar == null) {
            return -1;
        }
        if ((ehlaVar.c & 1024) != 0) {
            return ehlaVar.o;
        }
        faos faosVar = ehlaVar.p;
        if (faosVar == null) {
            faosVar = faos.a;
        }
        if ((faosVar.b & 2) == 0) {
            return -1;
        }
        faos faosVar2 = ehlaVar.p;
        if (faosVar2 == null) {
            faosVar2 = faos.a;
        }
        return faosVar2.d;
    }

    private final ehla ao() {
        if (getIntent().getExtras().containsKey("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS")) {
            return (ehla) efdk.b(getIntent(), "com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS", (feen) ehla.b.iB(7, null));
        }
        if (getIntent().getExtras().containsKey("com.google.android.gms.wallet.firstparty.EXTRA_CLIENT_PARAMETERS")) {
            return (ehla) efdk.b(getIntent(), "com.google.android.gms.wallet.firstparty.EXTRA_CLIENT_PARAMETERS", (feen) ehla.b.iB(7, null));
        }
        return null;
    }

    private final void ap() {
        dijq aB;
        if (!djdl.a(this)) {
            if (this.i != null) {
                getSupportFragmentManager().beginTransaction().remove(this.i).commit();
            }
            efub d = efub.d();
            this.i = d;
            d.a = this;
            d.show(getSupportFragmentManager(), "CheckoutChimeraActivity.NETWORK_ERROR_DIALOG");
            return;
        }
        if (!this.m) {
            this.m = true;
            getSupportFragmentManager().beginTransaction().add(dimf.a(kW(), djdj.e(l().b)), "RetrieveAuthTokensFragment").commit();
        }
        Intent intent = getIntent();
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_AUTH_TOKEN");
        if (intent.getExtras().containsKey("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN")) {
            aB = dijq.aA(intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN"), null, null, byteArrayExtra, l(), this.a, null, this.b);
        } else {
            if (!intent.getExtras().containsKey("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS")) {
                throw new IllegalArgumentException("CheckoutChimeraActivity requires either buyflow params or InitializeResponse token");
            }
            aB = dijq.aB(intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS"), intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS"), byteArrayExtra, l(), this.a, null, this.b);
        }
        B(aB, R.id.popover_content_holder);
    }

    private final void aq(int i) {
        Intent au = au(5, i, 9, false);
        au.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ERROR_CODE", i);
        setResult(1, au);
        finish();
    }

    private final void ar(WalletExitResult walletExitResult) {
        Intent au = au(4, 0, walletExitResult.c(), false);
        if (dikm.a(l().c)) {
            walletExitResult.a().b(au);
        }
        setResult(0, au);
        finish();
    }

    private static boolean as(dioj diojVar, int i, int i2, List list) {
        if (!diojVar.b.isEmpty() && !diojVar.b.contains(Integer.valueOf(i))) {
            return false;
        }
        if (diojVar.c.isEmpty() || diojVar.c.contains(Integer.valueOf(i2))) {
            return diojVar.d.isEmpty() || !Collections.disjoint(diojVar.d, list);
        }
        return false;
    }

    private final boolean at() {
        return l().b.j == 1;
    }

    private final Intent au(int i, int i2, int i3, boolean z) {
        Intent T = T(z);
        emeg b = AnalyticsIntentOperation.b(this, new OrchestrationClosedEvent(i, i2, i3, kW() != null ? kW().name : "", this.a));
        if (b != null) {
            for (emef emefVar : b.b) {
                emcz emczVar = emefVar.i;
                if (emczVar == null) {
                    emczVar = emcz.a;
                }
                if (emczVar.e.size() != 0) {
                    emcz emczVar2 = emefVar.i;
                    if (emczVar2 == null) {
                        emczVar2 = emcz.a;
                    }
                    for (emdc emdcVar : emczVar2.e) {
                        fecj fecjVar = (fecj) emdcVar.iB(5, null);
                        fecjVar.X(emdcVar);
                        if (!fecjVar.b.L()) {
                            fecjVar.U();
                        }
                        emdc emdcVar2 = (emdc) fecjVar.b;
                        emdc emdcVar3 = emdc.a;
                        emdcVar2.b &= -9;
                        emdcVar2.f = emdc.a.f;
                    }
                }
            }
        }
        efdk.k(T, "com.google.android.gms.wallet.firstparty.EXTRA_ANALYTICS_PROTO", b);
        byte[] bArr = this.c;
        if (bArr != null && bArr.length > 0) {
            T.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_SERVER_ANALYTICS_TOKEN", bArr);
        }
        efat.r(this.b, dikz.a(i), i2);
        return T;
    }

    private final void av(int i) {
        setResult(0, au(4, 0, i, false));
        finish();
    }

    @Override // defpackage.diez
    protected final boolean N() {
        ehla ao;
        if (l() != null && (ao = ao()) != null) {
            int an = an(ao);
            int am = am(ao);
            faos faosVar = ao.p;
            if (faosVar == null) {
                faosVar = faos.a;
            }
            fedb fedbVar = faosVar.e;
            fedh fedhVar = fsvg.b().b;
            int size = fedhVar.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (!as((dioj) fedhVar.get(i), am, an, fedbVar)) {
                    i++;
                } else if (getIntent().getExtras().containsKey("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS")) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.diez
    protected final void U() {
        ehla ao;
        if (!fsye.a.a().g() || (ao = ao()) == null) {
            return;
        }
        int an = an(ao);
        int am = am(ao);
        faos faosVar = ao.p;
        if (faosVar == null) {
            faosVar = faos.a;
        }
        fedb fedbVar = faosVar.e;
        fedh fedhVar = fsvg.b().b;
        int size = fedhVar.size();
        Integer[] numArr = new Integer[size];
        for (int i = 0; i < size; i++) {
            dioj diojVar = (dioj) fedhVar.get(i);
            if (as(diojVar, am, an, fedbVar)) {
                numArr[i] = Integer.valueOf(diojVar.e);
            } else {
                numArr[i] = Integer.valueOf(diojVar.f);
            }
        }
        efat.h(this.b, 1L, numArr);
    }

    @Override // defpackage.diez, defpackage.djew
    public final void X(int i) {
        if (this.j != null) {
            if (ding.K(getResources())) {
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

    @Override // defpackage.dimd
    public final void ac() {
        av(8);
    }

    @Override // defpackage.dimd
    public final void ad(int i) {
        aq(-1);
    }

    @Override // defpackage.dimd
    public final void ae() {
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("RetrieveAuthTokensFragment");
        if (findFragmentByTag != null) {
            getSupportFragmentManager().beginTransaction().remove(findFragmentByTag).commit();
        }
    }

    @Override // defpackage.dils
    public final void af(WalletExitResult walletExitResult) {
        ar(walletExitResult);
    }

    @Override // defpackage.dils
    public final void ag() {
        if (this.k != null) {
            kJ().C();
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

    @Override // defpackage.dils
    public final void ah() {
        if (m() != null) {
            ((dijq) m()).al();
        }
    }

    @Override // defpackage.dils
    public final void ai() {
        djfd b = WalletExitResult.b();
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

    @Override // defpackage.efua
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

    @Override // defpackage.dils
    public final void al(int i) {
        av(i);
    }

    @Override // defpackage.diez
    protected final int e() {
        return am(ao());
    }

    @Override // defpackage.diez, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void finish() {
        super.finish();
        if (this.h == 3) {
            overridePendingTransition(0, ding.c(l()));
        }
    }

    @Override // defpackage.diez
    protected final int g() {
        return an(ao());
    }

    @Override // defpackage.diez
    protected final Intent i() {
        return dihb.i(this, 1, getIntent().getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS"), getIntent().getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS"), l(), getIntent().getLongExtra("com.google.android.gms.wallet.intentBuildTimeMs", 0L));
    }

    @Override // defpackage.diez, defpackage.pob, defpackage.qdy, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        BuyFlowConfig l = l();
        if (!Q()) {
            int Z = Z(this, l);
            this.h = Z;
            ding.C(this, l, (Z == 1 || Z == 2 || Z == 3) ? ding.e : Z != 4 ? ding.b : ding.c, true);
        }
        q(bundle, true, 1, emen.FLOW_TYPE_BUYFLOW);
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
            ThreadLocal threadLocal = ims.a;
            Drawable drawable = resources.getDrawable(2131233258, theme);
            if (color != 0 && drawable != null) {
                drawable.setTint(color);
                kJ().w(drawable);
                kJ().u(R.string.close_button_label);
            }
        } else {
            setContentView(R.layout.wallet_activity_checkout_bottom_sheet);
            Toolbar toolbar2 = (Toolbar) findViewById(R.id.buyflow_toolbar);
            this.l = toolbar2;
            d(toolbar2);
            ab();
        }
        kJ().o(true);
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
            ((ijf) bottomSheetView.getLayoutParams()).b(bottomSheetView.i);
            bottomSheetView.i.A(new dilp(bottomSheetView));
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
        ding.A(findViewById(R.id.wallet_root));
    }

    @Override // defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onNewIntent(Intent intent) {
        if (m() != null) {
            ((dijq) m()).X(intent);
        }
    }

    @Override // defpackage.qdy, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        super.onResume();
        efub efubVar = (efub) getSupportFragmentManager().findFragmentByTag("CheckoutChimeraActivity.NETWORK_ERROR_DIALOG");
        this.i = efubVar;
        if (efubVar != null) {
            efubVar.a = this;
        }
    }

    @Override // defpackage.diez, defpackage.pob, defpackage.qdy, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("hasAuthTokens", this.m);
        View findViewById = findViewById(R.id.initialize_progress_spinner);
        if (findViewById != null) {
            bundle.putBoolean("initializeProgressSpinnerVisible", findViewById.getVisibility() == 0);
        }
    }

    @Override // defpackage.diez
    protected final String p() {
        ehla ao = ao();
        if (ao == null || (ao.c & 2048) == 0) {
            return null;
        }
        faos faosVar = ao.p;
        if (faosVar == null) {
            faosVar = faos.a;
        }
        return faosVar.f;
    }

    @Override // defpackage.diez, defpackage.djew
    public final void v(WalletExitResult walletExitResult) {
        if (this.j != null) {
            if (ding.K(getResources())) {
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

    @Override // defpackage.diez, defpackage.djew
    public final void w(int i) {
        aq(i);
    }

    @Override // defpackage.diez, defpackage.djew
    public final void x(WalletExitResult walletExitResult) {
        Intent au = au(5, walletExitResult.e, 9, false);
        au.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ERROR_CODE", walletExitResult.e);
        if (dikm.a(l().c)) {
            walletExitResult.a().b(au);
        }
        setResult(1, au);
        finish();
    }

    @Override // defpackage.diez, defpackage.djew
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
