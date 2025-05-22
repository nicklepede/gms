package com.google.android.gms.auth.uiflows.addaccount;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.KeyguardManager;
import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.R;
import com.google.android.gms.auth.firstparty.shared.D2dOptions;
import com.google.android.gms.auth.frp.FrpSnapshot;
import com.google.android.gms.auth.uiflows.addaccount.PreAddAccountChimeraActivity;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.enterprise.internal.ConsentedLoggingRequest;
import com.google.android.gms.enterprise.internal.LoadModuleResult;
import com.google.android.gms.enterprise.internal.MpCompleteRequest;
import com.google.android.gms.enterprise.internal.ZeroTouchFlowResult;
import com.google.android.setupcompat.logging.SetupMetric;
import defpackage.a;
import defpackage.acno;
import defpackage.acnp;
import defpackage.acxg;
import defpackage.acxl;
import defpackage.acxp;
import defpackage.acxq;
import defpackage.adoz;
import defpackage.aebw;
import defpackage.afdw;
import defpackage.afen;
import defpackage.affl;
import defpackage.affm;
import defpackage.afft;
import defpackage.affu;
import defpackage.affw;
import defpackage.affx;
import defpackage.afhi;
import defpackage.afkv;
import defpackage.aflt;
import defpackage.atad;
import defpackage.atai;
import defpackage.atfd;
import defpackage.atfn;
import defpackage.atmb;
import defpackage.atzs;
import defpackage.ausj;
import defpackage.auub;
import defpackage.auwq;
import defpackage.bbql;
import defpackage.bbra;
import defpackage.bbrj;
import defpackage.bbro;
import defpackage.bsxm;
import defpackage.cyki;
import defpackage.dhkz;
import defpackage.dhlh;
import defpackage.dhlk;
import defpackage.dhln;
import defpackage.dhlq;
import defpackage.dhlv;
import defpackage.dhlw;
import defpackage.dxyi;
import defpackage.eftg;
import defpackage.ekww;
import defpackage.emld;
import defpackage.emlk;
import defpackage.emll;
import defpackage.emlv;
import defpackage.emlw;
import defpackage.emms;
import defpackage.emqe;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fmua;
import defpackage.fmue;
import defpackage.fmuw;
import defpackage.fnbi;
import defpackage.fnbo;
import defpackage.fnbx;
import defpackage.fncm;
import defpackage.fneh;
import defpackage.fqdw;
import defpackage.fxqu;
import defpackage.fxxm;
import defpackage.fyyi;
import defpackage.fyyj;
import defpackage.iri;
import defpackage.jzw;
import defpackage.kaj;
import defpackage.ous;
import defpackage.wun;
import defpackage.wyw;
import defpackage.xbw;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class PreAddAccountChimeraActivity extends afkv implements jzw, acxg {
    public static final acno h = new acno("is_frp_required");
    static final acno i = new acno("is_setup_wizard");
    static final acno j = new acno("is_resolve_frp_only");
    public static cyki k;
    private acxq A;
    ous l;
    public affx m;
    private Handler x;
    private final List y = new ArrayList();
    public final affw n = new affw(this);
    private final dhkz z = new affm();
    final Runnable o = new Runnable() { // from class: affa
        @Override // java.lang.Runnable
        public final void run() {
            PreAddAccountChimeraActivity preAddAccountChimeraActivity = PreAddAccountChimeraActivity.this;
            if (preAddAccountChimeraActivity.isDestroyed() || preAddAccountChimeraActivity.isFinishing()) {
                Log.w("Auth", String.format(Locale.US, "[AddAccount, PreAddAccountActivity] State was updated after the activity was finished, skipping onStateCallback", new Object[0]));
            } else {
                preAddAccountChimeraActivity.p(false);
            }
        }
    };

    private final acxq B() {
        PreAddAccountChimeraActivity preAddAccountChimeraActivity;
        if (this.A == null) {
            preAddAccountChimeraActivity = this;
            preAddAccountChimeraActivity.A = new acxq(new bbra(this), new bbrj(this), new acxl(new bbra(this), new bbrj(this)), new bbro(this), preAddAccountChimeraActivity);
        } else {
            preAddAccountChimeraActivity = this;
        }
        return preAddAccountChimeraActivity.A;
    }

    public static final void q(emlv emlvVar) {
        aflt afltVar = new aflt();
        fgrc v = emll.a.v();
        emlk emlkVar = emlk.AUTH_DEBUG_EVENT;
        if (!v.b.L()) {
            v.U();
        }
        emll emllVar = (emll) v.b;
        emllVar.e = emlkVar.ar;
        emllVar.b |= 1;
        fgrc v2 = emlw.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        emlw emlwVar = (emlw) v2.b;
        emlvVar.getClass();
        emlwVar.e = emlvVar;
        emlwVar.b |= 4;
        if (!v.b.L()) {
            v.U();
        }
        emll emllVar2 = (emll) v.b;
        emlw emlwVar2 = (emlw) v2.Q();
        emlwVar2.getClass();
        emllVar2.X = emlwVar2;
        emllVar2.c |= 16777216;
        afltVar.a((emll) v.Q());
    }

    @Override // defpackage.jzw
    public final kaj a(int i2, Bundle bundle) {
        Log.w("Auth", a.j(i2, "[AddAccount, PreAddAccountActivity] Starting loader with loaderId="));
        kaj aebwVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? null : new aebw(this) : new adoz(this) : new affl(this, this, fmue.c()) : new affu(this, this, fmue.c()) : new afft(this, this, fmue.c()) : new afen(this);
        if (aebwVar != null) {
            this.y.add(aebwVar);
        }
        return aebwVar;
    }

    @Override // defpackage.jzw
    public final /* bridge */ /* synthetic */ void b(kaj kajVar, Object obj) {
        Bundle bundle = (Bundle) obj;
        int id = kajVar.getId();
        Log.w("Auth", a.j(id, "[AddAccount, PreAddAccountActivity] Loader finished with loaderId="));
        if (id == 0) {
            this.m.c(bundle.getBoolean("checkin_loader_result", false));
            return;
        }
        if (id == 1) {
            o((FrpSnapshot) atzs.a(bundle.getByteArray("loader_result_frp"), FrpSnapshot.CREATOR));
            return;
        }
        if (id == 2) {
            if (!bundle.getBoolean("loader_result_certified", false)) {
                Log.w("Auth", String.format(Locale.US, "[AddAccount, PreAddAccountActivity] Failed to clear FRP result. Just means that device is still FRP'd.", new Object[0]));
            }
            this.m.d(new FrpSnapshot(true, false, false));
            this.m.b(true);
            return;
        }
        if (id == 3) {
            this.m.a(bundle);
            return;
        }
        if (id == 4) {
            this.m.e(bundle.getBoolean("key_attestation_should_warn", false));
        } else if (id != 5) {
            Log.wtf("Auth", String.format(Locale.US, "[AddAccount, PreAddAccountActivity] Unrecognized LoaderId!!!", new Object[0]));
        } else {
            this.m.g(bundle.getBoolean("ps_education_should_show", false));
        }
    }

    @Override // defpackage.jzw
    public final void c(kaj kajVar) {
        Log.w("Auth", "[AddAccount, PreAddAccountActivity] Loader reset with loaderId=" + kajVar.getId());
    }

    @Override // defpackage.acxg
    public final void d() {
        Log.w("Auth", "[PreAddAccountChimeraActivity] finishWithoutDelay with result=RESULT_OK");
        setResult(-1);
        finish();
    }

    @Override // defpackage.acxg
    public final void e(int i2) {
        Log.w("Auth", String.format(Locale.US, "[AddAccount, PreAddAccountActivity] ManagedProvisioning result code: %d", Integer.valueOf(i2)));
        if (i2 == -1) {
            Log.w("Auth", "[PreAddAccountChimeraActivity] Triggering finish(resultCode, data) with result=RESULT_DPM_USER_COMPLETE");
            gT(111, null);
            return;
        }
        if (i2 == 0) {
            Log.w("Auth", "[PreAddAccountChimeraActivity] Triggering finish(resultCode, data) with result=RESULT_CANCELED");
            Intent intent = new Intent();
            acnp acnpVar = new acnp();
            acnpVar.d(AddAccountController.a, true);
            gT(0, intent.putExtras(acnpVar.a));
            return;
        }
        switch (i2) {
            case 120:
            case 121:
                g();
                break;
            case 122:
                Log.w("Auth", "[PreAddAccountChimeraActivity] Triggering finish(resultCode, data) with result=RESULT_WORK_PROFILE_CREATED");
                gT(122, null);
                break;
            case 123:
                Log.w("Auth", "[PreAddAccountChimeraActivity] Triggering finish(resultCode, data) with result=RESULT_DEVICE_OWNER_SET");
                gT(123, null);
                break;
            default:
                Log.e("Auth", String.format(Locale.US, "[AddAccount, PreAddAccountActivity] Unexpected ManagedProvisioning result code.", new Object[0]));
                Log.w("Auth", "[PreAddAccountChimeraActivity] Triggering finish(resultCode, data) with result=RESULT_DPM_USER_COMPLETE");
                gT(111, null);
                break;
        }
    }

    @Override // defpackage.acxg
    public final void f(Intent intent) {
        if (fmua.a.lK().d()) {
            eftg.a(getIntent(), intent);
        }
        startActivityForResult(intent, 4);
    }

    @Override // defpackage.acxg
    public final void g() {
        Log.w("Auth", "[PreAddAccountChimeraActivity] resuming Add account flow post ZT");
        p(true);
    }

    @Override // defpackage.afln, defpackage.afkn
    public final void gT(final int i2, final Intent intent) {
        if (i2 == 0) {
            i2 = 0;
            if (intent != null && intent.getBooleanExtra(AddAccountController.a.a, false)) {
                this.x.removeCallbacksAndMessages(null);
                Log.w("Auth", "[PreAddAccountChimeraActivity] finish(resultCode, data) called with result=RESULT_CANCELED");
                super.gT(0, intent);
                return;
            }
        }
        if (fncm.a.lK().c()) {
            this.x.removeCallbacksAndMessages(null);
        }
        long currentTimeMillis = System.currentTimeMillis() - this.m.f.longValue();
        dxyi dxyiVar = xbw.a;
        if (currentTimeMillis < fnbo.f()) {
            this.x.postDelayed(new Runnable() { // from class: affi
                @Override // java.lang.Runnable
                public final void run() {
                    PreAddAccountChimeraActivity.this.l(i2, intent);
                }
            }, fnbo.f() - currentTimeMillis);
        } else {
            Log.w("Auth", a.j(i2, "[PreAddAccountChimeraActivity] finish(resultCode, data) triggered with resultCode="));
            super.gT(i2, intent);
        }
    }

    @Override // defpackage.afkn
    protected final String gW() {
        return "PreAddAccountActivity";
    }

    @Override // defpackage.afkn
    protected final void gX() {
        if (wyw.a.a(this)) {
            wyw.c(this, null);
        } else {
            super.gX();
        }
    }

    @Override // defpackage.acxg
    public final void h() {
        Log.w("Auth", "[PreAddAccountChimeraActivity] finish(resultCode, data) called with result=RESULT_ZERO_TOUCH");
        gT(3, null);
    }

    final dhlw j(final String str, String[] strArr, final String str2) {
        dhlw a = atmb.a(k.bt(str, 251864004, strArr, null).d(this.z), fnbi.a.lK().a(), TimeUnit.MILLISECONDS);
        a.y(new dhln() { // from class: affd
            @Override // defpackage.dhln
            public final void gB(Exception exc) {
                Log.w("Auth", String.format(Locale.US, "[AddAccount, PreAddAccountActivity] ".concat(str2), new Object[0]), exc);
            }
        });
        a.z(new dhlq() { // from class: affe
            @Override // defpackage.dhlq
            public final void gC(Object obj) {
                Log.w("Auth", String.format(Locale.US, "[AddAccount, PreAddAccountActivity] Sync successful:".concat(str), new Object[0]));
            }
        });
        if (ausj.c(fneh.c())) {
            a.z(new dhlq() { // from class: afff
                @Override // defpackage.dhlq
                public final void gC(Object obj) {
                    Intent intent = new Intent("com.google.android.gms.auth.PHENOTYPE_SYNC_COMPLETE");
                    PreAddAccountChimeraActivity preAddAccountChimeraActivity = PreAddAccountChimeraActivity.this;
                    preAddAccountChimeraActivity.sendBroadcast(intent.setPackage(preAddAccountChimeraActivity.getPackageName()).putExtra("com.google.android.gms.phenotype.PACKAGE_NAME", str));
                }
            });
        }
        return a;
    }

    public final /* synthetic */ void l(int i2, Intent intent) {
        Log.w("Auth", a.j(i2, "[PreAddAccountChimeraActivity] finish(resultCode, data) called from Handler after delay with resultCode="));
        super.gT(i2, intent);
    }

    public final /* synthetic */ void n(AccountManagerFuture accountManagerFuture) {
        try {
            Bundle bundle = (Bundle) accountManagerFuture.getResult();
            if (!bundle.containsKey("authAccount") || !bundle.containsKey("accountType")) {
                Log.w("Auth", "[PreAddAccountChimeraActivity] finish(resultCode, data) called with result=RESULT_CANCELED");
                gT(0, null);
            } else {
                acnp acnpVar = new acnp();
                acnpVar.d(AddAccountChimeraActivity.h, new Account(bundle.getString("authAccount"), bundle.getString("accountType")));
                Log.w("Auth", "[PreAddAccountChimeraActivity] finish(resultCode, data) called with result=RESULT_FINISH_SUCCESS");
                gT(31, new Intent().putExtras(acnpVar.a));
            }
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            Log.w("Auth", "[PreAddAccountChimeraActivity] Exception calling AccountManager#finishSession. finish(resultCode, data) called with result=RESULT_CANCELED", e);
            gT(0, null);
        }
    }

    public final void o(FrpSnapshot frpSnapshot) {
        this.m.d(frpSnapshot);
        boolean booleanExtra = getIntent().getBooleanExtra(i.a, false);
        if (!frpSnapshot.b || (booleanExtra && !frpSnapshot.c)) {
            int i2 = iri.a;
            if (!wun.b(this)) {
                this.m.b(true);
                return;
            } else {
                Log.i("Auth", "FRP is not required, but Secure FRP bit is still set, clearing it");
                this.n.a(2);
                return;
            }
        }
        if (this.m.j) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.m.f.longValue();
        Handler handler = this.x;
        Runnable runnable = new Runnable() { // from class: affj
            @Override // java.lang.Runnable
            public final void run() {
                Bundle bundle;
                PreAddAccountChimeraActivity preAddAccountChimeraActivity = PreAddAccountChimeraActivity.this;
                if (preAddAccountChimeraActivity.isFinishing() || preAddAccountChimeraActivity.isChangingConfigurations()) {
                    return;
                }
                preAddAccountChimeraActivity.m.j = true;
                FrpSnapshot frpSnapshot2 = preAddAccountChimeraActivity.m.c;
                int i3 = iri.a;
                if (bsup.b(preAddAccountChimeraActivity).p("com.google").length <= 0 && frpSnapshot2.d) {
                    dxyi dxyiVar = xbw.a;
                    if (fnbo.o() && auub.d()) {
                        KeyguardManager keyguardManager = (KeyguardManager) preAddAccountChimeraActivity.getSystemService("keyguard");
                        CharSequence text = preAddAccountChimeraActivity.getResources().getText(R.string.auth_frp_preadd_lkscreen_fwd);
                        fmxf.c();
                        Intent a = affv.a(keyguardManager, text);
                        if (a == null) {
                            preAddAccountChimeraActivity.n.a(2);
                            return;
                        }
                        eftg.a(preAddAccountChimeraActivity.getIntent(), a);
                        preAddAccountChimeraActivity.startActivityForResult(a, 2);
                        AppContextProvider.a();
                        ekww ekwwVar = bsxv.a;
                        bsxr.a(auio.AUTH_ACCOUNT_BASE_FACTORY_RESET_PROTECTION_SHOWN);
                        return;
                    }
                }
                Intent intent = preAddAccountChimeraActivity.getIntent();
                if (intent.getExtras() != null && (bundle = D2dOptions.b(intent.getExtras()).f) != null && bundle.getBoolean("source_not_transferring_new_account")) {
                    preAddAccountChimeraActivity.m.d(new FrpSnapshot(true, false, false));
                } else if (((KeyguardManager) preAddAccountChimeraActivity.getSystemService("keyguard")).isKeyguardSecure()) {
                    fmzd.d();
                    Intent intent2 = new Intent("android.app.action.CONFIRM_DEVICE_CREDENTIAL");
                    eftg.a(preAddAccountChimeraActivity.getIntent(), intent2);
                    preAddAccountChimeraActivity.startActivityForResult(intent2, 1);
                    return;
                }
                preAddAccountChimeraActivity.m.b(true);
            }
        };
        dxyi dxyiVar = xbw.a;
        handler.postDelayed(runnable, currentTimeMillis < fnbo.f() ? fnbo.f() - currentTimeMillis : 0L);
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1) {
            if (i3 != -1) {
                this.m.b(false);
                return;
            } else {
                this.m.d(new FrpSnapshot(true, false, false));
                this.m.b(true);
                return;
            }
        }
        if (i2 == 2) {
            if (i3 == -1) {
                int i4 = iri.a;
                r(5);
                this.n.a(2);
                return;
            } else if (i3 != 1) {
                r(3);
                int i5 = iri.a;
                this.m.b(false);
                return;
            } else {
                int i6 = iri.a;
                r(4);
                this.m.b(true);
                return;
            }
        }
        if (i2 != 4) {
            Log.w("Auth", String.format(Locale.US, a.j(i2, "[AddAccount, PreAddAccountActivity] Unrecognized request code: "), new Object[0]));
            return;
        }
        acxq B = B();
        acxp acxpVar = new acxp(i3, this);
        atai ataiVar = B.a;
        final MpCompleteRequest mpCompleteRequest = new MpCompleteRequest(i3);
        atfn atfnVar = new atfn();
        atfnVar.c = new Feature[]{bbql.b};
        final bbra bbraVar = (bbra) ataiVar;
        atfnVar.a = new atfd() { // from class: bbqw
            @Override // defpackage.atfd
            public final void d(Object obj, Object obj2) {
                bbqz bbqzVar = new bbqz((dhma) obj2);
                bbqs bbqsVar = (bbqs) ((bbqo) obj).H();
                ApiMetadata a = bsxa.a(bbra.this.a);
                Parcel fE = bbqsVar.fE();
                qmr.e(fE, mpCompleteRequest);
                qmr.g(fE, bbqzVar);
                qmr.e(fE, a);
                bbqsVar.fG(2, fE);
            }
        };
        atfnVar.b = false;
        atfnVar.d = 12602;
        dhlw jd = ((atad) ataiVar).jd(atfnVar.a());
        jd.a(acxpVar);
        jd.y(acxpVar);
        jd.z(acxpVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c2  */
    @Override // defpackage.afkv, defpackage.afln, defpackage.afkn, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 832
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.uiflows.addaccount.PreAddAccountChimeraActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onPause() {
        super.onPause();
        Intent intent = getIntent();
        int i2 = afdw.a;
        SetupMetric.a("PreAddAccountLoading");
        afdw.a(intent);
    }

    @Override // defpackage.afkn, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onResume() {
        super.onResume();
        Intent intent = getIntent();
        int i2 = afdw.a;
        SetupMetric.b("PreAddAccountLoading");
        afdw.a(intent);
    }

    @Override // defpackage.afkn, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        affx affxVar = this.m;
        Long l = affxVar.f;
        if (l != null) {
            bundle.putLong("state.create_time", l.longValue());
        }
        Boolean bool = affxVar.a;
        if (bool != null) {
            bundle.putBoolean("state.checkin_result", bool.booleanValue());
        }
        Boolean bool2 = affxVar.b;
        if (bool2 != null) {
            bundle.putBoolean("state.challenge_result", bool2.booleanValue());
        }
        FrpSnapshot frpSnapshot = affxVar.c;
        if (frpSnapshot != null) {
            bundle.putByteArray("state.frp_snapshot", atzs.n(frpSnapshot));
        }
        bundle.putBoolean("state.phenotype_sync", affxVar.g);
        bundle.putBoolean("state.is_challenge_started", affxVar.j);
        Bundle bundle2 = affxVar.h;
        if (bundle2 != null && !bundle2.isEmpty()) {
            bundle.putBundle("state.account_seeding_result", affxVar.h);
            bundle.putBoolean("state.finish_session_started", affxVar.i);
        }
        bundle.putBoolean("state.has_launched_zt", affxVar.k.get());
        Boolean bool3 = affxVar.d;
        if (bool3 != null) {
            bundle.putBoolean("state.ps_education_required", bool3.booleanValue());
        }
        Boolean bool4 = affxVar.e;
        if (bool4 != null) {
            bundle.putBoolean("state.key_attestation_check_failed", bool4.booleanValue());
        }
    }

    @Override // defpackage.afkn, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onStop() {
        super.onStop();
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            ((kaj) it.next()).cancelLoad();
        }
        if (fmuw.a.lK().a()) {
            Log.w("Auth", "[PreAddAccountChimeraActivity] onStop called. Cancelling Onboarding tasks.");
            fxqu fxquVar = afhi.h;
            if (fxquVar == null) {
                fxxm.j("lazyInstanceProvider");
                fxquVar = null;
            }
            ((ous) fxquVar.a()).close();
        }
    }

    public final void p(boolean z) {
        acnp acnpVar = new acnp();
        if (fnbx.c()) {
            acno acnoVar = aebw.c;
            Boolean bool = this.m.d;
            acnpVar.d(acnoVar, Boolean.valueOf(bool != null && bool.booleanValue()));
        }
        acno acnoVar2 = adoz.c;
        Boolean bool2 = this.m.e;
        acnpVar.d(acnoVar2, Boolean.valueOf(bool2 != null && bool2.booleanValue()));
        if (!this.m.a.booleanValue() || !this.m.b.booleanValue()) {
            if (this.m.b.booleanValue()) {
                Log.w("Auth", "[PreAddAccountChimeraActivity] finish(resultCode, data) called with result=RESULT_ERROR");
                gT(2, null);
                return;
            } else {
                acnpVar.d(AddAccountController.a, true);
                Log.w("Auth", "[PreAddAccountChimeraActivity] finish(resultCode, data) called with result=RESULT_CANCELED");
                gT(0, new Intent().putExtras(acnpVar.a));
                return;
            }
        }
        Bundle bundle = this.m.h;
        if (bundle != null && !bundle.isEmpty()) {
            affx affxVar = this.m;
            if (affxVar.i) {
                return;
            }
            affxVar.i = true;
            ((AccountManager) getSystemService(AccountManager.class)).finishSession(this.m.h, getContainerActivity(), new AccountManagerCallback() { // from class: affc
                @Override // android.accounts.AccountManagerCallback
                public final void run(AccountManagerFuture accountManagerFuture) {
                    PreAddAccountChimeraActivity.this.n(accountManagerFuture);
                }
            }, null);
            return;
        }
        if (!z && bsxm.a(new ekww() { // from class: affk
            @Override // defpackage.ekww
            public final Object lK() {
                return Boolean.valueOf(fqdw.d());
            }
        }, "work:zero_touch_config_present", getContentResolver()) && getIntent().getBooleanExtra(i.a, false)) {
            boolean booleanExtra = getIntent().getBooleanExtra(j.a, false);
            if (bsxm.a(new ekww() { // from class: affb
                @Override // defpackage.ekww
                public final Object lK() {
                    return Boolean.valueOf(fqdw.a.lK().g());
                }
            }, "ZeroTouchFeature__skip_zero_touch_frp_extra_present", getContentResolver())) {
                if (!booleanExtra) {
                    booleanExtra = false;
                }
            }
            fqdw fqdwVar = fqdw.a;
            if (!fqdwVar.lK().f() || booleanExtra || !this.m.c.c) {
                if (this.m.k.compareAndSet(false, true)) {
                    acxq B = B();
                    Log.i("Auth", "[ZeroTouchManagerImpl] Launching ZT flow.");
                    ekww ekwwVar = new ekww() { // from class: acxm
                        @Override // defpackage.ekww
                        public final Object lK() {
                            return Boolean.valueOf(fqdw.d());
                        }
                    };
                    Context context = B.c;
                    if (!bsxm.a(ekwwVar, "work:zero_touch_config_present", context.getContentResolver())) {
                        Log.w("Auth", "[ZeroTouchManagerImpl] ZT config not present.");
                        g();
                        return;
                    }
                    if (!fqdwVar.lK().c()) {
                        Context context2 = ((bbra) B.a).a;
                        auwq auwqVar = new auwq(context2);
                        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context2.getSystemService("device_policy");
                        if (!auub.e() || context2.getPackageManager().isSafeMode() || devicePolicyManager.isDeviceProvisioned() || devicePolicyManager.isDeviceProvisioningConfigApplied() || !new bbro(context2).a(auwqVar)) {
                            Log.w("Auth", "[ZeroTouchManagerImpl] Device conditions not met.");
                            DevicePolicyManager devicePolicyManager2 = (DevicePolicyManager) context.getSystemService("device_policy");
                            if (devicePolicyManager2 == null || !devicePolicyManager2.isDeviceProvisioningConfigApplied() || !bsxm.a(new ekww() { // from class: acxn
                                @Override // defpackage.ekww
                                public final Object lK() {
                                    return Boolean.valueOf(fqdw.a.lK().e());
                                }
                            }, "ZeroTouchFeature__read_mp_result_in_auth", context.getContentResolver())) {
                                g();
                                return;
                            }
                            Log.i("Auth", "ZT flow triggered in suw again. Will try to skip forward to the rest of suw.");
                            atai ataiVar = B.b;
                            atfn atfnVar = new atfn();
                            atfnVar.c = new Feature[]{bbql.e};
                            atfnVar.a = new atfd() { // from class: bbrc
                                @Override // defpackage.atfd
                                public final void d(Object obj, Object obj2) {
                                    int i2 = bbrj.a;
                                    bbri bbriVar = new bbri((dhma) obj2);
                                    bbqq bbqqVar = (bbqq) ((bbqp) obj).H();
                                    Parcel fE = bbqqVar.fE();
                                    qmr.g(fE, bbriVar);
                                    bbqqVar.fG(4, fE);
                                }
                            };
                            atfnVar.b = false;
                            atfnVar.d = 12609;
                            ((atad) ataiVar).jd(atfnVar.a()).x(new dhlk() { // from class: acxo
                                @Override // defpackage.dhlk
                                public final void hH(dhlw dhlwVar) {
                                    acxg acxgVar = acxg.this;
                                    if (dhlwVar.m() && ((Integer) dhlwVar.i()).intValue() != Integer.MIN_VALUE) {
                                        acxgVar.e(((Integer) dhlwVar.i()).intValue());
                                    } else {
                                        Log.w("Auth", "Failed to retrieve MP result code.");
                                        acxgVar.g();
                                    }
                                }
                            });
                            return;
                        }
                    }
                    fgrc v = fyyi.a.v();
                    if (!v.b.L()) {
                        v.U();
                    }
                    fgri fgriVar = v.b;
                    fyyi fyyiVar = (fyyi) fgriVar;
                    fyyiVar.c = 1;
                    fyyiVar.b |= 1;
                    if (!fgriVar.L()) {
                        v.U();
                    }
                    fgri fgriVar2 = v.b;
                    fyyi fyyiVar2 = (fyyi) fgriVar2;
                    fyyiVar2.d = 1;
                    fyyiVar2.b |= 2;
                    if (!fgriVar2.L()) {
                        v.U();
                    }
                    fyyi fyyiVar3 = (fyyi) v.b;
                    fyyiVar3.e = 1;
                    fyyiVar3.b |= 4;
                    fgrc v2 = fyyj.a.v();
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    fyyj fyyjVar = (fyyj) v2.b;
                    fyyjVar.c = 2;
                    fyyjVar.b |= 1;
                    if (!v.b.L()) {
                        v.U();
                    }
                    fyyi fyyiVar4 = (fyyi) v.b;
                    fyyj fyyjVar2 = (fyyj) v2.Q();
                    fyyjVar2.getClass();
                    fyyiVar4.g = fyyjVar2;
                    fyyiVar4.b |= 16;
                    fyyi fyyiVar5 = (fyyi) v.Q();
                    atai ataiVar2 = B.b;
                    final ConsentedLoggingRequest consentedLoggingRequest = new ConsentedLoggingRequest(fyyiVar5);
                    atfn atfnVar2 = new atfn();
                    atfnVar2.c = new Feature[]{bbql.d};
                    atfnVar2.a = new atfd() { // from class: bbrd
                        @Override // defpackage.atfd
                        public final void d(Object obj, Object obj2) {
                            int i2 = bbrj.a;
                            bbrh bbrhVar = new bbrh((dhma) obj2);
                            bbqq bbqqVar = (bbqq) ((bbqp) obj).H();
                            Parcel fE = bbqqVar.fE();
                            qmr.e(fE, ConsentedLoggingRequest.this);
                            qmr.g(fE, bbrhVar);
                            bbqqVar.fG(2, fE);
                        }
                    };
                    atfnVar2.b = false;
                    atfnVar2.d = 12604;
                    ((atad) ataiVar2).ji(atfnVar2.a());
                    final acxl acxlVar = B.d;
                    atai ataiVar3 = acxlVar.b;
                    atfn atfnVar3 = new atfn();
                    atfnVar3.c = new Feature[]{bbql.c};
                    atfnVar3.a = new atfd() { // from class: bbre
                        @Override // defpackage.atfd
                        public final void d(Object obj, Object obj2) {
                            int i2 = bbrj.a;
                            bbrg bbrgVar = new bbrg((dhma) obj2);
                            bbqq bbqqVar = (bbqq) ((bbqp) obj).H();
                            Parcel fE = bbqqVar.fE();
                            qmr.e(fE, null);
                            qmr.g(fE, bbrgVar);
                            bbqqVar.fG(1, fE);
                        }
                    };
                    atfnVar3.b = false;
                    atfnVar3.d = 12603;
                    dhlw f = ((atad) ataiVar3).jd(atfnVar3.a()).f(new dhlv() { // from class: acxh
                        @Override // defpackage.dhlv
                        public final dhlw a(Object obj) {
                            if (((LoadModuleResult) obj).a != 0) {
                                return dhmr.b();
                            }
                            acxl acxlVar2 = acxl.this;
                            atfn atfnVar4 = new atfn();
                            atfnVar4.c = new Feature[]{bbql.a};
                            atai ataiVar4 = acxlVar2.a;
                            final bbra bbraVar = (bbra) ataiVar4;
                            atfnVar4.a = new atfd() { // from class: bbqv
                                @Override // defpackage.atfd
                                public final void d(Object obj2, Object obj3) {
                                    bbqy bbqyVar = new bbqy((dhma) obj3);
                                    bbqs bbqsVar = (bbqs) ((bbqo) obj2).H();
                                    ApiMetadata a = bsxa.a(bbra.this.a);
                                    Parcel fE = bbqsVar.fE();
                                    qmr.e(fE, null);
                                    qmr.g(fE, bbqyVar);
                                    qmr.e(fE, a);
                                    bbqsVar.fG(1, fE);
                                }
                            };
                            atfnVar4.b = false;
                            atfnVar4.d = 12601;
                            return ((atad) ataiVar4).jd(atfnVar4.a());
                        }
                    });
                    f.a(new dhlh() { // from class: acxi
                        @Override // defpackage.dhlh
                        public final void jX() {
                            acxg.this.h();
                        }
                    });
                    f.y(new dhln() { // from class: acxj
                        @Override // defpackage.dhln
                        public final void gB(Exception exc) {
                            Log.e("Auth", "API call failed with exception: ".concat(String.valueOf(Log.getStackTraceString(exc))));
                            acxg.this.h();
                        }
                    });
                    f.z(new dhlq() { // from class: acxk
                        @Override // defpackage.dhlq
                        public final void gC(Object obj) {
                            ZeroTouchFlowResult zeroTouchFlowResult = (ZeroTouchFlowResult) obj;
                            int i2 = zeroTouchFlowResult.a;
                            Log.w("Auth", a.j(i2, "[ZeroTouchLauncherImpl] onZeroTouchFlowSuccess with status="));
                            acxg acxgVar = acxg.this;
                            if (i2 == 1) {
                                acxgVar.f(zeroTouchFlowResult.b);
                            } else if (i2 != 2) {
                                acxgVar.h();
                            } else {
                                acxgVar.g();
                            }
                        }
                    });
                    return;
                }
                return;
            }
        }
        acnpVar.d(h, Boolean.valueOf(this.m.c.c));
        Log.w("Auth", "[PreAddAccountChimeraActivity] finish(resultCode, data) called with result=RESULT_OK");
        gT(-1, new Intent().putExtras(acnpVar.a));
    }

    protected final void r(int i2) {
        dxyi dxyiVar = xbw.a;
        if (fnbo.a.lK().L()) {
            emms emmsVar = emms.a;
            fgrc v = emmsVar.v();
            if ((((emll) w().b).b & 8192) != 0) {
                emms emmsVar2 = ((emll) w().b).p;
                if (emmsVar2 != null) {
                    emmsVar = emmsVar2;
                }
                v = (fgrc) emmsVar.iQ(5, null);
                v.X(emmsVar);
            }
            emld emldVar = emld.a;
            fgrc v2 = emldVar.v();
            emms emmsVar3 = (emms) v.b;
            if ((emmsVar3.b & 256) != 0) {
                emld emldVar2 = emmsVar3.k;
                if (emldVar2 != null) {
                    emldVar = emldVar2;
                }
                v2 = (fgrc) emldVar.iQ(5, null);
                v2.X(emldVar);
            }
            fgrc v3 = emqe.a.v();
            if (!v3.b.L()) {
                v3.U();
            }
            fgri fgriVar = v3.b;
            emqe emqeVar = (emqe) fgriVar;
            emqeVar.d = i2 - 1;
            emqeVar.b |= 2;
            boolean z = i2 == 5;
            if (!fgriVar.L()) {
                v3.U();
            }
            emqe emqeVar2 = (emqe) v3.b;
            emqeVar2.b |= 1;
            emqeVar2.c = z;
            emqe emqeVar3 = (emqe) v3.Q();
            if (!v2.b.L()) {
                v2.U();
            }
            emld emldVar3 = (emld) v2.b;
            emqeVar3.getClass();
            emldVar3.c = emqeVar3;
            emldVar3.b |= 2;
            if (!v.b.L()) {
                v.U();
            }
            emms emmsVar4 = (emms) v.b;
            emld emldVar4 = (emld) v2.Q();
            emldVar4.getClass();
            emmsVar4.k = emldVar4;
            emmsVar4.b |= 256;
            fgrc w = w();
            emms emmsVar5 = (emms) v.Q();
            if (!w.b.L()) {
                w.U();
            }
            emll emllVar = (emll) w.b;
            emmsVar5.getClass();
            emllVar.p = emmsVar5;
            emllVar.b |= 8192;
        }
    }
}
