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
import com.google.android.gms.R;
import com.google.android.gms.auth.aang.ReauthResponse;
import com.google.android.gms.auth.firstparty.shared.SupervisedAccountOptions;
import com.google.android.gms.auth.uiflows.addaccount.AccountDetail;
import com.google.android.gms.auth.uiflows.addaccount.AddAccountChimeraActivity;
import com.google.android.setupcompat.logging.SetupMetric;
import defpackage.aand;
import defpackage.aane;
import defpackage.aanh;
import defpackage.aano;
import defpackage.aanp;
import defpackage.addu;
import defpackage.adee;
import defpackage.adef;
import defpackage.adjb;
import defpackage.adjl;
import defpackage.adjm;
import defpackage.adjn;
import defpackage.adjo;
import defpackage.adjp;
import defpackage.adjq;
import defpackage.adjr;
import defpackage.adjs;
import defpackage.adlg;
import defpackage.adlm;
import defpackage.adlp;
import defpackage.adlt;
import defpackage.admr;
import defpackage.admu;
import defpackage.admv;
import defpackage.admx;
import defpackage.adoi;
import defpackage.adon;
import defpackage.anxo;
import defpackage.arkc;
import defpackage.arke;
import defpackage.arxd;
import defpackage.asoe;
import defpackage.asop;
import defpackage.bp;
import defpackage.brbv;
import defpackage.brup;
import defpackage.ctji;
import defpackage.ctus;
import defpackage.dg;
import defpackage.dvni;
import defpackage.eddl;
import defpackage.eddr;
import defpackage.eitj;
import defpackage.ejcb;
import defpackage.ejxz;
import defpackage.ejya;
import defpackage.ekfj;
import defpackage.ekgj;
import defpackage.ekgk;
import defpackage.ew;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fkdk;
import defpackage.fkdo;
import defpackage.fkeq;
import defpackage.fkkz;
import defpackage.fknk;
import defpackage.fkns;
import defpackage.upt;
import defpackage.vcw;
import defpackage.vfv;
import j$.time.Instant;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class MinuteMaidChimeraActivity extends adlg implements adoi, adee, aand {
    public long A;
    public int B;
    private Handler J;
    private adon K;
    private String L;
    public ViewGroup x;
    aane y;
    public boolean z = false;
    public static final aano h = new aano("auth_code");
    public static final aano i = new aano("obfuscated_gaia_id");
    public static final aano j = new aano("account_name");
    public static final aano k = new aano("account_password");
    public static final aano l = new aano("terms_of_service_accepted");
    public static final aano m = new aano("error_message");
    public static final aano n = new aano("accounts");
    public static final aano o = new aano("reauth_response");
    private static final aano C = new aano("is_reauth");
    private static final aano D = new aano("is_deeplink");
    public static final aano r = new aano("is_setup_wizard");
    private static final aano E = new aano("immersive_mode_requested");
    private static final aano F = new aano("is_add_account_flow");
    private static final aano G = new aano("resolve_frp_only");
    private static final aano H = new aano("check_offers");
    private static final aano I = new aano("add_account_frag");
    public static final aano s = new aano("network_type");

    private final void M() {
        aane aaneVar;
        Intent intent = getIntent();
        int i2 = addu.a;
        SetupMetric.b("MinuteMaidLoading");
        addu.a(intent);
        if (vcw.a.a(this)) {
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
        boolean i3 = arkc.i(t().a);
        if (i3 && (fkdk.e() || asoe.l(this))) {
            aaneVar = (aane) LayoutInflater.from(this).inflate(R.layout.auth_generic_suw_glif_activity_v2, (ViewGroup) null, false);
        } else {
            aaneVar = (aane) LayoutInflater.from(this).inflate(true != i3 ? R.layout.auth_generic_suw_activity : R.layout.auth_generic_suw_glif_activity, (ViewGroup) null, false);
        }
        this.y = aaneVar;
        aaneVar.g();
        this.y.b(getText(R.string.auth_gls_name_checking_info_title));
        if (!((Boolean) s().b(adjb.b, false)).booleanValue()) {
            this.y.a(asop.c(fknk.b()));
        }
        this.y.f();
        this.y.d(this);
        Object obj2 = this.y;
        this.q = (aanh) obj2;
        this.x.addView((View) obj2);
        P(4, null);
    }

    private final void N() {
        if (!this.z) {
            fecj fecjVar = this.p.g;
            long epochMilli = Instant.now().minusMillis(this.A).toEpochMilli();
            if (!fecjVar.b.L()) {
                fecjVar.U();
            }
            ekfj ekfjVar = (ekfj) fecjVar.b;
            ekfj ekfjVar2 = ekfj.a;
            ekfjVar.b |= 64;
            ekfjVar.h = epochMilli;
            Intent intent = getIntent();
            int i2 = addu.a;
            SetupMetric.a("MinuteMaidLoading");
            addu.a(intent);
        }
        r(adjm.a);
    }

    private final void O() {
        dg h2 = gI().h("AddAccountFragment");
        if (h2 != null) {
            bp bpVar = new bp(gI());
            bpVar.n(h2);
            bpVar.b();
        }
        s().d(I, false);
    }

    private final void P(int i2, String str) {
        findViewById(R.id.minute_maid).setImportantForAccessibility(i2);
        setTitle(str);
    }

    private final void Q() {
        int i2 = addu.a;
        r(adjo.a);
    }

    public static Intent o(Context context, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, arke arkeVar, String[] strArr, SupervisedAccountOptions supervisedAccountOptions, String str2, String str3, String str4, String str5, String str6, boolean z6, boolean z7, boolean z8, boolean z9, String str7, String str8, int i2, String str9) {
        eitj eitjVar;
        adjs adjsVar = adjs.c;
        if (strArr != null) {
            eitjVar = eitj.k(strArr);
        } else {
            int i3 = eitj.d;
            eitjVar = ejcb.a;
        }
        Intent a = adjsVar.a(context, new adjl(str, z, z2, z3, z4, z5, arkeVar, eitjVar, str2, str3, str4, str5, str6, supervisedAccountOptions, z6, z7, z8, z9, str9, str7, str8, i2, false, false));
        a.getExtras();
        return a;
    }

    public static Intent p(Context context, Account account, boolean z, arke arkeVar, String str) {
        adjs adjsVar = adjs.c;
        String str2 = account.type;
        int i2 = eitj.d;
        Intent a = adjsVar.a(context, new adjl(str2, false, false, false, false, z, arkeVar, ejcb.a, account.name, null, null, null, null, null, false, false, false, false, str, null, null, 0, true, false));
        a.getExtras();
        return a;
    }

    public static Intent q(Context context, Account account, boolean z, arke arkeVar, String str) {
        adjs adjsVar = adjs.c;
        String str2 = account.type;
        int i2 = eitj.d;
        Intent a = adjsVar.a(context, new adjl(str2, false, false, false, false, z, arkeVar, ejcb.a, account.name, null, null, null, null, null, false, false, false, false, str, null, null, 0, false, false));
        a.getExtras();
        return a;
    }

    @Override // defpackage.adoi
    public final void B() {
        aanp s2 = s();
        aano aanoVar = n;
        Parcelable[] parcelableArr = (Parcelable[]) s2.a(aanoVar);
        if (parcelableArr == null || parcelableArr.length == 0) {
            Log.w("Auth", String.format(Locale.US, "[MinuteMaid, MinuteMaidActivity] No accounts on finish", new Object[0]));
            r(adjo.a);
        } else {
            Intent intent = new Intent();
            aanp aanpVar = new aanp();
            aanpVar.d(aanoVar, parcelableArr);
            r(new adjp(intent.putExtras(aanpVar.a)));
        }
    }

    @Override // defpackage.adoi
    public final void C(admx admxVar, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        fecj fecjVar = this.p.g;
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        ekfj ekfjVar = (ekfj) fecjVar.b;
        ekfj ekfjVar2 = ekfj.a;
        ekfjVar.b |= 2;
        ekfjVar.d = z;
        if (z2 && z4) {
            adlt.b();
            ctji ctjiVar = new ctji();
            ctjiVar.a = 80;
            adlt.a(str, new ctus(this, ctjiVar.a()), new adlm());
        }
        if (isFinishing()) {
            return;
        }
        if (!z3) {
            Intent intent = new Intent();
            aanp aanpVar = new aanp();
            aanpVar.d(h, admxVar.a);
            aanpVar.d(i, admxVar.b);
            aanpVar.d(j, str2);
            aanpVar.d(k, str3);
            aanpVar.d(adjb.e, Boolean.valueOf(z));
            aanpVar.d(l, Boolean.valueOf(z2));
            r(new adjq(intent.putExtras(aanpVar.a)));
            return;
        }
        aanp s2 = s();
        aano aanoVar = h;
        String str4 = admxVar.a;
        s2.d(aanoVar, str4);
        aanp s3 = s();
        aano aanoVar2 = i;
        String str5 = admxVar.b;
        s3.d(aanoVar2, str5);
        s().d(adjb.e, Boolean.valueOf(z));
        s().d(l, Boolean.valueOf(z2));
        aanp s4 = s();
        aano aanoVar3 = j;
        s4.d(aanoVar3, str2);
        s().d(I, true);
        ew gI = gI();
        dg h2 = gI.h("AddAccountFragment");
        if (h2 != null) {
            bp bpVar = new bp(gI);
            bpVar.n(h2);
            bpVar.b();
        }
        adef.x(this, true, ((Boolean) s().b(G, false)).booleanValue(), (String) s().a(upt.b), str4, str5, (String) s().a(aanoVar3), z2, ((Boolean) s().b(H, false)).booleanValue(), t().c);
    }

    @Override // defpackage.adoi
    public final void D(String str, String str2) {
        Log.e("Auth", String.format(Locale.US, "[MinuteMaid, MinuteMaidActivity] Error from MinuteMaidFragment: ".concat(String.valueOf(str2)), new Object[0]));
        fecj fecjVar = this.p.g;
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        ekfj ekfjVar = (ekfj) fecjVar.b;
        ekfj ekfjVar2 = ekfj.a;
        ekfjVar.e = 1;
        ekfjVar.b |= 4;
        if (!this.z) {
            fecj fecjVar2 = this.p.g;
            long epochMilli = Instant.now().minusMillis(this.A).toEpochMilli();
            if (!fecjVar2.b.L()) {
                fecjVar2.U();
            }
            ekfj ekfjVar3 = (ekfj) fecjVar2.b;
            ekfjVar3.b |= 64;
            ekfjVar3.h = epochMilli;
        }
        r(new adjn(new Intent().putExtra(m.a, str)));
    }

    @Override // defpackage.adoi
    public final void E() {
        if (this.z) {
            return;
        }
        runOnUiThread(new admu(this));
    }

    public final void F() {
        ViewGroup viewGroup = (ViewGroup) this.x.getParent();
        viewGroup.removeView(this.x);
        P(0, this.L);
        if (vcw.a.a(this) && t().f) {
            int i2 = t().g;
            viewGroup.setBackgroundColor(i2);
            if (Color.alpha(i2) == 255) {
                convertFromTranslucent();
            }
        }
        Intent intent = getIntent();
        int i3 = addu.a;
        SetupMetric.a("MinuteMaidLoading");
        Bundle bundle = new Bundle();
        bundle.putLong("timestamp", eddl.a());
        new SetupMetric("MinuteMaid", 2, eddr.b(bundle));
        addu.a(intent);
    }

    @Override // defpackage.adoi
    public final void G(ReauthResponse reauthResponse) {
        fecj v = ekgk.a.v();
        if (!v.b.L()) {
            v.U();
        }
        int i2 = reauthResponse.a;
        ekgk ekgkVar = (ekgk) v.b;
        int a = ekgj.a(i2);
        if (a == 0) {
            throw null;
        }
        ekgkVar.c = a - 1;
        ekgkVar.b |= 1;
        ekgk ekgkVar2 = (ekgk) v.Q();
        fecj v2 = ejya.a.v();
        ejxz ejxzVar = ejxz.REAUTH_EVENT;
        if (!v2.b.L()) {
            v2.U();
        }
        fecp fecpVar = v2.b;
        ejya ejyaVar = (ejya) fecpVar;
        ejyaVar.e = ejxzVar.aw;
        ejyaVar.b |= 1;
        if (!fecpVar.L()) {
            v2.U();
        }
        ejya ejyaVar2 = (ejya) v2.b;
        ekgkVar2.getClass();
        ejyaVar2.ae = ekgkVar2;
        ejyaVar2.d |= 4;
        brbv l2 = brup.v().l((ejya) v2.Q());
        l2.c = Integer.valueOf(DefaultRetryPolicy.DEFAULT_TIMEOUT_MS);
        l2.a();
        r(new adjq(new Intent().putExtra(o.a, arxd.n(reauthResponse))));
    }

    @Override // defpackage.adoi
    public final void H(boolean z) {
        runOnUiThread(new admv(this, z));
    }

    @Override // defpackage.adoi
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
        fecj fecjVar = this.p.g;
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        ekfj ekfjVar = (ekfj) fecjVar.b;
        ekfj ekfjVar2 = ekfj.a;
        ekfjVar.e = 3;
        ekfjVar.b |= 4;
        r(new adjn(null));
    }

    @Override // defpackage.adoi
    public final void J() {
        Q();
    }

    @Override // defpackage.adoi
    public final void K(String str, boolean z) {
        Log.i("Auth", String.format(Locale.US, "[MinuteMaid, MinuteMaidActivity] onAccountNotAllowed", new Object[0]));
        fecj fecjVar = this.p.g;
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        ekfj ekfjVar = (ekfj) fecjVar.b;
        ekfj ekfjVar2 = ekfj.a;
        ekfjVar.e = 4;
        ekfjVar.b = 4 | ekfjVar.b;
        if (z) {
            r(adjm.a);
        } else {
            r(new adjn(new Intent().putExtra(m.a, str)));
        }
    }

    @Override // defpackage.adoi
    public final void L() {
        aanp s2 = s();
        aano aanoVar = E;
        s2.d(aanoVar, true);
        if (!((Boolean) s().b(adjb.b, false)).booleanValue() || !((Boolean) s().b(aanoVar, true)).booleanValue()) {
            Window window = getWindow();
            aanh aanhVar = this.q;
            if (aanhVar != null) {
                aanhVar.h(window, this);
                return;
            }
            return;
        }
        Window window2 = getWindow();
        if (this.q != null) {
            if (asop.c(fkns.b())) {
                this.q.j(window2);
            } else {
                this.q.i(window2);
            }
        }
    }

    @Override // defpackage.aand
    public final void b() {
        Q();
    }

    @Override // defpackage.adkg
    protected final String gG() {
        return "MinuteMaidActivity";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (defpackage.edeq.v(r7) != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    @Override // defpackage.adkg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void gH() {
        /*
            r7 = this;
            vcw r0 = defpackage.vcw.a
            boolean r0 = r0.a(r7)
            if (r0 == 0) goto Ld
            r0 = 0
            defpackage.vcw.c(r7, r0)
            return
        Ld:
            arke r0 = r7.t()
            boolean r0 = r0.c
            if (r0 == 0) goto L19
            super.gH()
            return
        L19:
            boolean r0 = defpackage.fken.c()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L41
            aanp r0 = r7.s()
            aano r3 = com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity.r
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r0 = r0.b(r3, r4)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3f
            int r0 = defpackage.edjs.a
            boolean r0 = defpackage.edeq.v(r7)
            if (r0 == 0) goto L41
        L3f:
            r0 = r1
            goto L42
        L41:
            r0 = r2
        L42:
            arke r3 = r7.t()
            java.lang.String r3 = r3.a
            aanp r4 = r7.s()
            aano r5 = defpackage.adjb.b
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r4 = r4.b(r5, r6)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.lang.String r5 = "minutemaid"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L68
            r3 = 2132153314(0x7f1613e2, float:1.9948744E38)
            goto L7e
        L68:
            java.lang.String r5 = "clamshell"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L7a
            boolean r5 = defpackage.asqh.a()
            if (r5 == 0) goto L7a
            r3 = 2132149052(0x7f16033c, float:1.99401E38)
            goto L7e
        L7a:
            int r3 = defpackage.arkc.b(r7, r3, r0)
        L7e:
            r7.setTheme(r3)
            eppd r3 = defpackage.fkiz.b()
            boolean r3 = defpackage.asop.c(r3)
            if (r3 == 0) goto L95
            int r0 = defpackage.arkc.a(r7)
            if (r0 == 0) goto Lab
            r7.setTheme(r0)
            goto Lab
        L95:
            int r3 = defpackage.edjs.a
            boolean r3 = defpackage.edeq.w(r7)
            if (r3 == 0) goto La6
            if (r1 == r0) goto La3
            r2 = 2132150366(0x7f16085e, float:1.9942764E38)
            goto La6
        La3:
            r2 = 2132150365(0x7f16085d, float:1.9942762E38)
        La6:
            if (r2 == 0) goto Lab
            r7.setTheme(r2)
        Lab:
            if (r4 == 0) goto Lb4
            android.view.Window r0 = r7.getWindow()
            defpackage.edgk.c(r0)
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity.gH():void");
    }

    @Override // defpackage.adee
    public final void j(Account account, String str, boolean z, Intent intent, boolean z2, String str2, boolean z3) {
        Parcelable[] parcelableArr;
        String.valueOf(account);
        AccountDetail accountDetail = new AccountDetail(account.name, account.type, ((Boolean) s().b(adjb.e, false)).booleanValue(), str, z, intent, str2, z2, z3);
        if (fkdo.a.a().t()) {
            AddAccountChimeraActivity.o(this, w(), ((Boolean) s().b(r, false)).booleanValue(), str, z2, z);
        }
        aanp s2 = s();
        aano aanoVar = n;
        Parcelable[] parcelableArr2 = (Parcelable[]) s2.a(aanoVar);
        if (parcelableArr2 == null) {
            parcelableArr = new Parcelable[]{accountDetail};
        } else {
            int length = parcelableArr2.length;
            parcelableArr = (Parcelable[]) Arrays.copyOf(parcelableArr2, length + 1);
            parcelableArr[length] = accountDetail;
        }
        s().d(aanoVar, parcelableArr);
        this.K.O(new adlp(account.name, str != null ? 3 : 1));
        O();
        int i2 = addu.a;
    }

    @Override // defpackage.adee
    public final void k() {
        Log.e("Auth", String.format(Locale.US, "[MinuteMaid, MinuteMaidActivity] Callback.onError()", new Object[0]));
        this.K.O(new adlp("", 2));
        O();
    }

    @Override // defpackage.adee
    public final void l(int i2) {
        throw new UnsupportedOperationException("To be implemented");
    }

    @Override // defpackage.adee
    public final void n() {
        throw new UnsupportedOperationException("To be implemented");
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        if (this.K.V()) {
            return;
        }
        N();
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
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
    @Override // defpackage.adlg, defpackage.adkg, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r32) {
        /*
            Method dump skipped, instructions count: 969
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onPause() {
        this.J.removeCallbacksAndMessages(null);
        super.onPause();
    }

    @Override // defpackage.adkg, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        super.onResume();
        if (this.z) {
            return;
        }
        Handler handler = this.J;
        admr admrVar = new admr(this);
        dvni dvniVar = vfv.a;
        handler.postDelayed(admrVar, fkkz.a.a().k());
    }

    public final void r(adjr adjrVar) {
        if (fkeq.c() || !((Boolean) s().b(D, false)).booleanValue()) {
            gD(adjrVar.b, adjrVar.c);
        } else {
            A(adjrVar.b);
        }
    }

    @Override // com.google.android.chimera.Activity, com.google.android.chimera.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i2) {
        super.setTheme(i2);
        if (fkdo.e()) {
            this.B = anxo.a(this, i2);
        }
    }

    @Override // defpackage.adoi
    public final void x() {
        N();
    }
}
