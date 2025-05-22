package com.google.android.gms.auth.uiflows.minutemaid;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.android.volley.DefaultRetryPolicy;
import com.google.android.cast.JGCastService;
import com.google.android.gms.R;
import com.google.android.gms.auth.aang.ReauthResponse;
import com.google.android.gms.auth.firstparty.shared.SupervisedAccountOptions;
import com.google.android.gms.auth.uiflows.addaccount.AccountDetail;
import com.google.android.gms.auth.uiflows.addaccount.AddAccountChimeraActivity;
import com.google.android.setupcompat.logging.SetupMetric;
import defpackage.acnd;
import defpackage.acne;
import defpackage.acnh;
import defpackage.acno;
import defpackage.acnp;
import defpackage.afdw;
import defpackage.afeg;
import defpackage.afeh;
import defpackage.afji;
import defpackage.afjs;
import defpackage.afjt;
import defpackage.afju;
import defpackage.afjv;
import defpackage.afjw;
import defpackage.afjx;
import defpackage.afjy;
import defpackage.afjz;
import defpackage.afln;
import defpackage.aflt;
import defpackage.aflw;
import defpackage.afma;
import defpackage.afmy;
import defpackage.afnb;
import defpackage.afnc;
import defpackage.afne;
import defpackage.afop;
import defpackage.afou;
import defpackage.apzg;
import defpackage.atmr;
import defpackage.atmt;
import defpackage.atzs;
import defpackage.aury;
import defpackage.ausj;
import defpackage.bp;
import defpackage.btjm;
import defpackage.buck;
import defpackage.cvso;
import defpackage.cwdy;
import defpackage.dg;
import defpackage.dxyi;
import defpackage.efqg;
import defpackage.efqm;
import defpackage.elgo;
import defpackage.elpg;
import defpackage.emlk;
import defpackage.emll;
import defpackage.emsv;
import defpackage.emtv;
import defpackage.emtw;
import defpackage.ew;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fmtw;
import defpackage.fmua;
import defpackage.fmvc;
import defpackage.fnbo;
import defpackage.fndz;
import defpackage.fneh;
import defpackage.wls;
import defpackage.wyw;
import defpackage.xbw;
import j$.time.Instant;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class MinuteMaidChimeraActivity extends afln implements afop, afeg, acnd {
    public long A;
    public int B;
    private Handler J;
    private afou K;
    private String L;
    public ViewGroup x;
    acne y;
    public boolean z = false;
    public static final acno h = new acno("auth_code");
    public static final acno i = new acno("obfuscated_gaia_id");
    public static final acno j = new acno("account_name");
    public static final acno k = new acno("account_password");
    public static final acno l = new acno("terms_of_service_accepted");
    public static final acno m = new acno("error_message");
    public static final acno n = new acno("accounts");
    public static final acno o = new acno("reauth_response");
    private static final acno C = new acno("is_reauth");
    private static final acno D = new acno("is_deeplink");
    public static final acno r = new acno("is_setup_wizard");
    private static final acno E = new acno("immersive_mode_requested");
    private static final acno F = new acno("is_add_account_flow");
    private static final acno G = new acno("resolve_frp_only");
    private static final acno H = new acno("check_offers");
    private static final acno I = new acno("add_account_frag");
    public static final acno s = new acno("network_type");

    private final void M() {
        acne acneVar;
        Intent intent = getIntent();
        int i2 = afdw.a;
        SetupMetric.b("MinuteMaidLoading");
        afdw.a(intent);
        if (wyw.a.a(this)) {
            if (this.x.getChildCount() > 0) {
                ViewGroup viewGroup = this.x;
                viewGroup.removeView(viewGroup.getChildAt(0));
            }
            ViewGroup viewGroup2 = this.x;
            viewGroup2.addView(LayoutInflater.from(this).inflate(true != t().f ? R.layout.auth_tv_suw_glif_activity : R.layout.auth_tv_suw_glif_transparent_activity, viewGroup2, false));
            P(4, null);
            return;
        }
        Object obj = this.y;
        if (obj != null) {
            this.x.removeView((View) obj);
        }
        boolean i3 = atmr.i(t().a);
        if (i3 && (fmtw.e() || aury.l(this))) {
            acneVar = (acne) LayoutInflater.from(this).inflate(R.layout.auth_generic_suw_glif_activity_v2, (ViewGroup) null, false);
        } else {
            acneVar = (acne) LayoutInflater.from(this).inflate(true != i3 ? R.layout.auth_generic_suw_activity : R.layout.auth_generic_suw_glif_activity, (ViewGroup) null, false);
        }
        this.y = acneVar;
        acneVar.g();
        this.y.b(getText(R.string.auth_gls_name_checking_info_title));
        if (!((Boolean) s().b(afji.b, false)).booleanValue()) {
            this.y.a(ausj.c(fndz.b()));
        }
        this.y.f();
        this.y.d(this);
        Object obj2 = this.y;
        this.q = (acnh) obj2;
        this.x.addView((View) obj2);
        P(4, null);
    }

    private final void N() {
        if (!this.z) {
            fgrc fgrcVar = this.p.g;
            long epochMilli = Instant.now().minusMillis(this.A).toEpochMilli();
            if (!fgrcVar.b.L()) {
                fgrcVar.U();
            }
            emsv emsvVar = (emsv) fgrcVar.b;
            emsv emsvVar2 = emsv.a;
            emsvVar.b |= 64;
            emsvVar.h = epochMilli;
            Intent intent = getIntent();
            int i2 = afdw.a;
            SetupMetric.a("MinuteMaidLoading");
            afdw.a(intent);
        }
        r(afjt.a);
    }

    private final void O() {
        dg h2 = gY().h("AddAccountFragment");
        if (h2 != null) {
            bp bpVar = new bp(gY());
            bpVar.m(h2);
            bpVar.b();
        }
        s().d(I, false);
    }

    private final void P(int i2, String str) {
        findViewById(R.id.minute_maid).setImportantForAccessibility(i2);
        setTitle(str);
    }

    private final void Q() {
        int i2 = afdw.a;
        r(afjv.a);
    }

    public static Intent o(Context context, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, atmt atmtVar, String[] strArr, SupervisedAccountOptions supervisedAccountOptions, String str2, String str3, String str4, String str5, String str6, boolean z6, boolean z7, boolean z8, boolean z9, String str7, String str8, int i2, String str9) {
        elgo elgoVar;
        afjz afjzVar = afjz.c;
        if (strArr != null) {
            elgoVar = elgo.k(strArr);
        } else {
            int i3 = elgo.d;
            elgoVar = elpg.a;
        }
        Intent a = afjzVar.a(context, new afjs(str, z, z2, z3, z4, z5, atmtVar, elgoVar, str2, str3, str4, str5, str6, supervisedAccountOptions, z6, z7, z8, z9, str9, str7, str8, i2, false, false));
        a.getExtras();
        return a;
    }

    public static Intent p(Context context, Account account, boolean z, atmt atmtVar, String str) {
        afjz afjzVar = afjz.c;
        String str2 = account.type;
        int i2 = elgo.d;
        Intent a = afjzVar.a(context, new afjs(str2, false, false, false, false, z, atmtVar, elpg.a, account.name, null, null, null, null, null, false, false, false, false, str, null, null, 0, true, false));
        a.getExtras();
        return a;
    }

    public static Intent q(Context context, Account account, boolean z, atmt atmtVar, String str) {
        afjz afjzVar = afjz.c;
        String str2 = account.type;
        int i2 = elgo.d;
        Intent a = afjzVar.a(context, new afjs(str2, false, false, false, false, z, atmtVar, elpg.a, account.name, null, null, null, null, null, false, false, false, false, str, null, null, 0, false, false));
        a.getExtras();
        return a;
    }

    @Override // defpackage.afop
    public final void B() {
        acnp s2 = s();
        acno acnoVar = n;
        Parcelable[] parcelableArr = (Parcelable[]) s2.a(acnoVar);
        if (parcelableArr == null || parcelableArr.length == 0) {
            Log.w("Auth", String.format(Locale.US, "[MinuteMaid, MinuteMaidActivity] No accounts on finish", new Object[0]));
            r(afjv.a);
        } else {
            Intent intent = new Intent();
            acnp acnpVar = new acnp();
            acnpVar.d(acnoVar, parcelableArr);
            r(new afjw(intent.putExtras(acnpVar.a)));
        }
    }

    @Override // defpackage.afop
    public final void C(afne afneVar, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        fgrc fgrcVar = this.p.g;
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        emsv emsvVar = (emsv) fgrcVar.b;
        emsv emsvVar2 = emsv.a;
        emsvVar.b |= 2;
        emsvVar.d = z;
        if (z2 && z4) {
            afma.b();
            cvso cvsoVar = new cvso();
            cvsoVar.a = 80;
            afma.a(str, new cwdy(this, cvsoVar.a()), new aflt());
        }
        if (isFinishing()) {
            return;
        }
        if (!z3) {
            Intent intent = new Intent();
            acnp acnpVar = new acnp();
            acnpVar.d(h, afneVar.a);
            acnpVar.d(i, afneVar.b);
            acnpVar.d(j, str2);
            acnpVar.d(k, str3);
            acnpVar.d(afji.e, Boolean.valueOf(z));
            acnpVar.d(l, Boolean.valueOf(z2));
            r(new afjx(intent.putExtras(acnpVar.a)));
            return;
        }
        acnp s2 = s();
        acno acnoVar = h;
        String str4 = afneVar.a;
        s2.d(acnoVar, str4);
        acnp s3 = s();
        acno acnoVar2 = i;
        String str5 = afneVar.b;
        s3.d(acnoVar2, str5);
        s().d(afji.e, Boolean.valueOf(z));
        s().d(l, Boolean.valueOf(z2));
        acnp s4 = s();
        acno acnoVar3 = j;
        s4.d(acnoVar3, str2);
        s().d(I, true);
        ew gY = gY();
        dg h2 = gY.h("AddAccountFragment");
        if (h2 != null) {
            bp bpVar = new bp(gY);
            bpVar.m(h2);
            bpVar.b();
        }
        afeh.x(this, true, ((Boolean) s().b(G, false)).booleanValue(), (String) s().a(wls.b), str4, str5, (String) s().a(acnoVar3), z2, ((Boolean) s().b(H, false)).booleanValue(), t().c);
    }

    @Override // defpackage.afop
    public final void D(String str, String str2) {
        Log.e("Auth", String.format(Locale.US, "[MinuteMaid, MinuteMaidActivity] Error from MinuteMaidFragment: ".concat(String.valueOf(str2)), new Object[0]));
        fgrc fgrcVar = this.p.g;
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        emsv emsvVar = (emsv) fgrcVar.b;
        emsv emsvVar2 = emsv.a;
        emsvVar.e = 1;
        emsvVar.b |= 4;
        if (!this.z) {
            fgrc fgrcVar2 = this.p.g;
            long epochMilli = Instant.now().minusMillis(this.A).toEpochMilli();
            if (!fgrcVar2.b.L()) {
                fgrcVar2.U();
            }
            emsv emsvVar3 = (emsv) fgrcVar2.b;
            emsvVar3.b |= 64;
            emsvVar3.h = epochMilli;
        }
        r(new afju(new Intent().putExtra(m.a, str)));
    }

    @Override // defpackage.afop
    public final void E() {
        if (this.z) {
            return;
        }
        runOnUiThread(new afnb(this));
    }

    public final void F() {
        ViewGroup viewGroup = (ViewGroup) this.x.getParent();
        viewGroup.removeView(this.x);
        P(0, this.L);
        if (wyw.a.a(this) && t().f) {
            int i2 = t().g;
            viewGroup.setBackgroundColor(i2);
            if (Color.alpha(i2) == 255) {
                convertFromTranslucent();
            }
        }
        Intent intent = getIntent();
        int i3 = afdw.a;
        SetupMetric.a("MinuteMaidLoading");
        Bundle bundle = new Bundle();
        bundle.putLong("timestamp", efqg.a());
        new SetupMetric("MinuteMaid", 2, efqm.b(bundle));
        afdw.a(intent);
    }

    @Override // defpackage.afop
    public final void G(ReauthResponse reauthResponse) {
        fgrc v = emtw.a.v();
        if (!v.b.L()) {
            v.U();
        }
        int i2 = reauthResponse.a;
        emtw emtwVar = (emtw) v.b;
        int a = emtv.a(i2);
        if (a == 0) {
            throw null;
        }
        emtwVar.c = a - 1;
        emtwVar.b |= 1;
        emtw emtwVar2 = (emtw) v.Q();
        fgrc v2 = emll.a.v();
        emlk emlkVar = emlk.REAUTH_EVENT;
        if (!v2.b.L()) {
            v2.U();
        }
        fgri fgriVar = v2.b;
        emll emllVar = (emll) fgriVar;
        emllVar.e = emlkVar.ar;
        emllVar.b |= 1;
        if (!fgriVar.L()) {
            v2.U();
        }
        emll emllVar2 = (emll) v2.b;
        emtwVar2.getClass();
        emllVar2.ae = emtwVar2;
        emllVar2.c |= JGCastService.FLAG_USE_TDLS;
        btjm l2 = buck.v().l((emll) v2.Q());
        l2.c = Integer.valueOf(DefaultRetryPolicy.DEFAULT_TIMEOUT_MS);
        l2.a();
        r(new afjx(new Intent().putExtra(o.a, atzs.n(reauthResponse))));
    }

    @Override // defpackage.afop
    public final void H(boolean z) {
        runOnUiThread(new afnc(this, z));
    }

    @Override // defpackage.afop
    public final void I() {
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage("com.google.android.androidforwork");
        if (launchIntentForPackage != null) {
            Log.i("Auth", String.format(Locale.US, "[MinuteMaid, MinuteMaidActivity] Starting Android for Work", new Object[0]));
            launchIntentForPackage.putExtra("com.google.android.androidforwork.PROVISIONING_TYPE", "device_owner");
            launchIntentForPackage.setFlags(33554432);
            startActivity(launchIntentForPackage);
            finish();
            return;
        }
        Log.e("Auth", String.format(Locale.US, "[MinuteMaid, MinuteMaidActivity] Could not find intent for Android for Work!", new Object[0]));
        fgrc fgrcVar = this.p.g;
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        emsv emsvVar = (emsv) fgrcVar.b;
        emsv emsvVar2 = emsv.a;
        emsvVar.e = 3;
        emsvVar.b |= 4;
        r(new afju(null));
    }

    @Override // defpackage.afop
    public final void J() {
        Q();
    }

    @Override // defpackage.afop
    public final void K(String str, boolean z) {
        Log.i("Auth", String.format(Locale.US, "[MinuteMaid, MinuteMaidActivity] onAccountNotAllowed", new Object[0]));
        fgrc fgrcVar = this.p.g;
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        emsv emsvVar = (emsv) fgrcVar.b;
        emsv emsvVar2 = emsv.a;
        emsvVar.e = 4;
        emsvVar.b = 4 | emsvVar.b;
        if (z) {
            r(afjt.a);
        } else {
            r(new afju(new Intent().putExtra(m.a, str)));
        }
    }

    @Override // defpackage.afop
    public final void L() {
        acnp s2 = s();
        acno acnoVar = E;
        s2.d(acnoVar, true);
        if (!((Boolean) s().b(afji.b, false)).booleanValue() || !((Boolean) s().b(acnoVar, true)).booleanValue()) {
            Window window = getWindow();
            acnh acnhVar = this.q;
            if (acnhVar != null) {
                acnhVar.h(window, this);
                return;
            }
            return;
        }
        Window window2 = getWindow();
        if (this.q != null) {
            if (ausj.c(fneh.b())) {
                this.q.j(window2);
            } else {
                this.q.i(window2);
            }
        }
    }

    @Override // defpackage.acnd
    public final void b() {
        Q();
    }

    @Override // defpackage.afkn
    protected final String gW() {
        return "MinuteMaidActivity";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (defpackage.efrl.v(r7) != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    @Override // defpackage.afkn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void gX() {
        /*
            r7 = this;
            wyw r0 = defpackage.wyw.a
            boolean r0 = r0.a(r7)
            if (r0 == 0) goto Ld
            r0 = 0
            defpackage.wyw.c(r7, r0)
            return
        Ld:
            atmt r0 = r7.t()
            boolean r0 = r0.c
            if (r0 == 0) goto L19
            super.gX()
            return
        L19:
            boolean r0 = defpackage.fmuz.c()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L41
            acnp r0 = r7.s()
            acno r3 = com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity.r
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r0 = r0.b(r3, r4)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3f
            int r0 = defpackage.efwn.a
            boolean r0 = defpackage.efrl.v(r7)
            if (r0 == 0) goto L41
        L3f:
            r0 = r1
            goto L42
        L41:
            r0 = r2
        L42:
            atmt r3 = r7.t()
            java.lang.String r3 = r3.a
            acnp r4 = r7.s()
            acno r5 = defpackage.afji.b
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r4 = r4.b(r5, r6)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.lang.String r5 = "minutemaid"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L68
            r3 = 2132153407(0x7f16143f, float:1.9948932E38)
            goto L7e
        L68:
            java.lang.String r5 = "clamshell"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L7a
            boolean r5 = defpackage.auub.a()
            if (r5 == 0) goto L7a
            r3 = 2132149056(0x7f160340, float:1.9940107E38)
            goto L7e
        L7a:
            int r3 = defpackage.atmr.b(r7, r3, r0)
        L7e:
            r7.setTheme(r3)
            esdc r3 = defpackage.fmzo.b()
            boolean r3 = defpackage.ausj.c(r3)
            if (r3 == 0) goto L95
            int r0 = defpackage.atmr.a(r7)
            if (r0 == 0) goto Lab
            r7.setTheme(r0)
            goto Lab
        L95:
            int r3 = defpackage.efwn.a
            boolean r3 = defpackage.efrl.w(r7)
            if (r3 == 0) goto La6
            if (r1 == r0) goto La3
            r2 = 2132150373(0x7f160865, float:1.9942779E38)
            goto La6
        La3:
            r2 = 2132150372(0x7f160864, float:1.9942777E38)
        La6:
            if (r2 == 0) goto Lab
            r7.setTheme(r2)
        Lab:
            if (r4 == 0) goto Lb4
            android.view.Window r0 = r7.getWindow()
            defpackage.eftf.c(r0)
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity.gX():void");
    }

    @Override // defpackage.afeg
    public final void j(Account account, String str, boolean z, Intent intent, boolean z2, String str2, boolean z3) {
        Parcelable[] parcelableArr;
        String.valueOf(account);
        AccountDetail accountDetail = new AccountDetail(account.name, account.type, ((Boolean) s().b(afji.e, false)).booleanValue(), str, z, intent, str2, z2, z3);
        if (fmua.a.lK().u()) {
            AddAccountChimeraActivity.o(this, w(), ((Boolean) s().b(r, false)).booleanValue(), str, z2, z);
        }
        acnp s2 = s();
        acno acnoVar = n;
        Parcelable[] parcelableArr2 = (Parcelable[]) s2.a(acnoVar);
        if (parcelableArr2 == null) {
            parcelableArr = new Parcelable[]{accountDetail};
        } else {
            int length = parcelableArr2.length;
            parcelableArr = (Parcelable[]) Arrays.copyOf(parcelableArr2, length + 1);
            parcelableArr[length] = accountDetail;
        }
        s().d(acnoVar, parcelableArr);
        this.K.O(new aflw(account.name, str != null ? 3 : 1));
        O();
        int i2 = afdw.a;
    }

    @Override // defpackage.afeg
    public final void k() {
        Log.e("Auth", String.format(Locale.US, "[MinuteMaid, MinuteMaidActivity] Callback.onError()", new Object[0]));
        this.K.O(new aflw("", 2));
        O();
    }

    @Override // defpackage.afeg
    public final void l(int i2) {
        throw new UnsupportedOperationException("To be implemented");
    }

    @Override // defpackage.afeg
    public final void n() {
        throw new UnsupportedOperationException("To be implemented");
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        if (this.K.V()) {
            return;
        }
        N();
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.z) {
            return;
        }
        M();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0168  */
    @Override // defpackage.afln, defpackage.afkn, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r33) {
        /*
            Method dump skipped, instructions count: 971
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onPause() {
        this.J.removeCallbacksAndMessages(null);
        super.onPause();
    }

    @Override // defpackage.afkn, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        if (this.z) {
            return;
        }
        Handler handler = this.J;
        afmy afmyVar = new afmy(this);
        dxyi dxyiVar = xbw.a;
        handler.postDelayed(afmyVar, fnbo.a.lK().k());
    }

    public final void r(afjy afjyVar) {
        if (fmvc.c() || !((Boolean) s().b(D, false)).booleanValue()) {
            gT(afjyVar.b, afjyVar.c);
        } else {
            A(afjyVar.b);
        }
    }

    @Override // com.google.android.chimera.Activity, com.google.android.chimera.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i2) {
        super.setTheme(i2);
        if (fmua.e()) {
            this.B = apzg.a(this, i2);
        }
    }

    @Override // defpackage.afop
    public final void x() {
        N();
    }
}
