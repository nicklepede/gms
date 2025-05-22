package com.google.android.gms.family.v2.create;

import android.accounts.Account;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseIntArray;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.R;
import com.google.android.gms.family.v2.create.FamilyCreationChimeraActivity;
import com.google.android.gms.family.v2.model.BirthdayData;
import com.google.android.gms.family.v2.model.CanCreateFamilyData;
import com.google.android.gms.family.v2.model.PageData;
import com.google.android.gms.family.v2.model.PageDataMap;
import com.google.android.gms.family.v2.model.ProfileData;
import com.google.android.gms.family.v2.model.SetupParams;
import com.google.android.gms.family.v2.model.UpgradeParams;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.a;
import defpackage.apzg;
import defpackage.asxe;
import defpackage.aura;
import defpackage.auur;
import defpackage.bbtr;
import defpackage.bbtt;
import defpackage.bbtx;
import defpackage.bbty;
import defpackage.bbua;
import defpackage.bbud;
import defpackage.bbuj;
import defpackage.bbum;
import defpackage.bbvn;
import defpackage.bbyl;
import defpackage.bbym;
import defpackage.bbys;
import defpackage.bbyt;
import defpackage.bbyw;
import defpackage.bbyx;
import defpackage.bbyy;
import defpackage.bbzb;
import defpackage.bbze;
import defpackage.bbzh;
import defpackage.bbzk;
import defpackage.bbzo;
import defpackage.bbzr;
import defpackage.bbzu;
import defpackage.bbzx;
import defpackage.bcac;
import defpackage.bcak;
import defpackage.bcal;
import defpackage.bcan;
import defpackage.bcao;
import defpackage.bcav;
import defpackage.bcaw;
import defpackage.bcbt;
import defpackage.bcbu;
import defpackage.bccb;
import defpackage.bccc;
import defpackage.bcce;
import defpackage.bccf;
import defpackage.bcgo;
import defpackage.bcgp;
import defpackage.bcgr;
import defpackage.bcgs;
import defpackage.bp;
import defpackage.bsup;
import defpackage.bsur;
import defpackage.cq;
import defpackage.cuva;
import defpackage.cver;
import defpackage.dg;
import defpackage.dlbc;
import defpackage.ekvl;
import defpackage.elhz;
import defpackage.elqn;
import defpackage.eshb;
import defpackage.eshd;
import defpackage.esjf;
import defpackage.evbb;
import defpackage.evbc;
import defpackage.evbf;
import defpackage.evbg;
import defpackage.evmr;
import defpackage.ew;
import defpackage.exbu;
import defpackage.exbw;
import defpackage.exby;
import defpackage.exbz;
import defpackage.fgpr;
import defpackage.fgqp;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.fhbp;
import defpackage.fj;
import defpackage.fqep;
import defpackage.fqfa;
import defpackage.fqfe;
import defpackage.jzx;
import defpackage.rxx;
import defpackage.wib;
import java.util.ArrayList;
import java.util.Calendar;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class FamilyCreationChimeraActivity extends rxx implements bbyl, bcbt, bccb, bcgo, bcan, bbys, bcav, bcak, bcgr, bbud, bcce {
    private static final elhz D = new elqn("yt-tandem");
    public bbvn A;
    public bbtr B;
    public int C;
    private SparseIntArray E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private bbum J;
    private bbty K;
    public String j;
    public bbtt k;
    public byte[] l;
    public String m;
    public eshd n;
    public eshd o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public PageDataMap u;
    public UpgradeParams v;
    public SetupParams w;
    public ProfileData x;
    public CanCreateFamilyData y;
    public Calendar z;

    public FamilyCreationChimeraActivity() {
        eshd eshdVar = eshd.UNKNOWN_FAMILY_ROLE;
        this.n = eshdVar;
        this.o = eshdVar;
        this.C = 1;
    }

    private final Intent N() {
        Intent putExtra = new Intent().putExtra("accountName", this.j);
        putExtra.putExtra("familyChanged", this.H);
        this.k.b();
        if (!this.k.b().isEmpty()) {
            putExtra.putExtra("consistencyToken", this.k.b()).putExtra("tokenExpirationTimeSecs", this.k.a());
        }
        return putExtra;
    }

    private final fj O() {
        PageDataMap pageDataMap = this.u;
        if (pageDataMap != null && pageDataMap.c(4)) {
            bp bpVar = new bp(getSupportFragmentManager());
            String str = this.j;
            ekvl.y(str);
            PageDataMap pageDataMap2 = this.u;
            ekvl.y(pageDataMap2);
            PageData a = pageDataMap2.a(4);
            bcao bcaoVar = new bcao();
            Bundle bundle = new Bundle(2);
            bundle.putString("accountName", str);
            bundle.putParcelable("pageData", a);
            bcaoVar.setArguments(bundle);
            bpVar.F(R.id.fm_family_creation_fragment_container, bcaoVar);
            bpVar.w(null);
            return bpVar;
        }
        PageDataMap pageDataMap3 = this.u;
        if (pageDataMap3 != null && pageDataMap3.c(22)) {
            bp bpVar2 = new bp(getSupportFragmentManager());
            String str2 = this.j;
            ekvl.y(str2);
            PageDataMap pageDataMap4 = this.u;
            ekvl.y(pageDataMap4);
            PageData a2 = pageDataMap4.a(22);
            PageDataMap pageDataMap5 = this.u;
            ekvl.y(pageDataMap5);
            PageData a3 = pageDataMap5.a(18);
            PageDataMap pageDataMap6 = this.u;
            ekvl.y(pageDataMap6);
            bpVar2.F(R.id.fm_family_creation_fragment_container, bcal.x(str2, a2, a3, pageDataMap6.a(19)));
            bpVar2.w(null);
            return bpVar2;
        }
        PageDataMap pageDataMap7 = this.u;
        if (pageDataMap7 == null || !pageDataMap7.c(16)) {
            return null;
        }
        bp bpVar3 = new bp(getSupportFragmentManager());
        String str3 = this.j;
        ekvl.y(str3);
        PageDataMap pageDataMap8 = this.u;
        ekvl.y(pageDataMap8);
        PageData a4 = pageDataMap8.a(16);
        PageDataMap pageDataMap9 = this.u;
        ekvl.y(pageDataMap9);
        PageData a5 = pageDataMap9.a(18);
        PageDataMap pageDataMap10 = this.u;
        ekvl.y(pageDataMap10);
        bpVar3.F(R.id.fm_family_creation_fragment_container, bcaw.x(str3, a4, a5, pageDataMap10.a(19)));
        bpVar3.w(null);
        return bpVar3;
    }

    private final void P() {
        V();
        jzx.a(this).d(0, null, new bbzh(this));
    }

    private final void Q() {
        cq cqVar = (cq) getSupportFragmentManager().h("upgrade-preconditions");
        if (cqVar != null) {
            cqVar.dismissAllowingStateLoss();
        }
        getWindow().clearFlags(8192);
    }

    private final void R() {
        esjf[] esjfVarArr;
        if (I()) {
            q();
        }
        CanCreateFamilyData canCreateFamilyData = this.y;
        if (canCreateFamilyData != null && (esjfVarArr = canCreateFamilyData.b) != null && esjfVarArr.length > 0 && esjfVarArr[0] == esjf.LACKS_BIRTHDAY) {
            D();
            return;
        }
        ekvl.y(canCreateFamilyData);
        PageData pageData = canCreateFamilyData.c;
        String str = this.j;
        ekvl.y(str);
        bbtx.a(this, pageData, str, new bbyw(this), null, false).show();
    }

    private final void S() {
        jzx a = jzx.a(this);
        PageDataMap pageDataMap = this.u;
        ekvl.y(pageDataMap);
        if (!pageDataMap.c(35)) {
            q();
            if (this.s) {
                V();
                a.d(6, null, new bbzo(this));
                return;
            }
            return;
        }
        this.A.i(30);
        this.t = false;
        this.I = true;
        a.e(0);
        a.e(1);
        a.e(2);
        a.e(3);
        a.e(4);
        a.e(5);
        a.e(6);
        a.e(7);
        u();
    }

    private final void T() {
        bbtx.c(this, new bbyy(this), new DialogInterface.OnClickListener() { // from class: bbyv
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                FamilyCreationChimeraActivity.this.t();
            }
        }).show();
    }

    private final void U() {
        V();
        jzx.a(this).d(3, null, new bcac(this));
    }

    private final void V() {
        findViewById(R.id.fm_family_creation_loading_screen).setVisibility(0);
    }

    private final boolean W() {
        return getIntent().getBooleanExtra("isDirectAddInvitations", false);
    }

    private static final int X(boolean z, int i) {
        if (z) {
            return i;
        }
        return 3;
    }

    public final void A(int i) {
        this.E.delete(i);
    }

    public final void B(int i) {
        this.E.put(i, 1);
    }

    @Override // defpackage.bcbt, defpackage.bccb
    public final void C(boolean z) {
        this.I = z;
    }

    public final void D() {
        bbyt bbytVar;
        ProfileData profileData = this.x;
        if (profileData == null || profileData.f == null) {
            String str = this.j;
            ekvl.y(str);
            PageDataMap pageDataMap = this.u;
            ekvl.y(pageDataMap);
            PageData a = pageDataMap.a(3);
            PageDataMap pageDataMap2 = this.u;
            ekvl.y(pageDataMap2);
            PageData a2 = pageDataMap2.a(14);
            bbytVar = new bbyt();
            Bundle bundle = new Bundle(3);
            bundle.putString("accountName", str);
            bundle.putParcelable("birthdayPageData", a);
            bundle.putParcelable("confirmPageData", a2);
            bbytVar.setArguments(bundle);
        } else {
            String str2 = this.j;
            ekvl.y(str2);
            PageDataMap pageDataMap3 = this.u;
            ekvl.y(pageDataMap3);
            PageData a3 = pageDataMap3.a(3);
            PageDataMap pageDataMap4 = this.u;
            ekvl.y(pageDataMap4);
            PageData a4 = pageDataMap4.a(14);
            ProfileData profileData2 = this.x;
            ekvl.y(profileData2);
            BirthdayData birthdayData = profileData2.f;
            bbytVar = new bbyt();
            Bundle bundle2 = new Bundle(4);
            bundle2.putString("accountName", str2);
            bundle2.putParcelable("birthdayPageData", a3);
            bundle2.putParcelable("confirmPageData", a4);
            bundle2.putParcelable("birthday", birthdayData);
            bbytVar.setArguments(bundle2);
        }
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.v(bbytVar, "birthdayDialog");
        bpVar.b();
    }

    @Override // defpackage.bcgr
    public final void E(PageData pageData) {
        String str = this.j;
        ekvl.y(str);
        bbtx.a(this, pageData, str, new bbyx(this), null, false).show();
        Q();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F() {
        /*
            r7 = this;
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r1 = "predefinedTheme"
            java.lang.String r0 = r0.getStringExtra(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = -1
            r3 = 0
            if (r1 == 0) goto L14
        L12:
            r0 = r3
            goto L35
        L14:
            java.lang.String r1 = "play"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L20
            r0 = 2132151466(0x7f160caa, float:1.9944995E38)
            goto L35
        L20:
            java.lang.String r1 = "music"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L2c
            r0 = 2132151470(0x7f160cae, float:1.9945004E38)
            goto L35
        L2c:
            java.lang.String r1 = "youtube"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L12
            r0 = r2
        L35:
            if (r0 != 0) goto L3a
            r0 = 2132151211(0x7f160bab, float:1.9944478E38)
        L3a:
            if (r0 == r2) goto L49
            com.google.android.gms.wallet.firstparty.WalletCustomTheme r1 = new com.google.android.gms.wallet.firstparty.WalletCustomTheme
            r1.<init>()
            int r0 = defpackage.apzg.a(r7, r0)
            r1.g(r0)
            goto L4a
        L49:
            r1 = 0
        L4a:
            defpackage.ekvl.y(r1)
            boolean r0 = defpackage.fqep.j()
            r2 = 1
            r0 = r0 ^ r2
            dlbc r4 = new dlbc
            r4.<init>(r7)
            boolean r5 = r7.F
            if (r5 == 0) goto L64
            com.google.android.gms.family.v2.model.UpgradeParams r5 = r7.v
            defpackage.ekvl.y(r5)
            com.google.android.gms.family.v2.model.BillingSignupData r5 = r5.a
            goto L6b
        L64:
            com.google.android.gms.family.v2.model.SetupParams r5 = r7.w
            defpackage.ekvl.y(r5)
            com.google.android.gms.family.v2.model.BillingSignupData r5 = r5.a
        L6b:
            java.lang.String r5 = r5.a
            defpackage.ekvl.y(r5)
            byte[] r3 = android.util.Base64.decode(r5, r3)
            r4.g(r3)
            android.accounts.Account r3 = new android.accounts.Account
            java.lang.String r5 = r7.j
            defpackage.ekvl.y(r5)
            java.lang.String r6 = "com.google"
            r3.<init>(r5, r6)
            r4.c(r3)
            r4.e(r0)
            r4.d(r1)
            bbvn r0 = r7.A
            r1 = 6
            r0.i(r1)
            android.content.Intent r0 = r4.a()
            r7.startActivityForResult(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.family.v2.create.FamilyCreationChimeraActivity.F():void");
    }

    public final void G() {
        V();
        getSupportLoaderManager().c(8, null, new bbze(this));
    }

    @Override // defpackage.bcgr
    public final void H(boolean z) {
        Q();
        V();
        getSupportLoaderManager().c(1, null, new bbzu(this, z));
    }

    public final boolean I() {
        return getSupportFragmentManager().g(R.id.fm_family_creation_fragment_container) != null;
    }

    @Override // defpackage.bcav, defpackage.bcak
    public final boolean J() {
        return this.G;
    }

    public final boolean K() {
        q();
        ew supportFragmentManager = getSupportFragmentManager();
        PageDataMap pageDataMap = this.u;
        if (pageDataMap == null || !pageDataMap.c(1)) {
            PageDataMap pageDataMap2 = this.u;
            if (pageDataMap2 == null || !pageDataMap2.c(37)) {
                PageDataMap pageDataMap3 = this.u;
                if (pageDataMap3 == null || !pageDataMap3.c(2)) {
                    PageDataMap pageDataMap4 = this.u;
                    if (pageDataMap4 == null || !pageDataMap4.c(22)) {
                        PageDataMap pageDataMap5 = this.u;
                        if (pageDataMap5 == null || !pageDataMap5.c(16)) {
                            return false;
                        }
                        bp bpVar = new bp(supportFragmentManager);
                        String str = this.j;
                        ekvl.y(str);
                        PageDataMap pageDataMap6 = this.u;
                        ekvl.y(pageDataMap6);
                        PageData a = pageDataMap6.a(16);
                        PageDataMap pageDataMap7 = this.u;
                        ekvl.y(pageDataMap7);
                        PageData a2 = pageDataMap7.a(18);
                        PageDataMap pageDataMap8 = this.u;
                        ekvl.y(pageDataMap8);
                        bpVar.t(R.id.fm_family_creation_fragment_container, bcaw.x(str, a, a2, pageDataMap8.a(19)));
                        bpVar.b();
                    } else {
                        bp bpVar2 = new bp(supportFragmentManager);
                        String str2 = this.j;
                        ekvl.y(str2);
                        PageDataMap pageDataMap9 = this.u;
                        ekvl.y(pageDataMap9);
                        PageData a3 = pageDataMap9.a(22);
                        PageDataMap pageDataMap10 = this.u;
                        ekvl.y(pageDataMap10);
                        PageData a4 = pageDataMap10.a(18);
                        PageDataMap pageDataMap11 = this.u;
                        ekvl.y(pageDataMap11);
                        bpVar2.t(R.id.fm_family_creation_fragment_container, bcal.x(str2, a3, a4, pageDataMap11.a(19)));
                        bpVar2.b();
                    }
                } else {
                    bp bpVar3 = new bp(supportFragmentManager);
                    byte[] bArr = this.l;
                    String str3 = this.j;
                    ekvl.y(str3);
                    PageDataMap pageDataMap12 = this.u;
                    ekvl.y(pageDataMap12);
                    PageData a5 = pageDataMap12.a(2);
                    ProfileData profileData = this.x;
                    ekvl.y(profileData);
                    bpVar3.t(R.id.fm_family_creation_fragment_container, bccc.x(bArr, str3, a5, profileData));
                    bpVar3.b();
                }
            } else {
                bp bpVar4 = new bp(supportFragmentManager);
                byte[] bArr2 = this.l;
                String str4 = this.j;
                ekvl.y(str4);
                PageDataMap pageDataMap13 = this.u;
                ekvl.y(pageDataMap13);
                PageData a6 = pageDataMap13.a(37);
                bcbu bcbuVar = new bcbu();
                Bundle bundle = new Bundle(4);
                bundle.putByteArray("auditToken", bArr2);
                bundle.putString("accountName", str4);
                bundle.putParcelable("pageData", a6);
                bcbuVar.setArguments(bundle);
                bpVar4.t(R.id.fm_family_creation_fragment_container, bcbuVar);
                bpVar4.b();
            }
        } else {
            bp bpVar5 = new bp(supportFragmentManager);
            String str5 = this.j;
            ekvl.y(str5);
            PageDataMap pageDataMap14 = this.u;
            ekvl.y(pageDataMap14);
            PageData a7 = pageDataMap14.a(1);
            bbym bbymVar = new bbym();
            Bundle bundle2 = new Bundle(2);
            bundle2.putString("accountName", str5);
            bundle2.putParcelable("pageData", a7);
            bbymVar.setArguments(bundle2);
            bpVar5.t(R.id.fm_family_creation_fragment_container, bbymVar);
            bpVar5.b();
        }
        return true;
    }

    public final void M(int i) {
        setResult(4, new Intent().putExtra("accountName", this.j).putExtra("errorCode", i));
        finish();
    }

    @Override // defpackage.bbyl
    public final void b() {
        byte[] bArr = this.l;
        String str = this.j;
        ekvl.y(str);
        PageDataMap pageDataMap = this.u;
        ekvl.y(pageDataMap);
        PageData a = pageDataMap.a(2);
        ProfileData profileData = this.x;
        ekvl.y(profileData);
        bccc x = bccc.x(bArr, str, a, profileData);
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.F(R.id.fm_family_creation_fragment_container, x);
        bpVar.w(null);
        bpVar.a();
    }

    @Override // defpackage.bbys
    public final void c(Calendar calendar) {
        this.z = calendar;
        U();
    }

    @Override // defpackage.bbyl, defpackage.bcbt, defpackage.bccb, defpackage.bcan, defpackage.bbys, defpackage.bcav, defpackage.bcak, defpackage.bcgr, defpackage.bcce
    public final bbvn hQ() {
        return this.A;
    }

    @Override // defpackage.bcgr
    public final bbtr k() {
        return this.B;
    }

    @Override // defpackage.bcgr
    public final bbtt l() {
        return this.k;
    }

    public final void m(boolean z) {
        fj fjVar = null;
        if (getIntent().hasExtra("tosContent")) {
            byte[] bArr = this.l;
            String str = this.j;
            ekvl.y(str);
            String stringExtra = getIntent().getStringExtra("tosContent");
            ekvl.y(stringExtra);
            bcgp x = bcgp.x(bArr, str, stringExtra, getIntent().getStringExtra("tosContinueButton"), getIntent().getStringExtra("tosMoreButton"));
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.F(R.id.fm_family_creation_fragment_container, x);
            bpVar.w(null);
            fjVar = bpVar;
        } else if (this.r) {
            fjVar = O();
        }
        if (fjVar == null) {
            P();
        } else if (!z) {
            fjVar.a();
        } else {
            q();
            fjVar.b();
        }
    }

    public final void n() {
        esjf[] esjfVarArr;
        if (this.E.size() == 0) {
            this.F = this.o == eshd.HEAD_OF_HOUSEHOLD && this.p && this.r;
            jzx a = jzx.a(this);
            if (!this.F) {
                CanCreateFamilyData canCreateFamilyData = this.y;
                if (canCreateFamilyData != null && !canCreateFamilyData.a && (esjfVarArr = canCreateFamilyData.b) != null && esjfVarArr.length > 0 && esjfVarArr[0] != esjf.LACKS_BIRTHDAY && canCreateFamilyData.c == null) {
                    T();
                    return;
                }
                if (this.z != null) {
                    if (canCreateFamilyData == null || !canCreateFamilyData.a) {
                        R();
                        this.z = null;
                        return;
                    } else {
                        if (this.r) {
                            a.c(2, null, new bbzr(this));
                            return;
                        }
                        m(true);
                        getSupportFragmentManager().an();
                        this.z = null;
                        return;
                    }
                }
                if (canCreateFamilyData != null && canCreateFamilyData.a) {
                    a.c(2, null, new bbzr(this));
                    return;
                }
                PageDataMap pageDataMap = this.u;
                ekvl.y(pageDataMap);
                if (!pageDataMap.c(2)) {
                    R();
                    return;
                }
            }
            PageDataMap pageDataMap2 = this.u;
            if (pageDataMap2 == null || !(pageDataMap2.c(1) || this.u.c(2) || this.u.c(22) || this.u.c(16))) {
                T();
            } else {
                K();
            }
        }
    }

    @Override // defpackage.bcgr
    public final void o() {
        bbtx.b(this).show();
        Q();
    }

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        int i3 = i2;
        super.onActivityResult(i, i2, intent);
        switch (i) {
            case 1:
                if (i3 != -1) {
                    q();
                    break;
                } else {
                    this.A.i(15);
                    this.s = true;
                    this.H = true;
                    z();
                    break;
                }
            case 2:
                if (i3 != 1) {
                    S();
                    break;
                } else {
                    ekvl.y(intent);
                    if (intent.getStringExtra("consistencyToken") != null) {
                        this.k.c(getIntent().getStringExtra("consistencyToken"), getIntent().getLongExtra("tokenExpirationTimeSecs", 0L));
                    }
                    ekvl.y(intent);
                    boolean booleanExtra = intent.getBooleanExtra("familyChanged", this.H);
                    this.H = booleanExtra;
                    if (!booleanExtra) {
                        this.t = false;
                        u();
                        break;
                    } else {
                        setResult(1, N());
                        this.A.i(31);
                        finish();
                        break;
                    }
                }
            case 3:
                this.K.b(this.J.c, i3);
                if (i3 != -1) {
                    S();
                    break;
                } else {
                    bbum bbumVar = this.J;
                    ekvl.y(intent);
                    bbumVar.e(intent);
                    setResult(1, N());
                    finish();
                    break;
                }
            case 4:
                if (this.J.f() == 6) {
                    bbum bbumVar2 = this.J;
                    ekvl.y(intent);
                    String stringExtra = intent.getStringExtra("extra.consistencyToken");
                    if (stringExtra != null) {
                        str = "errorCode";
                        bbumVar2.d.c(stringExtra, 300L);
                    } else {
                        str = "errorCode";
                    }
                } else {
                    str = "errorCode";
                    bbum bbumVar3 = this.J;
                    ekvl.y(intent);
                    bbumVar3.e(intent);
                }
                bbty bbtyVar = this.K;
                long j = this.J.c;
                fgrc v = evbg.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                evbg evbgVar = (evbg) v.b;
                evbgVar.c = 6;
                evbgVar.b |= 1;
                fgrc v2 = evbc.a.v();
                fgrc v3 = evbb.a.v();
                int i4 = i3 != -1 ? i3 != 0 ? 1 : 3 : 2;
                if (!v3.b.L()) {
                    v3.U();
                }
                evbb evbbVar = (evbb) v3.b;
                evbbVar.c = i4 - 1;
                evbbVar.b |= 1;
                if (!v2.b.L()) {
                    v2.U();
                }
                evbc evbcVar = (evbc) v2.b;
                evbb evbbVar2 = (evbb) v3.Q();
                evbbVar2.getClass();
                evbcVar.c = evbbVar2;
                evbcVar.b |= 2;
                if (!v.b.L()) {
                    v.U();
                }
                evbg evbgVar2 = (evbg) v.b;
                evbc evbcVar2 = (evbc) v2.Q();
                evbcVar2.getClass();
                evbgVar2.d = evbcVar2;
                evbgVar2.b |= 2;
                bbtyVar.a((evbg) v.Q(), j);
                String stringExtra2 = intent.getStringExtra("result.familywebviewoutcome");
                exbz exbzVar = null;
                if (!TextUtils.isEmpty(stringExtra2)) {
                    try {
                        byte[] decode = Base64.decode(stringExtra2, 0);
                        if (decode != null) {
                            fgri y = fgri.y(exbz.a, decode, 0, decode.length, fgqp.a());
                            fgri.M(y);
                            exbzVar = (exbz) y;
                        }
                    } catch (fgsd | IllegalArgumentException e) {
                        bbum.a.f(a.o(stringExtra2, e, "exception caught in getDeserializedWebviewState: InvalidProtocolBufferException -- Received unexpected protocol buffer '", "'. Details: "), new Object[0]);
                    }
                }
                int i5 = i3 != -1 ? 3 : 1;
                if (exbzVar != null) {
                    this.H = exbzVar.c;
                    if (i3 == -1) {
                        int i6 = exbzVar.b;
                        if ((i6 & 4) != 0) {
                            int a = exby.a(exbzVar.e);
                            if (a == 0) {
                                a = 1;
                            }
                            int i7 = a - 1;
                            if (i7 == 1) {
                                startActivityForResult(new Intent().setClassName(this, "com.google.android.gms.family.v2.manage.FamilyManagementActivity").putExtra("accountName", this.j).putExtra("appId", this.B.a).putExtra("familyChanged", true).putExtra("consistencyToken", this.k.b()).putExtra("tokenExpirationTimeSecs", this.k.a()).putExtra("customTheme", getIntent().getIntExtra("customTheme", 0)).putExtra("predefinedTheme", auur.c(getIntent().getStringExtra("predefinedTheme"))).putExtra("clientCallingPackage", aura.q(this)), 5);
                                break;
                            } else if (i7 == 2) {
                                int i8 = true != fqep.j() ? 1 : 3;
                                dlbc dlbcVar = new dlbc(this);
                                dlbcVar.g(Base64.decode(exbzVar.f, 0));
                                String str2 = this.j;
                                ekvl.y(str2);
                                dlbcVar.c(new Account(str2, "com.google"));
                                dlbcVar.e(i8);
                                WalletCustomTheme walletCustomTheme = new WalletCustomTheme();
                                walletCustomTheme.g(apzg.a(this, R.style.Theme_MyAccount_Wallet));
                                dlbcVar.d(walletCustomTheme);
                                startActivityForResult(dlbcVar.a(), 6);
                                break;
                            }
                        } else if ((i6 & 2) != 0) {
                            int a2 = exbw.a(exbzVar.d);
                            setResult(4, new Intent().putExtra("accountName", this.j).putExtra(str, (a2 == 0 ? 1 : a2) + (-1) != 2 ? -7 : -6));
                        } else {
                            if (this.J.f() == 6) {
                                i5 = X(this.H, i5);
                            }
                            setResult(i5, N());
                        }
                    } else {
                        setResult(i5, N());
                    }
                    finish();
                    break;
                } else {
                    if (this.J.f() == 6) {
                        i5 = X(false, i5);
                    }
                    setResult(i5, N());
                    finish();
                    break;
                }
            case 5:
                setResult(1, N());
                finish();
                break;
            case 6:
                if (i3 == -1) {
                    this.H = true;
                    setResult(1, N());
                    i3 = -1;
                } else {
                    this.H = false;
                    setResult(4, N().putExtra("errorCode", -6));
                }
                bbty bbtyVar2 = this.K;
                long j2 = this.J.c;
                fgrc v4 = evbg.a.v();
                int i9 = i3 == -1 ? 8 : 9;
                if (!v4.b.L()) {
                    v4.U();
                }
                evbg evbgVar3 = (evbg) v4.b;
                evbgVar3.c = i9 - 1;
                evbgVar3.b |= 1;
                bbtyVar2.a((evbg) v4.Q(), j2);
                finish();
                break;
        }
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        dg g = getSupportFragmentManager().g(R.id.fm_family_creation_fragment_container);
        if (g == null) {
            t();
        } else {
            if (!(g instanceof bccf)) {
                super.onBackPressed();
                return;
            }
            setResult(1, N());
            this.A.i(31);
            finish();
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        eshd eshdVar;
        super.onCreate(bundle);
        this.A = new bbvn(this);
        String q = aura.q(this);
        if (!asxe.d(this).h(q)) {
            this.A.e(3, 8);
            M(-3);
            return;
        }
        String stringExtra = getIntent().getStringExtra("accountName");
        this.j = stringExtra;
        if (stringExtra == null) {
            this.A.e(3, 13);
            M(-2);
            return;
        }
        boolean z = false;
        Account account = null;
        for (Account account2 : bsup.b(this).p("com.google")) {
            if (true == account2.name.equals(this.j)) {
                account = account2;
            }
        }
        if (account == null) {
            this.A.e(3, 14);
            M(-2);
            return;
        }
        String stringExtra2 = getIntent().getStringExtra("appId");
        ekvl.y(stringExtra2);
        this.B = new bbtr(stringExtra2, Integer.toString(ModuleManager.get(this).getCurrentModule().moduleVersion));
        this.m = getIntent().getStringExtra("referencePcid");
        this.k = new bbtt();
        if (bundle != null && bundle.getString("consistencyToken") != null) {
            this.k.c(bundle.getString("consistencyToken"), bundle.getLong("tokenExpirationTimeSecs", 0L));
        } else if (getIntent().getStringExtra("consistencyToken") != null) {
            this.k.c(getIntent().getStringExtra("consistencyToken"), getIntent().getLongExtra("tokenExpirationTimeSecs", 0L));
        }
        if (bundle != null && bundle.getByteArray("auditToken") != null) {
            byte[] byteArray = bundle.getByteArray("auditToken");
            ekvl.y(byteArray);
            this.l = byteArray;
        } else if (getIntent().getByteArrayExtra("auditToken") != null) {
            byte[] byteArrayExtra = getIntent().getByteArrayExtra("auditToken");
            ekvl.y(byteArrayExtra);
            this.l = byteArrayExtra;
        } else {
            fgrc v = evmr.a.v();
            fgpr w = fgpr.w(wib.a());
            if (!v.b.L()) {
                v.U();
            }
            evmr evmrVar = (evmr) v.b;
            evmrVar.b |= 1;
            evmrVar.c = w;
            this.l = ((evmr) v.Q()).r();
        }
        this.x = bundle != null ? (ProfileData) bundle.getParcelable("profileData") : null;
        this.y = bundle != null ? (CanCreateFamilyData) bundle.getParcelable("canCreateData") : null;
        this.w = bundle != null ? (SetupParams) bundle.getParcelable("setupParams") : null;
        this.v = bundle != null ? (UpgradeParams) bundle.getParcelable("upgradeParams") : null;
        int a = bundle != null ? eshb.a(bundle.getInt("pcidType")) : 0;
        if (a == 0) {
            a = 1;
        }
        this.C = a;
        this.p = bundle != null && bundle.getBoolean("hasFamily", false);
        this.q = bundle != null && bundle.getBoolean("familyCreated", false);
        this.F = bundle != null && bundle.getBoolean("isUpgradeFlow", false);
        this.t = bundle != null && bundle.getBoolean("inviteOnFinish", false);
        this.G = bundle != null && bundle.getBoolean("walletComplete", false);
        this.s = bundle != null && bundle.getBoolean("fopChanged", false);
        this.r = bundle != null && bundle.getBoolean("fopRequested", false);
        this.I = bundle != null && bundle.getBoolean("skipClicked", false);
        this.u = bundle != null ? (PageDataMap) bundle.getParcelable("pageDataMap") : null;
        this.z = bundle != null ? (Calendar) bundle.getSerializable("pendingBirthday") : null;
        if (bundle != null) {
            eshdVar = eshd.b(bundle.getInt("inviteeRole"));
            ekvl.y(eshdVar);
        } else {
            eshdVar = eshd.UNKNOWN_FAMILY_ROLE;
        }
        this.n = eshdVar;
        if (eshdVar == null) {
            eshdVar = eshd.UNKNOWN_FAMILY_ROLE;
        }
        this.n = eshdVar;
        if (bundle != null && bundle.getBoolean("familyChanged")) {
            z = true;
        }
        this.H = z;
        bbvn bbvnVar = this.A;
        String str = this.j;
        ekvl.y(str);
        bbtr bbtrVar = this.B;
        bbvnVar.d(str, bbtrVar.b, bbtrVar.a);
        String str2 = this.j;
        ekvl.y(str2);
        this.K = new bbty(this, str2);
        fhbp a2 = fqfa.a.lK().a();
        String stringExtra3 = getIntent().getStringExtra("appId");
        ekvl.y(stringExtra3);
        String d = bbum.d(stringExtra3);
        if (W() || !fqep.k() || (!a2.b.contains(d) && !D.contains(d))) {
            bbua.d(this, getIntent(), q);
            this.A.i(2);
            setContentView(R.layout.fm_activity_family_creation_v2);
            q();
            if (this.z != null) {
                U();
                return;
            }
            if (I()) {
                return;
            }
            V();
            this.E = new SparseIntArray();
            jzx a3 = jzx.a(this);
            a3.c(5, null, new bbzx(this));
            B(5);
            a3.c(7, null, new bbzk(this));
            B(7);
            a3.c(6, null, new bbzo(this));
            B(6);
            a3.c(4, null, new bbzb(this));
            B(4);
            return;
        }
        String str3 = this.j;
        ekvl.y(str3);
        bbum bbumVar = new bbum(str3, d, this.k, q);
        this.J = bbumVar;
        bbty bbtyVar = this.K;
        int f = bbumVar.f();
        int i = ModuleManager.get(this).getCurrentModule().moduleVersion;
        long j = this.J.c;
        fgrc v2 = evbg.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        evbg evbgVar = (evbg) v2.b;
        evbgVar.c = 5;
        evbgVar.b |= 1;
        fgrc v3 = evbf.a.v();
        if (!v3.b.L()) {
            v3.U();
        }
        fgri fgriVar = v3.b;
        evbf evbfVar = (evbf) fgriVar;
        evbfVar.c = exbu.a(f);
        evbfVar.b |= 1;
        if (!fgriVar.L()) {
            v3.U();
        }
        fgri fgriVar2 = v3.b;
        evbf evbfVar2 = (evbf) fgriVar2;
        evbfVar2.b = 2 | evbfVar2.b;
        evbfVar2.d = i;
        if (!fgriVar2.L()) {
            v3.U();
        }
        evbf evbfVar3 = (evbf) v3.b;
        evbfVar3.e = 1;
        evbfVar3.b |= 4;
        if (!v2.b.L()) {
            v2.U();
        }
        evbg evbgVar2 = (evbg) v2.b;
        evbf evbfVar4 = (evbf) v3.Q();
        evbfVar4.getClass();
        evbgVar2.e = evbfVar4;
        evbgVar2.b |= 4;
        bbtyVar.a((evbg) v2.Q(), j);
        bbum bbumVar2 = this.J;
        fgrc v4 = cver.a.v();
        bbuj bbujVar = new bbuj();
        bbujVar.a = fqep.a.lK().o();
        bbujVar.b = bbumVar2.b();
        bbujVar.c(bbumVar2.c);
        bbujVar.b(String.valueOf(exbu.a(bbumVar2.f())));
        String a4 = bbujVar.a().a();
        if (!v4.b.L()) {
            v4.U();
        }
        fgri fgriVar3 = v4.b;
        a4.getClass();
        ((cver) fgriVar3).b = a4;
        String str4 = bbumVar2.b;
        if (!fgriVar3.L()) {
            v4.U();
        }
        fgri fgriVar4 = v4.b;
        str4.getClass();
        ((cver) fgriVar4).c = str4;
        if (!fgriVar4.L()) {
            v4.U();
        }
        fgri fgriVar5 = v4.b;
        ((cver) fgriVar5).d = 1;
        if (!fgriVar5.L()) {
            v4.U();
        }
        ((cver) v4.b).e = 1;
        int i2 = bsur.a().d;
        if (!v4.b.L()) {
            v4.U();
        }
        ((cver) v4.b).f = i2;
        String c = bbumVar2.c();
        if (!v4.b.L()) {
            v4.U();
        }
        ((cver) v4.b).g = c;
        startActivityForResult(cuva.a((cver) v4.Q()), 4);
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onPause() {
        super.onPause();
        jzx a = jzx.a(this);
        a.e(0);
        a.e(2);
        a.e(5);
        a.e(7);
        a.e(6);
        a.e(4);
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("profileData", this.x);
        bundle.putParcelable("canCreateData", this.y);
        bundle.putParcelable("upgradeParams", this.v);
        bundle.putParcelable("setupParams", this.w);
        bundle.putBoolean("hasFamily", this.p);
        bundle.putBoolean("familyCreated", this.q);
        bundle.putBoolean("isUpgradeFlow", this.F);
        bundle.putBoolean("inviteOnFinish", this.t);
        bundle.putBoolean("walletComplete", this.G);
        bundle.putBoolean("fopChanged", this.s);
        bundle.putBoolean("fopRequested", this.r);
        bundle.putBoolean("skipClicked", this.I);
        bundle.putParcelable("pageDataMap", this.u);
        bundle.putInt("inviteeRole", this.n.g);
        int i = this.C;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        bundle.putInt("pcidType", i2);
        Calendar calendar = this.z;
        if (calendar != null) {
            bundle.putSerializable("pendingBirthday", calendar);
        }
        this.k.b();
        if (!this.k.b().isEmpty()) {
            bundle.putString("consistencyToken", this.k.b());
            bundle.putLong("tokenExpirationTimeSecs", this.k.a());
        }
        bundle.putBoolean("familyChanged", this.H);
        bundle.putByteArray("auditToken", this.l);
    }

    @Override // defpackage.bcgr
    public final void p() {
        Q();
    }

    public final void q() {
        findViewById(R.id.fm_family_creation_loading_screen).setVisibility(8);
    }

    @Override // defpackage.bcav, defpackage.bcak
    public final void r() {
        t();
    }

    @Override // defpackage.bcan, defpackage.bcav, defpackage.bcak
    public final void s(boolean z) {
        if (this.G) {
            z();
            return;
        }
        if (z) {
            G();
            return;
        }
        if (!this.F) {
            F();
            return;
        }
        getWindow().addFlags(8192);
        String str = this.j;
        ekvl.y(str);
        String str2 = this.m;
        int i = this.C;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        bcgs bcgsVar = new bcgs();
        Bundle bundle = new Bundle(4);
        bundle.putString("accountName", str);
        bundle.putString("referencePcid", str2);
        bundle.putInt("pcidType", i2);
        bundle.putBoolean("headless", false);
        bcgsVar.setArguments(bundle);
        bcgsVar.show(getSupportFragmentManager(), "upgrade-preconditions");
    }

    public final void t() {
        this.A.i(32);
        setResult(3, N());
        finish();
    }

    public final void u() {
        PageDataMap pageDataMap;
        bccf x;
        if (this.I && (pageDataMap = this.u) != null && pageDataMap.c(35)) {
            q();
            this.I = false;
            if (W() && this.B.a.equals("agsa")) {
                String str = this.j;
                ekvl.y(str);
                PageDataMap pageDataMap2 = this.u;
                ekvl.y(pageDataMap2);
                x = bccf.x(str, pageDataMap2.a(35), new ArrayList());
            } else {
                String str2 = this.j;
                ekvl.y(str2);
                PageDataMap pageDataMap3 = this.u;
                ekvl.y(pageDataMap3);
                x = bccf.x(str2, pageDataMap3.a(35), null);
            }
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.F(R.id.fm_family_creation_fragment_container, x);
            bpVar.w(null);
            bpVar.b();
            return;
        }
        if (!this.t) {
            setResult(1, N());
            this.A.i(7);
            finish();
            return;
        }
        boolean k = fqep.k();
        if (!k) {
            this.A.a();
        }
        fhbp b = fqfe.b();
        String stringExtra = getIntent().getStringExtra("appId");
        ekvl.y(stringExtra);
        String d = bbum.d(stringExtra);
        if (W() || !k || (!b.b.contains(d) && !D.contains(d))) {
            Intent addFlags = new Intent().setClassName(this, "com.google.android.gms.family.v2.invites.SendInvitationsActivity").putExtra("accountName", this.j).putExtra("consistencyToken", this.k.b()).putExtra("tokenExpirationTimeSecs", this.k.a()).putExtra("appId", this.B.a).putExtra("customTheme", getIntent().getIntExtra("customTheme", 0)).putExtra("predefinedTheme", auur.c(getIntent().getStringExtra("predefinedTheme"))).putExtra("clientCallingPackage", aura.q(this)).putExtra("fromCreate", true).putExtra("familyChanged", this.H).putExtra("profileData", this.x).putExtra("inviteeRole", this.n.g).addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE);
            if (this.B.a.equals("agsa")) {
                addFlags.putExtra("isDirectAddInvitations", W());
            }
            startActivityForResult(addFlags, 2);
            return;
        }
        String str3 = this.j;
        ekvl.y(str3);
        bbum bbumVar = new bbum(str3, d, this.k, aura.q(this));
        this.J = bbumVar;
        this.K.c(bbumVar.f(), ModuleManager.get(this).getCurrentModule().moduleVersion, this.J.c);
        startActivityForResult(this.J.a("family_module_create_family"), 3);
    }

    @Override // defpackage.bcbt
    public final void v() {
        if (this.I) {
            this.A.i(32);
            setResult(1);
            finish();
            return;
        }
        if (!this.F) {
            CanCreateFamilyData canCreateFamilyData = this.y;
            ekvl.y(canCreateFamilyData);
            if (!canCreateFamilyData.a) {
                R();
                return;
            }
        }
        m(false);
    }

    @Override // defpackage.bccb
    public final void w() {
        if (!this.F) {
            CanCreateFamilyData canCreateFamilyData = this.y;
            ekvl.y(canCreateFamilyData);
            if (!canCreateFamilyData.a) {
                R();
                return;
            }
        }
        m(false);
    }

    @Override // defpackage.bcce
    public final void x() {
        this.t = false;
        u();
    }

    @Override // defpackage.bcgo
    public final void y() {
        fj O = O();
        if (!this.r || O == null) {
            P();
        } else {
            O.a();
        }
    }

    public final void z() {
        this.G = true;
        if (!this.q && !this.p) {
            P();
        } else {
            q();
            u();
        }
    }

    @Override // defpackage.bbud
    public final Context getContext() {
        return this;
    }
}
