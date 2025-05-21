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
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.enterprise.internal.ConsentedLoggingRequest;
import com.google.android.gms.enterprise.internal.LoadModuleResult;
import com.google.android.gms.enterprise.internal.MpCompleteRequest;
import com.google.android.gms.enterprise.internal.ZeroTouchFlowResult;
import com.google.android.setupcompat.logging.SetupMetric;
import defpackage.a;
import defpackage.aano;
import defpackage.aanp;
import defpackage.aaxg;
import defpackage.aaxl;
import defpackage.aaxp;
import defpackage.aaxq;
import defpackage.aboz;
import defpackage.acbw;
import defpackage.addu;
import defpackage.adel;
import defpackage.adfj;
import defpackage.adfk;
import defpackage.adfr;
import defpackage.adfs;
import defpackage.adfu;
import defpackage.adfv;
import defpackage.adhd;
import defpackage.adko;
import defpackage.adlm;
import defpackage.aqxo;
import defpackage.aqxt;
import defpackage.arco;
import defpackage.arcy;
import defpackage.arjm;
import defpackage.arxd;
import defpackage.asop;
import defpackage.asqh;
import defpackage.assw;
import defpackage.azmp;
import defpackage.azne;
import defpackage.aznn;
import defpackage.azns;
import defpackage.bqpv;
import defpackage.cwal;
import defpackage.dezt;
import defpackage.dfab;
import defpackage.dfae;
import defpackage.dfah;
import defpackage.dfak;
import defpackage.dfap;
import defpackage.dfaq;
import defpackage.dvni;
import defpackage.edgl;
import defpackage.eijr;
import defpackage.ejxs;
import defpackage.ejxz;
import defpackage.ejya;
import defpackage.ejyk;
import defpackage.ejyl;
import defpackage.ejzh;
import defpackage.ekcs;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fkdo;
import defpackage.fkds;
import defpackage.fkkt;
import defpackage.fkkz;
import defpackage.fkli;
import defpackage.fklx;
import defpackage.fkns;
import defpackage.fnlp;
import defpackage.fuuw;
import defpackage.fvbo;
import defpackage.fwcg;
import defpackage.fwch;
import defpackage.ips;
import defpackage.jth;
import defpackage.jtu;
import defpackage.nce;
import defpackage.uyn;
import defpackage.vcw;
import defpackage.vfv;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class PreAddAccountChimeraActivity extends adko implements jth, aaxg {
    public static final aano h = new aano("is_frp_required");
    static final aano i = new aano("is_setup_wizard");
    static final aano j = new aano("is_resolve_frp_only");
    public static cwal k;
    private aaxq A;
    nce l;
    public adfv m;
    private Handler x;
    private final List y = new ArrayList();
    public final adfu n = new adfu(this);
    private final dezt z = new adfk();
    final Runnable o = new Runnable() { // from class: adey
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

    private final aaxq B() {
        PreAddAccountChimeraActivity preAddAccountChimeraActivity;
        if (this.A == null) {
            preAddAccountChimeraActivity = this;
            preAddAccountChimeraActivity.A = new aaxq(new azne(this), new aznn(this), new aaxl(new azne(this), new aznn(this)), new azns(this), preAddAccountChimeraActivity);
        } else {
            preAddAccountChimeraActivity = this;
        }
        return preAddAccountChimeraActivity.A;
    }

    public static final void q(ejyk ejykVar) {
        adlm adlmVar = new adlm();
        fecj v = ejya.a.v();
        ejxz ejxzVar = ejxz.AUTH_DEBUG_EVENT;
        if (!v.b.L()) {
            v.U();
        }
        ejya ejyaVar = (ejya) v.b;
        ejyaVar.e = ejxzVar.aw;
        ejyaVar.b |= 1;
        fecj v2 = ejyl.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        ejyl ejylVar = (ejyl) v2.b;
        ejykVar.getClass();
        ejylVar.e = ejykVar;
        ejylVar.b |= 4;
        if (!v.b.L()) {
            v.U();
        }
        ejya ejyaVar2 = (ejya) v.b;
        ejyl ejylVar2 = (ejyl) v2.Q();
        ejylVar2.getClass();
        ejyaVar2.X = ejylVar2;
        ejyaVar2.c |= 134217728;
        adlmVar.a((ejya) v.Q());
    }

    @Override // defpackage.jth
    public final jtu a(int i2, Bundle bundle) {
        Log.w("Auth", a.j(i2, "[AddAccount, PreAddAccountActivity] Starting loader with loaderId="));
        jtu acbwVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? null : new acbw(this) : new aboz(this) : new adfj(this, this, fkds.c()) : new adfs(this, this, fkds.c()) : new adfr(this, this, fkds.c()) : new adel(this);
        if (acbwVar != null) {
            this.y.add(acbwVar);
        }
        return acbwVar;
    }

    @Override // defpackage.jth
    public final /* bridge */ /* synthetic */ void b(jtu jtuVar, Object obj) {
        Bundle bundle = (Bundle) obj;
        int id = jtuVar.getId();
        Log.w("Auth", a.j(id, "[AddAccount, PreAddAccountActivity] Loader finished with loaderId="));
        if (id == 0) {
            this.m.c(bundle.getBoolean("checkin_loader_result", false));
            return;
        }
        if (id == 1) {
            o((FrpSnapshot) arxd.a(bundle.getByteArray("loader_result_frp"), FrpSnapshot.CREATOR));
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

    @Override // defpackage.jth
    public final void c(jtu jtuVar) {
        Log.w("Auth", "[AddAccount, PreAddAccountActivity] Loader reset with loaderId=" + jtuVar.getId());
    }

    @Override // defpackage.aaxg
    public final void d() {
        Log.w("Auth", "[PreAddAccountChimeraActivity] finishWithoutDelay with result=RESULT_OK");
        setResult(-1);
        finish();
    }

    @Override // defpackage.aaxg
    public final void e(int i2) {
        Log.w("Auth", String.format(Locale.US, "[AddAccount, PreAddAccountActivity] ManagedProvisioning result code: %d", Integer.valueOf(i2)));
        if (i2 == -1) {
            Log.w("Auth", "[PreAddAccountChimeraActivity] Triggering finish(resultCode, data) with result=RESULT_DPM_USER_COMPLETE");
            gD(111, null);
            return;
        }
        if (i2 == 0) {
            Log.w("Auth", "[PreAddAccountChimeraActivity] Triggering finish(resultCode, data) with result=RESULT_CANCELED");
            Intent intent = new Intent();
            aanp aanpVar = new aanp();
            aanpVar.d(AddAccountController.a, true);
            gD(0, intent.putExtras(aanpVar.a));
            return;
        }
        switch (i2) {
            case 120:
            case 121:
                g();
                break;
            case 122:
                Log.w("Auth", "[PreAddAccountChimeraActivity] Triggering finish(resultCode, data) with result=RESULT_WORK_PROFILE_CREATED");
                gD(122, null);
                break;
            case 123:
                Log.w("Auth", "[PreAddAccountChimeraActivity] Triggering finish(resultCode, data) with result=RESULT_DEVICE_OWNER_SET");
                gD(123, null);
                break;
            default:
                Log.e("Auth", String.format(Locale.US, "[AddAccount, PreAddAccountActivity] Unexpected ManagedProvisioning result code.", new Object[0]));
                Log.w("Auth", "[PreAddAccountChimeraActivity] Triggering finish(resultCode, data) with result=RESULT_DPM_USER_COMPLETE");
                gD(111, null);
                break;
        }
    }

    @Override // defpackage.aaxg
    public final void f(Intent intent) {
        if (fkdo.a.a().d()) {
            edgl.a(getIntent(), intent);
        }
        startActivityForResult(intent, 4);
    }

    @Override // defpackage.aaxg
    public final void g() {
        Log.w("Auth", "[PreAddAccountChimeraActivity] resuming Add account flow post ZT");
        p(true);
    }

    @Override // defpackage.adlg, defpackage.adkg
    public final void gD(final int i2, final Intent intent) {
        if (i2 == 0) {
            i2 = 0;
            if (intent != null && intent.getBooleanExtra(AddAccountController.a.a, false)) {
                this.x.removeCallbacksAndMessages(null);
                Log.w("Auth", "[PreAddAccountChimeraActivity] finish(resultCode, data) called with result=RESULT_CANCELED");
                super.gD(0, intent);
                return;
            }
        }
        if (fklx.a.a().c()) {
            this.x.removeCallbacksAndMessages(null);
        }
        long currentTimeMillis = System.currentTimeMillis() - this.m.f.longValue();
        dvni dvniVar = vfv.a;
        if (currentTimeMillis < fkkz.f()) {
            this.x.postDelayed(new Runnable() { // from class: adfg
                @Override // java.lang.Runnable
                public final void run() {
                    PreAddAccountChimeraActivity.this.l(i2, intent);
                }
            }, fkkz.f() - currentTimeMillis);
        } else {
            Log.w("Auth", a.j(i2, "[PreAddAccountChimeraActivity] finish(resultCode, data) triggered with resultCode="));
            super.gD(i2, intent);
        }
    }

    @Override // defpackage.adkg
    protected final String gG() {
        return "PreAddAccountActivity";
    }

    @Override // defpackage.adkg
    protected final void gH() {
        if (vcw.a.a(this)) {
            vcw.c(this, null);
        } else {
            super.gH();
        }
    }

    @Override // defpackage.aaxg
    public final void h() {
        Log.w("Auth", "[PreAddAccountChimeraActivity] finish(resultCode, data) called with result=RESULT_ZERO_TOUCH");
        gD(3, null);
    }

    final dfaq j(final String str, String[] strArr, final String str2) {
        dfaq a = arjm.a(k.bv(str, 251661004, strArr, null).d(this.z), fkkt.a.a().a(), TimeUnit.MILLISECONDS);
        a.y(new dfah() { // from class: adfb
            @Override // defpackage.dfah
            public final void gm(Exception exc) {
                Log.w("Auth", String.format(Locale.US, "[AddAccount, PreAddAccountActivity] ".concat(str2), new Object[0]), exc);
            }
        });
        a.z(new dfak() { // from class: adfc
            @Override // defpackage.dfak
            public final void gn(Object obj) {
                Log.w("Auth", String.format(Locale.US, "[AddAccount, PreAddAccountActivity] Sync successful:".concat(str), new Object[0]));
            }
        });
        if (asop.c(fkns.c())) {
            a.z(new dfak() { // from class: adfd
                @Override // defpackage.dfak
                public final void gn(Object obj) {
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
        super.gD(i2, intent);
    }

    public final /* synthetic */ void n(AccountManagerFuture accountManagerFuture) {
        try {
            Bundle bundle = (Bundle) accountManagerFuture.getResult();
            if (!bundle.containsKey("authAccount") || !bundle.containsKey("accountType")) {
                Log.w("Auth", "[PreAddAccountChimeraActivity] finish(resultCode, data) called with result=RESULT_CANCELED");
                gD(0, null);
            } else {
                aanp aanpVar = new aanp();
                aanpVar.d(AddAccountChimeraActivity.h, new Account(bundle.getString("authAccount"), bundle.getString("accountType")));
                Log.w("Auth", "[PreAddAccountChimeraActivity] finish(resultCode, data) called with result=RESULT_FINISH_SUCCESS");
                gD(31, new Intent().putExtras(aanpVar.a));
            }
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            Log.w("Auth", "[PreAddAccountChimeraActivity] Exception calling AccountManager#finishSession. finish(resultCode, data) called with result=RESULT_CANCELED", e);
            gD(0, null);
        }
    }

    public final void o(FrpSnapshot frpSnapshot) {
        this.m.d(frpSnapshot);
        boolean booleanExtra = getIntent().getBooleanExtra(i.a, false);
        if (!frpSnapshot.b || (booleanExtra && !frpSnapshot.c)) {
            int i2 = ips.a;
            if (!uyn.b(this)) {
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
        Runnable runnable = new Runnable() { // from class: adfh
            @Override // java.lang.Runnable
            public final void run() {
                Bundle bundle;
                PreAddAccountChimeraActivity preAddAccountChimeraActivity = PreAddAccountChimeraActivity.this;
                if (preAddAccountChimeraActivity.isFinishing() || preAddAccountChimeraActivity.isChangingConfigurations()) {
                    return;
                }
                preAddAccountChimeraActivity.m.j = true;
                Log.e("Auth", "stack trace for startFrpUnlock", new Exception());
                FrpSnapshot frpSnapshot2 = preAddAccountChimeraActivity.m.c;
                int i3 = ips.a;
                if (bqna.b(preAddAccountChimeraActivity).p("com.google").length <= 0 && frpSnapshot2.d) {
                    dvni dvniVar = vfv.a;
                    if (fkkz.o() && asqh.d()) {
                        KeyguardManager keyguardManager = (KeyguardManager) preAddAccountChimeraActivity.getSystemService("keyguard");
                        CharSequence text = preAddAccountChimeraActivity.getResources().getText(R.string.auth_frp_preadd_lkscreen_fwd);
                        fkgt.c();
                        Intent a = adft.a(keyguardManager, text);
                        if (a == null) {
                            preAddAccountChimeraActivity.n.a(2);
                            return;
                        }
                        edgl.a(preAddAccountChimeraActivity.getIntent(), a);
                        preAddAccountChimeraActivity.startActivityForResult(a, 2);
                        AppContextProvider.a();
                        eijr eijrVar = bqqe.a;
                        bqqa.a(aseu.AUTH_ACCOUNT_BASE_FACTORY_RESET_PROTECTION_SHOWN);
                        return;
                    }
                }
                Intent intent = preAddAccountChimeraActivity.getIntent();
                if (intent.getExtras() != null && (bundle = D2dOptions.b(intent.getExtras()).f) != null && bundle.getBoolean("source_not_transferring_new_account")) {
                    preAddAccountChimeraActivity.m.d(new FrpSnapshot(true, false, false));
                } else if (((KeyguardManager) preAddAccountChimeraActivity.getSystemService("keyguard")).isKeyguardSecure()) {
                    fkio.d();
                    Intent intent2 = new Intent("android.app.action.CONFIRM_DEVICE_CREDENTIAL");
                    edgl.a(preAddAccountChimeraActivity.getIntent(), intent2);
                    preAddAccountChimeraActivity.startActivityForResult(intent2, 1);
                    return;
                }
                preAddAccountChimeraActivity.m.b(true);
            }
        };
        dvni dvniVar = vfv.a;
        handler.postDelayed(runnable, currentTimeMillis < fkkz.f() ? fkkz.f() - currentTimeMillis : 0L);
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
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
                int i4 = ips.a;
                r(5);
                this.n.a(2);
                return;
            } else if (i3 != 1) {
                r(3);
                int i5 = ips.a;
                this.m.b(false);
                return;
            } else {
                int i6 = ips.a;
                r(4);
                this.m.b(true);
                return;
            }
        }
        if (i2 != 4) {
            Log.w("Auth", String.format(Locale.US, a.j(i2, "[AddAccount, PreAddAccountActivity] Unrecognized request code: "), new Object[0]));
            return;
        }
        aaxq B = B();
        aaxp aaxpVar = new aaxp(i3, this);
        aqxt aqxtVar = B.a;
        final MpCompleteRequest mpCompleteRequest = new MpCompleteRequest(i3);
        arcy arcyVar = new arcy();
        arcyVar.c = new Feature[]{azmp.b};
        arcyVar.a = new arco() { // from class: azna
            @Override // defpackage.arco
            public final void d(Object obj, Object obj2) {
                aznd azndVar = new aznd((dfau) obj2);
                ComplianceOptions complianceOptions = new ComplianceOptions(-1, -1, 0, true);
                azmw azmwVar = (azmw) ((azms) obj).H();
                ApiMetadata apiMetadata = new ApiMetadata(complianceOptions);
                Parcel fr = azmwVar.fr();
                oto.e(fr, MpCompleteRequest.this);
                oto.g(fr, azndVar);
                oto.e(fr, apiMetadata);
                azmwVar.ft(2, fr);
            }
        };
        arcyVar.b = false;
        arcyVar.d = 12602;
        dfaq iO = ((aqxo) aqxtVar).iO(arcyVar.a());
        iO.a(aaxpVar);
        iO.y(aaxpVar);
        iO.z(aaxpVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c2  */
    @Override // defpackage.adko, defpackage.adlg, defpackage.adkg, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 834
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.uiflows.addaccount.PreAddAccountChimeraActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onPause() {
        super.onPause();
        Intent intent = getIntent();
        int i2 = addu.a;
        SetupMetric.a("PreAddAccountLoading");
        addu.a(intent);
    }

    @Override // defpackage.adkg, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onResume() {
        super.onResume();
        Intent intent = getIntent();
        int i2 = addu.a;
        SetupMetric.b("PreAddAccountLoading");
        addu.a(intent);
    }

    @Override // defpackage.adkg, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        adfv adfvVar = this.m;
        Long l = adfvVar.f;
        if (l != null) {
            bundle.putLong("state.create_time", l.longValue());
        }
        Boolean bool = adfvVar.a;
        if (bool != null) {
            bundle.putBoolean("state.checkin_result", bool.booleanValue());
        }
        Boolean bool2 = adfvVar.b;
        if (bool2 != null) {
            bundle.putBoolean("state.challenge_result", bool2.booleanValue());
        }
        FrpSnapshot frpSnapshot = adfvVar.c;
        if (frpSnapshot != null) {
            bundle.putByteArray("state.frp_snapshot", arxd.n(frpSnapshot));
        }
        bundle.putBoolean("state.phenotype_sync", adfvVar.g);
        bundle.putBoolean("state.is_challenge_started", adfvVar.j);
        Bundle bundle2 = adfvVar.h;
        if (bundle2 != null && !bundle2.isEmpty()) {
            bundle.putBundle("state.account_seeding_result", adfvVar.h);
            bundle.putBoolean("state.finish_session_started", adfvVar.i);
        }
        bundle.putBoolean("state.has_launched_zt", adfvVar.k.get());
        Boolean bool3 = adfvVar.d;
        if (bool3 != null) {
            bundle.putBoolean("state.ps_education_required", bool3.booleanValue());
        }
        Boolean bool4 = adfvVar.e;
        if (bool4 != null) {
            bundle.putBoolean("state.key_attestation_check_failed", bool4.booleanValue());
        }
    }

    @Override // defpackage.adkg, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStop() {
        super.onStop();
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            ((jtu) it.next()).cancelLoad();
        }
        fuuw fuuwVar = adhd.f;
        if (fuuwVar == null) {
            fvbo.j("lazyInstanceProvider");
            fuuwVar = null;
        }
        ((nce) fuuwVar.a()).close();
    }

    public final void p(boolean z) {
        aanp aanpVar = new aanp();
        if (fkli.c()) {
            aano aanoVar = acbw.c;
            Boolean bool = this.m.d;
            aanpVar.d(aanoVar, Boolean.valueOf(bool != null && bool.booleanValue()));
        }
        aano aanoVar2 = aboz.c;
        Boolean bool2 = this.m.e;
        aanpVar.d(aanoVar2, Boolean.valueOf(bool2 != null && bool2.booleanValue()));
        if (!this.m.a.booleanValue() || !this.m.b.booleanValue()) {
            if (this.m.b.booleanValue()) {
                Log.w("Auth", "[PreAddAccountChimeraActivity] finish(resultCode, data) called with result=RESULT_ERROR");
                gD(2, null);
                return;
            } else {
                aanpVar.d(AddAccountController.a, true);
                Log.w("Auth", "[PreAddAccountChimeraActivity] finish(resultCode, data) called with result=RESULT_CANCELED");
                gD(0, new Intent().putExtras(aanpVar.a));
                return;
            }
        }
        Bundle bundle = this.m.h;
        if (bundle != null && !bundle.isEmpty()) {
            adfv adfvVar = this.m;
            if (adfvVar.i) {
                return;
            }
            adfvVar.i = true;
            ((AccountManager) getSystemService(AccountManager.class)).finishSession(this.m.h, getContainerActivity(), new AccountManagerCallback() { // from class: adfa
                @Override // android.accounts.AccountManagerCallback
                public final void run(AccountManagerFuture accountManagerFuture) {
                    PreAddAccountChimeraActivity.this.n(accountManagerFuture);
                }
            }, null);
            return;
        }
        if (!z && bqpv.a(new eijr() { // from class: adfi
            @Override // defpackage.eijr
            public final Object a() {
                return Boolean.valueOf(fnlp.d());
            }
        }, "work:zero_touch_config_present", getContentResolver()) && getIntent().getBooleanExtra(i.a, false)) {
            boolean booleanExtra = getIntent().getBooleanExtra(j.a, false);
            if (bqpv.a(new eijr() { // from class: adez
                @Override // defpackage.eijr
                public final Object a() {
                    return Boolean.valueOf(fnlp.a.a().g());
                }
            }, "ZeroTouchFeature__skip_zero_touch_frp_extra_present", getContentResolver())) {
                if (!booleanExtra) {
                    booleanExtra = false;
                }
            }
            fnlp fnlpVar = fnlp.a;
            if (!fnlpVar.a().f() || booleanExtra || !this.m.c.c) {
                if (this.m.k.compareAndSet(false, true)) {
                    aaxq B = B();
                    Log.i("Auth", "[ZeroTouchManagerImpl] Launching ZT flow.");
                    eijr eijrVar = new eijr() { // from class: aaxm
                        @Override // defpackage.eijr
                        public final Object a() {
                            return Boolean.valueOf(fnlp.d());
                        }
                    };
                    Context context = B.c;
                    if (!bqpv.a(eijrVar, "work:zero_touch_config_present", context.getContentResolver())) {
                        Log.w("Auth", "[ZeroTouchManagerImpl] ZT config not present.");
                        g();
                        return;
                    }
                    if (!fnlpVar.a().c()) {
                        Context context2 = ((azne) B.a).a;
                        assw asswVar = new assw(context2);
                        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context2.getSystemService("device_policy");
                        if (!asqh.e() || context2.getPackageManager().isSafeMode() || devicePolicyManager.isDeviceProvisioned() || devicePolicyManager.isDeviceProvisioningConfigApplied() || !new azns(context2).a(asswVar)) {
                            Log.w("Auth", "[ZeroTouchManagerImpl] Device conditions not met.");
                            DevicePolicyManager devicePolicyManager2 = (DevicePolicyManager) context.getSystemService("device_policy");
                            if (devicePolicyManager2 == null || !devicePolicyManager2.isDeviceProvisioningConfigApplied() || !bqpv.a(new eijr() { // from class: aaxn
                                @Override // defpackage.eijr
                                public final Object a() {
                                    return Boolean.valueOf(fnlp.a.a().e());
                                }
                            }, "ZeroTouchFeature__read_mp_result_in_auth", context.getContentResolver())) {
                                g();
                                return;
                            }
                            Log.i("Auth", "ZT flow triggered in suw again. Will try to skip forward to the rest of suw.");
                            aqxt aqxtVar = B.b;
                            arcy arcyVar = new arcy();
                            arcyVar.c = new Feature[]{azmp.e};
                            arcyVar.a = new arco() { // from class: azng
                                @Override // defpackage.arco
                                public final void d(Object obj, Object obj2) {
                                    int i2 = aznn.a;
                                    aznm aznmVar = new aznm((dfau) obj2);
                                    azmu azmuVar = (azmu) ((azmt) obj).H();
                                    Parcel fr = azmuVar.fr();
                                    oto.g(fr, aznmVar);
                                    azmuVar.ft(4, fr);
                                }
                            };
                            arcyVar.b = false;
                            arcyVar.d = 12609;
                            ((aqxo) aqxtVar).iO(arcyVar.a()).x(new dfae() { // from class: aaxo
                                @Override // defpackage.dfae
                                public final void hr(dfaq dfaqVar) {
                                    aaxg aaxgVar = aaxg.this;
                                    if (dfaqVar.m() && ((Integer) dfaqVar.i()).intValue() != Integer.MIN_VALUE) {
                                        aaxgVar.e(((Integer) dfaqVar.i()).intValue());
                                    } else {
                                        Log.w("Auth", "Failed to retrieve MP result code.");
                                        aaxgVar.g();
                                    }
                                }
                            });
                            return;
                        }
                    }
                    fecj v = fwcg.a.v();
                    if (!v.b.L()) {
                        v.U();
                    }
                    fecp fecpVar = v.b;
                    fwcg fwcgVar = (fwcg) fecpVar;
                    fwcgVar.c = 1;
                    fwcgVar.b |= 1;
                    if (!fecpVar.L()) {
                        v.U();
                    }
                    fecp fecpVar2 = v.b;
                    fwcg fwcgVar2 = (fwcg) fecpVar2;
                    fwcgVar2.d = 1;
                    fwcgVar2.b |= 2;
                    if (!fecpVar2.L()) {
                        v.U();
                    }
                    fwcg fwcgVar3 = (fwcg) v.b;
                    fwcgVar3.e = 1;
                    fwcgVar3.b |= 4;
                    fecj v2 = fwch.a.v();
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    fwch fwchVar = (fwch) v2.b;
                    fwchVar.c = 2;
                    fwchVar.b |= 1;
                    if (!v.b.L()) {
                        v.U();
                    }
                    fwcg fwcgVar4 = (fwcg) v.b;
                    fwch fwchVar2 = (fwch) v2.Q();
                    fwchVar2.getClass();
                    fwcgVar4.g = fwchVar2;
                    fwcgVar4.b |= 16;
                    fwcg fwcgVar5 = (fwcg) v.Q();
                    aqxt aqxtVar2 = B.b;
                    final ConsentedLoggingRequest consentedLoggingRequest = new ConsentedLoggingRequest(fwcgVar5);
                    arcy arcyVar2 = new arcy();
                    arcyVar2.c = new Feature[]{azmp.d};
                    arcyVar2.a = new arco() { // from class: aznh
                        @Override // defpackage.arco
                        public final void d(Object obj, Object obj2) {
                            int i2 = aznn.a;
                            aznl aznlVar = new aznl((dfau) obj2);
                            azmu azmuVar = (azmu) ((azmt) obj).H();
                            Parcel fr = azmuVar.fr();
                            oto.e(fr, ConsentedLoggingRequest.this);
                            oto.g(fr, aznlVar);
                            azmuVar.ft(2, fr);
                        }
                    };
                    arcyVar2.b = false;
                    arcyVar2.d = 12604;
                    ((aqxo) aqxtVar2).iT(arcyVar2.a());
                    final aaxl aaxlVar = B.d;
                    aqxt aqxtVar3 = aaxlVar.b;
                    arcy arcyVar3 = new arcy();
                    arcyVar3.c = new Feature[]{azmp.c};
                    arcyVar3.a = new arco() { // from class: azni
                        @Override // defpackage.arco
                        public final void d(Object obj, Object obj2) {
                            int i2 = aznn.a;
                            aznk aznkVar = new aznk((dfau) obj2);
                            azmu azmuVar = (azmu) ((azmt) obj).H();
                            Parcel fr = azmuVar.fr();
                            oto.e(fr, null);
                            oto.g(fr, aznkVar);
                            azmuVar.ft(1, fr);
                        }
                    };
                    arcyVar3.b = false;
                    arcyVar3.d = 12603;
                    dfaq f = ((aqxo) aqxtVar3).iO(arcyVar3.a()).f(new dfap() { // from class: aaxh
                        @Override // defpackage.dfap
                        public final dfaq a(Object obj) {
                            if (((LoadModuleResult) obj).a != 0) {
                                return dfbl.b();
                            }
                            aaxl aaxlVar2 = aaxl.this;
                            arcy arcyVar4 = new arcy();
                            arcyVar4.c = new Feature[]{azmp.a};
                            arcyVar4.a = new arco() { // from class: azmz
                                @Override // defpackage.arco
                                public final void d(Object obj2, Object obj3) {
                                    aznc azncVar = new aznc((dfau) obj3);
                                    ComplianceOptions complianceOptions = new ComplianceOptions(-1, -1, 0, true);
                                    azmw azmwVar = (azmw) ((azms) obj2).H();
                                    ApiMetadata apiMetadata = new ApiMetadata(complianceOptions);
                                    Parcel fr = azmwVar.fr();
                                    oto.e(fr, null);
                                    oto.g(fr, azncVar);
                                    oto.e(fr, apiMetadata);
                                    azmwVar.ft(1, fr);
                                }
                            };
                            arcyVar4.b = false;
                            arcyVar4.d = 12601;
                            return ((aqxo) aaxlVar2.a).iO(arcyVar4.a());
                        }
                    });
                    f.a(new dfab() { // from class: aaxi
                        @Override // defpackage.dfab
                        public final void jH() {
                            aaxg.this.h();
                        }
                    });
                    f.y(new dfah() { // from class: aaxj
                        @Override // defpackage.dfah
                        public final void gm(Exception exc) {
                            Log.e("Auth", "API call failed with exception: ".concat(String.valueOf(Log.getStackTraceString(exc))));
                            aaxg.this.h();
                        }
                    });
                    f.z(new dfak() { // from class: aaxk
                        @Override // defpackage.dfak
                        public final void gn(Object obj) {
                            ZeroTouchFlowResult zeroTouchFlowResult = (ZeroTouchFlowResult) obj;
                            int i2 = zeroTouchFlowResult.a;
                            Log.w("Auth", a.j(i2, "[ZeroTouchLauncherImpl] onZeroTouchFlowSuccess with status="));
                            aaxg aaxgVar = aaxg.this;
                            if (i2 == 1) {
                                aaxgVar.f(zeroTouchFlowResult.b);
                            } else if (i2 != 2) {
                                aaxgVar.h();
                            } else {
                                aaxgVar.g();
                            }
                        }
                    });
                    return;
                }
                return;
            }
        }
        aanpVar.d(h, Boolean.valueOf(this.m.c.c));
        Log.w("Auth", "[PreAddAccountChimeraActivity] finish(resultCode, data) called with result=RESULT_OK");
        gD(-1, new Intent().putExtras(aanpVar.a));
    }

    protected final void r(int i2) {
        dvni dvniVar = vfv.a;
        if (fkkz.a.a().M()) {
            ejzh ejzhVar = ejzh.a;
            fecj v = ejzhVar.v();
            if ((((ejya) w().b).b & 32768) != 0) {
                ejzh ejzhVar2 = ((ejya) w().b).p;
                if (ejzhVar2 != null) {
                    ejzhVar = ejzhVar2;
                }
                v = (fecj) ejzhVar.iB(5, null);
                v.X(ejzhVar);
            }
            ejxs ejxsVar = ejxs.a;
            fecj v2 = ejxsVar.v();
            ejzh ejzhVar3 = (ejzh) v.b;
            if ((ejzhVar3.b & 256) != 0) {
                ejxs ejxsVar2 = ejzhVar3.k;
                if (ejxsVar2 != null) {
                    ejxsVar = ejxsVar2;
                }
                v2 = (fecj) ejxsVar.iB(5, null);
                v2.X(ejxsVar);
            }
            fecj v3 = ekcs.a.v();
            if (!v3.b.L()) {
                v3.U();
            }
            fecp fecpVar = v3.b;
            ekcs ekcsVar = (ekcs) fecpVar;
            ekcsVar.d = i2 - 1;
            ekcsVar.b |= 2;
            boolean z = i2 == 5;
            if (!fecpVar.L()) {
                v3.U();
            }
            ekcs ekcsVar2 = (ekcs) v3.b;
            ekcsVar2.b |= 1;
            ekcsVar2.c = z;
            ekcs ekcsVar3 = (ekcs) v3.Q();
            if (!v2.b.L()) {
                v2.U();
            }
            ejxs ejxsVar3 = (ejxs) v2.b;
            ekcsVar3.getClass();
            ejxsVar3.c = ekcsVar3;
            ejxsVar3.b |= 2;
            if (!v.b.L()) {
                v.U();
            }
            ejzh ejzhVar4 = (ejzh) v.b;
            ejxs ejxsVar4 = (ejxs) v2.Q();
            ejxsVar4.getClass();
            ejzhVar4.k = ejxsVar4;
            ejzhVar4.b |= 256;
            fecj w = w();
            ejzh ejzhVar5 = (ejzh) v.Q();
            if (!w.b.L()) {
                w.U();
            }
            ejya ejyaVar = (ejya) w.b;
            ejzhVar5.getClass();
            ejyaVar.p = ejzhVar5;
            ejyaVar.b |= 32768;
        }
    }
}
