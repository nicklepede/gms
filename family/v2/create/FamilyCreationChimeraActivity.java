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
import defpackage.anxo;
import defpackage.aqup;
import defpackage.asng;
import defpackage.asqx;
import defpackage.azpv;
import defpackage.azpx;
import defpackage.azqb;
import defpackage.azqc;
import defpackage.azqe;
import defpackage.azqh;
import defpackage.azqn;
import defpackage.azqq;
import defpackage.azrr;
import defpackage.azup;
import defpackage.azuq;
import defpackage.azuw;
import defpackage.azux;
import defpackage.azva;
import defpackage.azvb;
import defpackage.azvc;
import defpackage.azvf;
import defpackage.azvi;
import defpackage.azvl;
import defpackage.azvo;
import defpackage.azvs;
import defpackage.azvv;
import defpackage.azvy;
import defpackage.azwb;
import defpackage.azwg;
import defpackage.azwo;
import defpackage.azwp;
import defpackage.azwr;
import defpackage.azws;
import defpackage.azwz;
import defpackage.azxa;
import defpackage.azxx;
import defpackage.azxy;
import defpackage.azyf;
import defpackage.azyg;
import defpackage.azyi;
import defpackage.azyj;
import defpackage.bacs;
import defpackage.bact;
import defpackage.bacv;
import defpackage.bacw;
import defpackage.bp;
import defpackage.bqna;
import defpackage.bqnc;
import defpackage.cq;
import defpackage.cslv;
import defpackage.csvn;
import defpackage.dg;
import defpackage.dipr;
import defpackage.eiig;
import defpackage.eiuu;
import defpackage.ejdg;
import defpackage.eptc;
import defpackage.epte;
import defpackage.epvg;
import defpackage.eslo;
import defpackage.eslp;
import defpackage.esls;
import defpackage.eslt;
import defpackage.esxb;
import defpackage.eumb;
import defpackage.eumd;
import defpackage.eumf;
import defpackage.eumg;
import defpackage.ew;
import defpackage.feay;
import defpackage.febw;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.femw;
import defpackage.fj;
import defpackage.fnmh;
import defpackage.fnms;
import defpackage.fnmw;
import defpackage.jti;
import defpackage.qet;
import defpackage.umc;
import java.util.ArrayList;
import java.util.Calendar;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class FamilyCreationChimeraActivity extends qet implements azup, azxx, azyf, bacs, azwr, azuw, azwz, azwo, bacv, azqh, azyi {
    private static final eiuu D = new ejdg("yt-tandem");
    public azrr A;
    public azpv B;
    public int C;
    private SparseIntArray E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private azqq J;
    private azqc K;
    public String j;
    public azpx k;
    public byte[] l;
    public String m;
    public epte n;
    public epte o;
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
        epte epteVar = epte.UNKNOWN_FAMILY_ROLE;
        this.n = epteVar;
        this.o = epteVar;
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
            eiig.x(str);
            PageDataMap pageDataMap2 = this.u;
            eiig.x(pageDataMap2);
            PageData a = pageDataMap2.a(4);
            azws azwsVar = new azws();
            Bundle bundle = new Bundle(2);
            bundle.putString("accountName", str);
            bundle.putParcelable("pageData", a);
            azwsVar.setArguments(bundle);
            bpVar.F(R.id.fm_family_creation_fragment_container, azwsVar);
            bpVar.w(null);
            return bpVar;
        }
        PageDataMap pageDataMap3 = this.u;
        if (pageDataMap3 != null && pageDataMap3.c(22)) {
            bp bpVar2 = new bp(getSupportFragmentManager());
            String str2 = this.j;
            eiig.x(str2);
            PageDataMap pageDataMap4 = this.u;
            eiig.x(pageDataMap4);
            PageData a2 = pageDataMap4.a(22);
            PageDataMap pageDataMap5 = this.u;
            eiig.x(pageDataMap5);
            PageData a3 = pageDataMap5.a(18);
            PageDataMap pageDataMap6 = this.u;
            eiig.x(pageDataMap6);
            bpVar2.F(R.id.fm_family_creation_fragment_container, azwp.x(str2, a2, a3, pageDataMap6.a(19)));
            bpVar2.w(null);
            return bpVar2;
        }
        PageDataMap pageDataMap7 = this.u;
        if (pageDataMap7 == null || !pageDataMap7.c(16)) {
            return null;
        }
        bp bpVar3 = new bp(getSupportFragmentManager());
        String str3 = this.j;
        eiig.x(str3);
        PageDataMap pageDataMap8 = this.u;
        eiig.x(pageDataMap8);
        PageData a4 = pageDataMap8.a(16);
        PageDataMap pageDataMap9 = this.u;
        eiig.x(pageDataMap9);
        PageData a5 = pageDataMap9.a(18);
        PageDataMap pageDataMap10 = this.u;
        eiig.x(pageDataMap10);
        bpVar3.F(R.id.fm_family_creation_fragment_container, azxa.x(str3, a4, a5, pageDataMap10.a(19)));
        bpVar3.w(null);
        return bpVar3;
    }

    private final void P() {
        V();
        jti.a(this).d(0, null, new azvl(this));
    }

    private final void Q() {
        cq cqVar = (cq) getSupportFragmentManager().h("upgrade-preconditions");
        if (cqVar != null) {
            cqVar.dismissAllowingStateLoss();
        }
        getWindow().clearFlags(8192);
    }

    private final void R() {
        epvg[] epvgVarArr;
        if (I()) {
            q();
        }
        CanCreateFamilyData canCreateFamilyData = this.y;
        if (canCreateFamilyData != null && (epvgVarArr = canCreateFamilyData.b) != null && epvgVarArr.length > 0 && epvgVarArr[0] == epvg.LACKS_BIRTHDAY) {
            D();
            return;
        }
        eiig.x(canCreateFamilyData);
        PageData pageData = canCreateFamilyData.c;
        String str = this.j;
        eiig.x(str);
        azqb.a(this, pageData, str, new azva(this), null, false).show();
    }

    private final void S() {
        jti a = jti.a(this);
        PageDataMap pageDataMap = this.u;
        eiig.x(pageDataMap);
        if (!pageDataMap.c(35)) {
            q();
            if (this.s) {
                V();
                a.d(6, null, new azvs(this));
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
        azqb.c(this, new azvc(this), new DialogInterface.OnClickListener() { // from class: azuz
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                FamilyCreationChimeraActivity.this.t();
            }
        }).show();
    }

    private final void U() {
        V();
        jti.a(this).d(3, null, new azwg(this));
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

    @Override // defpackage.azxx, defpackage.azyf
    public final void C(boolean z) {
        this.I = z;
    }

    public final void D() {
        azux azuxVar;
        ProfileData profileData = this.x;
        if (profileData == null || profileData.f == null) {
            String str = this.j;
            eiig.x(str);
            PageDataMap pageDataMap = this.u;
            eiig.x(pageDataMap);
            PageData a = pageDataMap.a(3);
            PageDataMap pageDataMap2 = this.u;
            eiig.x(pageDataMap2);
            PageData a2 = pageDataMap2.a(14);
            azuxVar = new azux();
            Bundle bundle = new Bundle(3);
            bundle.putString("accountName", str);
            bundle.putParcelable("birthdayPageData", a);
            bundle.putParcelable("confirmPageData", a2);
            azuxVar.setArguments(bundle);
        } else {
            String str2 = this.j;
            eiig.x(str2);
            PageDataMap pageDataMap3 = this.u;
            eiig.x(pageDataMap3);
            PageData a3 = pageDataMap3.a(3);
            PageDataMap pageDataMap4 = this.u;
            eiig.x(pageDataMap4);
            PageData a4 = pageDataMap4.a(14);
            ProfileData profileData2 = this.x;
            eiig.x(profileData2);
            BirthdayData birthdayData = profileData2.f;
            azuxVar = new azux();
            Bundle bundle2 = new Bundle(4);
            bundle2.putString("accountName", str2);
            bundle2.putParcelable("birthdayPageData", a3);
            bundle2.putParcelable("confirmPageData", a4);
            bundle2.putParcelable("birthday", birthdayData);
            azuxVar.setArguments(bundle2);
        }
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.v(azuxVar, "birthdayDialog");
        bpVar.b();
    }

    @Override // defpackage.bacv
    public final void E(PageData pageData) {
        String str = this.j;
        eiig.x(str);
        azqb.a(this, pageData, str, new azvb(this), null, false).show();
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
            r0 = 2132151452(0x7f160c9c, float:1.9944967E38)
            goto L35
        L20:
            java.lang.String r1 = "music"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L2c
            r0 = 2132151456(0x7f160ca0, float:1.9944975E38)
            goto L35
        L2c:
            java.lang.String r1 = "youtube"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L12
            r0 = r2
        L35:
            if (r0 != 0) goto L3a
            r0 = 2132151197(0x7f160b9d, float:1.994445E38)
        L3a:
            if (r0 == r2) goto L49
            com.google.android.gms.wallet.firstparty.WalletCustomTheme r1 = new com.google.android.gms.wallet.firstparty.WalletCustomTheme
            r1.<init>()
            int r0 = defpackage.anxo.a(r7, r0)
            r1.g(r0)
            goto L4a
        L49:
            r1 = 0
        L4a:
            defpackage.eiig.x(r1)
            boolean r0 = defpackage.fnmh.j()
            r2 = 1
            r0 = r0 ^ r2
            dipr r4 = new dipr
            r4.<init>(r7)
            boolean r5 = r7.F
            if (r5 == 0) goto L64
            com.google.android.gms.family.v2.model.UpgradeParams r5 = r7.v
            defpackage.eiig.x(r5)
            com.google.android.gms.family.v2.model.BillingSignupData r5 = r5.a
            goto L6b
        L64:
            com.google.android.gms.family.v2.model.SetupParams r5 = r7.w
            defpackage.eiig.x(r5)
            com.google.android.gms.family.v2.model.BillingSignupData r5 = r5.a
        L6b:
            java.lang.String r5 = r5.a
            defpackage.eiig.x(r5)
            byte[] r3 = android.util.Base64.decode(r5, r3)
            r4.g(r3)
            android.accounts.Account r3 = new android.accounts.Account
            java.lang.String r5 = r7.j
            defpackage.eiig.x(r5)
            java.lang.String r6 = "com.google"
            r3.<init>(r5, r6)
            r4.c(r3)
            r4.e(r0)
            r4.d(r1)
            azrr r0 = r7.A
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
        getSupportLoaderManager().c(8, null, new azvi(this));
    }

    @Override // defpackage.bacv
    public final void H(boolean z) {
        Q();
        V();
        getSupportLoaderManager().c(1, null, new azvy(this, z));
    }

    public final boolean I() {
        return getSupportFragmentManager().g(R.id.fm_family_creation_fragment_container) != null;
    }

    @Override // defpackage.azwz, defpackage.azwo
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
                        eiig.x(str);
                        PageDataMap pageDataMap6 = this.u;
                        eiig.x(pageDataMap6);
                        PageData a = pageDataMap6.a(16);
                        PageDataMap pageDataMap7 = this.u;
                        eiig.x(pageDataMap7);
                        PageData a2 = pageDataMap7.a(18);
                        PageDataMap pageDataMap8 = this.u;
                        eiig.x(pageDataMap8);
                        bpVar.t(R.id.fm_family_creation_fragment_container, azxa.x(str, a, a2, pageDataMap8.a(19)));
                        bpVar.b();
                    } else {
                        bp bpVar2 = new bp(supportFragmentManager);
                        String str2 = this.j;
                        eiig.x(str2);
                        PageDataMap pageDataMap9 = this.u;
                        eiig.x(pageDataMap9);
                        PageData a3 = pageDataMap9.a(22);
                        PageDataMap pageDataMap10 = this.u;
                        eiig.x(pageDataMap10);
                        PageData a4 = pageDataMap10.a(18);
                        PageDataMap pageDataMap11 = this.u;
                        eiig.x(pageDataMap11);
                        bpVar2.t(R.id.fm_family_creation_fragment_container, azwp.x(str2, a3, a4, pageDataMap11.a(19)));
                        bpVar2.b();
                    }
                } else {
                    bp bpVar3 = new bp(supportFragmentManager);
                    byte[] bArr = this.l;
                    String str3 = this.j;
                    eiig.x(str3);
                    PageDataMap pageDataMap12 = this.u;
                    eiig.x(pageDataMap12);
                    PageData a5 = pageDataMap12.a(2);
                    ProfileData profileData = this.x;
                    eiig.x(profileData);
                    bpVar3.t(R.id.fm_family_creation_fragment_container, azyg.x(bArr, str3, a5, profileData));
                    bpVar3.b();
                }
            } else {
                bp bpVar4 = new bp(supportFragmentManager);
                byte[] bArr2 = this.l;
                String str4 = this.j;
                eiig.x(str4);
                PageDataMap pageDataMap13 = this.u;
                eiig.x(pageDataMap13);
                PageData a6 = pageDataMap13.a(37);
                azxy azxyVar = new azxy();
                Bundle bundle = new Bundle(4);
                bundle.putByteArray("auditToken", bArr2);
                bundle.putString("accountName", str4);
                bundle.putParcelable("pageData", a6);
                azxyVar.setArguments(bundle);
                bpVar4.t(R.id.fm_family_creation_fragment_container, azxyVar);
                bpVar4.b();
            }
        } else {
            bp bpVar5 = new bp(supportFragmentManager);
            String str5 = this.j;
            eiig.x(str5);
            PageDataMap pageDataMap14 = this.u;
            eiig.x(pageDataMap14);
            PageData a7 = pageDataMap14.a(1);
            azuq azuqVar = new azuq();
            Bundle bundle2 = new Bundle(2);
            bundle2.putString("accountName", str5);
            bundle2.putParcelable("pageData", a7);
            azuqVar.setArguments(bundle2);
            bpVar5.t(R.id.fm_family_creation_fragment_container, azuqVar);
            bpVar5.b();
        }
        return true;
    }

    public final void M(int i) {
        setResult(4, new Intent().putExtra("accountName", this.j).putExtra("errorCode", i));
        finish();
    }

    @Override // defpackage.azup
    public final void b() {
        byte[] bArr = this.l;
        String str = this.j;
        eiig.x(str);
        PageDataMap pageDataMap = this.u;
        eiig.x(pageDataMap);
        PageData a = pageDataMap.a(2);
        ProfileData profileData = this.x;
        eiig.x(profileData);
        azyg x = azyg.x(bArr, str, a, profileData);
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.F(R.id.fm_family_creation_fragment_container, x);
        bpVar.w(null);
        bpVar.a();
    }

    @Override // defpackage.azuw
    public final void c(Calendar calendar) {
        this.z = calendar;
        U();
    }

    @Override // defpackage.azup, defpackage.azxx, defpackage.azyf, defpackage.azwr, defpackage.azuw, defpackage.azwz, defpackage.azwo, defpackage.bacv, defpackage.azyi
    public final azrr hA() {
        return this.A;
    }

    @Override // defpackage.bacv
    public final azpv k() {
        return this.B;
    }

    @Override // defpackage.bacv
    public final azpx l() {
        return this.k;
    }

    public final void m(boolean z) {
        fj fjVar = null;
        if (getIntent().hasExtra("tosContent")) {
            byte[] bArr = this.l;
            String str = this.j;
            eiig.x(str);
            String stringExtra = getIntent().getStringExtra("tosContent");
            eiig.x(stringExtra);
            bact x = bact.x(bArr, str, stringExtra, getIntent().getStringExtra("tosContinueButton"), getIntent().getStringExtra("tosMoreButton"));
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
        epvg[] epvgVarArr;
        if (this.E.size() == 0) {
            this.F = this.o == epte.HEAD_OF_HOUSEHOLD && this.p && this.r;
            jti a = jti.a(this);
            if (!this.F) {
                CanCreateFamilyData canCreateFamilyData = this.y;
                if (canCreateFamilyData != null && !canCreateFamilyData.a && (epvgVarArr = canCreateFamilyData.b) != null && epvgVarArr.length > 0 && epvgVarArr[0] != epvg.LACKS_BIRTHDAY && canCreateFamilyData.c == null) {
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
                            a.c(2, null, new azvv(this));
                            return;
                        }
                        m(true);
                        getSupportFragmentManager().an();
                        this.z = null;
                        return;
                    }
                }
                if (canCreateFamilyData != null && canCreateFamilyData.a) {
                    a.c(2, null, new azvv(this));
                    return;
                }
                PageDataMap pageDataMap = this.u;
                eiig.x(pageDataMap);
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

    @Override // defpackage.bacv
    public final void o() {
        azqb.b(this).show();
        Q();
    }

    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
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
                    eiig.x(intent);
                    if (intent.getStringExtra("consistencyToken") != null) {
                        this.k.c(getIntent().getStringExtra("consistencyToken"), getIntent().getLongExtra("tokenExpirationTimeSecs", 0L));
                    }
                    eiig.x(intent);
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
                    azqq azqqVar = this.J;
                    eiig.x(intent);
                    azqqVar.e(intent);
                    setResult(1, N());
                    finish();
                    break;
                }
            case 4:
                if (this.J.f() == 6) {
                    azqq azqqVar2 = this.J;
                    eiig.x(intent);
                    String stringExtra = intent.getStringExtra("extra.consistencyToken");
                    if (stringExtra != null) {
                        str = "errorCode";
                        azqqVar2.d.c(stringExtra, 300L);
                    } else {
                        str = "errorCode";
                    }
                } else {
                    str = "errorCode";
                    azqq azqqVar3 = this.J;
                    eiig.x(intent);
                    azqqVar3.e(intent);
                }
                azqc azqcVar = this.K;
                long j = this.J.c;
                fecj v = eslt.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                eslt esltVar = (eslt) v.b;
                esltVar.c = 6;
                esltVar.b |= 1;
                fecj v2 = eslp.a.v();
                fecj v3 = eslo.a.v();
                int i4 = i3 != -1 ? i3 != 0 ? 1 : 3 : 2;
                if (!v3.b.L()) {
                    v3.U();
                }
                eslo esloVar = (eslo) v3.b;
                esloVar.c = i4 - 1;
                esloVar.b |= 1;
                if (!v2.b.L()) {
                    v2.U();
                }
                eslp eslpVar = (eslp) v2.b;
                eslo esloVar2 = (eslo) v3.Q();
                esloVar2.getClass();
                eslpVar.c = esloVar2;
                eslpVar.b |= 2;
                if (!v.b.L()) {
                    v.U();
                }
                eslt esltVar2 = (eslt) v.b;
                eslp eslpVar2 = (eslp) v2.Q();
                eslpVar2.getClass();
                esltVar2.d = eslpVar2;
                esltVar2.b |= 2;
                azqcVar.a((eslt) v.Q(), j);
                String stringExtra2 = intent.getStringExtra("result.familywebviewoutcome");
                eumg eumgVar = null;
                if (!TextUtils.isEmpty(stringExtra2)) {
                    try {
                        byte[] decode = Base64.decode(stringExtra2, 0);
                        if (decode != null) {
                            fecp y = fecp.y(eumg.a, decode, 0, decode.length, febw.a());
                            fecp.M(y);
                            eumgVar = (eumg) y;
                        }
                    } catch (fedk | IllegalArgumentException e) {
                        azqq.a.f(a.o(stringExtra2, e, "exception caught in getDeserializedWebviewState: InvalidProtocolBufferException -- Received unexpected protocol buffer '", "'. Details: "), new Object[0]);
                    }
                }
                int i5 = i3 != -1 ? 3 : 1;
                if (eumgVar != null) {
                    this.H = eumgVar.c;
                    if (i3 == -1) {
                        int i6 = eumgVar.b;
                        if ((i6 & 4) != 0) {
                            int a = eumf.a(eumgVar.e);
                            if (a == 0) {
                                a = 1;
                            }
                            int i7 = a - 1;
                            if (i7 == 1) {
                                startActivityForResult(new Intent().setClassName(this, "com.google.android.gms.family.v2.manage.FamilyManagementActivity").putExtra("accountName", this.j).putExtra("appId", this.B.a).putExtra("familyChanged", true).putExtra("consistencyToken", this.k.b()).putExtra("tokenExpirationTimeSecs", this.k.a()).putExtra("customTheme", getIntent().getIntExtra("customTheme", 0)).putExtra("predefinedTheme", asqx.c(getIntent().getStringExtra("predefinedTheme"))).putExtra("clientCallingPackage", asng.q(this)), 5);
                                break;
                            } else if (i7 == 2) {
                                int i8 = true != fnmh.j() ? 1 : 3;
                                dipr diprVar = new dipr(this);
                                diprVar.g(Base64.decode(eumgVar.f, 0));
                                String str2 = this.j;
                                eiig.x(str2);
                                diprVar.c(new Account(str2, "com.google"));
                                diprVar.e(i8);
                                WalletCustomTheme walletCustomTheme = new WalletCustomTheme();
                                walletCustomTheme.g(anxo.a(this, R.style.Theme_MyAccount_Wallet));
                                diprVar.d(walletCustomTheme);
                                startActivityForResult(diprVar.a(), 6);
                                break;
                            }
                        } else if ((i6 & 2) != 0) {
                            int a2 = eumd.a(eumgVar.d);
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
                azqc azqcVar2 = this.K;
                long j2 = this.J.c;
                fecj v4 = eslt.a.v();
                int i9 = i3 == -1 ? 8 : 9;
                if (!v4.b.L()) {
                    v4.U();
                }
                eslt esltVar3 = (eslt) v4.b;
                esltVar3.c = i9 - 1;
                esltVar3.b |= 1;
                azqcVar2.a((eslt) v4.Q(), j2);
                finish();
                break;
        }
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        dg g = getSupportFragmentManager().g(R.id.fm_family_creation_fragment_container);
        if (g == null) {
            t();
        } else {
            if (!(g instanceof azyj)) {
                super.onBackPressed();
                return;
            }
            setResult(1, N());
            this.A.i(31);
            finish();
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        epte epteVar;
        super.onCreate(bundle);
        this.A = new azrr(this);
        String q = asng.q(this);
        if (!aqup.d(this).h(q)) {
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
        for (Account account2 : bqna.b(this).p("com.google")) {
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
        eiig.x(stringExtra2);
        this.B = new azpv(stringExtra2, Integer.toString(ModuleManager.get(this).getCurrentModule().moduleVersion));
        this.m = getIntent().getStringExtra("referencePcid");
        this.k = new azpx();
        if (bundle != null && bundle.getString("consistencyToken") != null) {
            this.k.c(bundle.getString("consistencyToken"), bundle.getLong("tokenExpirationTimeSecs", 0L));
        } else if (getIntent().getStringExtra("consistencyToken") != null) {
            this.k.c(getIntent().getStringExtra("consistencyToken"), getIntent().getLongExtra("tokenExpirationTimeSecs", 0L));
        }
        if (bundle != null && bundle.getByteArray("auditToken") != null) {
            byte[] byteArray = bundle.getByteArray("auditToken");
            eiig.x(byteArray);
            this.l = byteArray;
        } else if (getIntent().getByteArrayExtra("auditToken") != null) {
            byte[] byteArrayExtra = getIntent().getByteArrayExtra("auditToken");
            eiig.x(byteArrayExtra);
            this.l = byteArrayExtra;
        } else {
            fecj v = esxb.a.v();
            feay w = feay.w(umc.a());
            if (!v.b.L()) {
                v.U();
            }
            esxb esxbVar = (esxb) v.b;
            esxbVar.b |= 1;
            esxbVar.c = w;
            this.l = ((esxb) v.Q()).r();
        }
        this.x = bundle != null ? (ProfileData) bundle.getParcelable("profileData") : null;
        this.y = bundle != null ? (CanCreateFamilyData) bundle.getParcelable("canCreateData") : null;
        this.w = bundle != null ? (SetupParams) bundle.getParcelable("setupParams") : null;
        this.v = bundle != null ? (UpgradeParams) bundle.getParcelable("upgradeParams") : null;
        int a = bundle != null ? eptc.a(bundle.getInt("pcidType")) : 0;
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
            epteVar = epte.b(bundle.getInt("inviteeRole"));
            eiig.x(epteVar);
        } else {
            epteVar = epte.UNKNOWN_FAMILY_ROLE;
        }
        this.n = epteVar;
        if (epteVar == null) {
            epteVar = epte.UNKNOWN_FAMILY_ROLE;
        }
        this.n = epteVar;
        if (bundle != null && bundle.getBoolean("familyChanged")) {
            z = true;
        }
        this.H = z;
        azrr azrrVar = this.A;
        String str = this.j;
        eiig.x(str);
        azpv azpvVar = this.B;
        azrrVar.d(str, azpvVar.b, azpvVar.a);
        String str2 = this.j;
        eiig.x(str2);
        this.K = new azqc(this, str2);
        femw a2 = fnms.a.a().a();
        String stringExtra3 = getIntent().getStringExtra("appId");
        eiig.x(stringExtra3);
        String d = azqq.d(stringExtra3);
        if (W() || !fnmh.k() || (!a2.b.contains(d) && !D.contains(d))) {
            azqe.d(this, getIntent(), q);
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
            jti a3 = jti.a(this);
            a3.c(5, null, new azwb(this));
            B(5);
            a3.c(7, null, new azvo(this));
            B(7);
            a3.c(6, null, new azvs(this));
            B(6);
            a3.c(4, null, new azvf(this));
            B(4);
            return;
        }
        String str3 = this.j;
        eiig.x(str3);
        azqq azqqVar = new azqq(str3, d, this.k, q);
        this.J = azqqVar;
        azqc azqcVar = this.K;
        int f = azqqVar.f();
        int i = ModuleManager.get(this).getCurrentModule().moduleVersion;
        long j = this.J.c;
        fecj v2 = eslt.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        eslt esltVar = (eslt) v2.b;
        esltVar.c = 5;
        esltVar.b |= 1;
        fecj v3 = esls.a.v();
        if (!v3.b.L()) {
            v3.U();
        }
        fecp fecpVar = v3.b;
        esls eslsVar = (esls) fecpVar;
        eslsVar.c = eumb.a(f);
        eslsVar.b |= 1;
        if (!fecpVar.L()) {
            v3.U();
        }
        fecp fecpVar2 = v3.b;
        esls eslsVar2 = (esls) fecpVar2;
        eslsVar2.b = 2 | eslsVar2.b;
        eslsVar2.d = i;
        if (!fecpVar2.L()) {
            v3.U();
        }
        esls eslsVar3 = (esls) v3.b;
        eslsVar3.e = 1;
        eslsVar3.b |= 4;
        if (!v2.b.L()) {
            v2.U();
        }
        eslt esltVar2 = (eslt) v2.b;
        esls eslsVar4 = (esls) v3.Q();
        eslsVar4.getClass();
        esltVar2.e = eslsVar4;
        esltVar2.b |= 4;
        azqcVar.a((eslt) v2.Q(), j);
        azqq azqqVar2 = this.J;
        fecj v4 = csvn.a.v();
        azqn azqnVar = new azqn();
        azqnVar.d(fnmh.a.a().o());
        azqnVar.a = azqqVar2.b();
        azqnVar.c(azqqVar2.c);
        azqnVar.b(String.valueOf(eumb.a(azqqVar2.f())));
        String a4 = azqnVar.a().a();
        if (!v4.b.L()) {
            v4.U();
        }
        fecp fecpVar3 = v4.b;
        a4.getClass();
        ((csvn) fecpVar3).b = a4;
        String str4 = azqqVar2.b;
        if (!fecpVar3.L()) {
            v4.U();
        }
        fecp fecpVar4 = v4.b;
        str4.getClass();
        ((csvn) fecpVar4).c = str4;
        if (!fecpVar4.L()) {
            v4.U();
        }
        fecp fecpVar5 = v4.b;
        ((csvn) fecpVar5).d = 1;
        if (!fecpVar5.L()) {
            v4.U();
        }
        ((csvn) v4.b).e = 1;
        int i2 = bqnc.a().d;
        if (!v4.b.L()) {
            v4.U();
        }
        ((csvn) v4.b).f = i2;
        String c = azqqVar2.c();
        if (!v4.b.L()) {
            v4.U();
        }
        ((csvn) v4.b).g = c;
        startActivityForResult(cslv.a((csvn) v4.Q()), 4);
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onPause() {
        super.onPause();
        jti a = jti.a(this);
        a.e(0);
        a.e(2);
        a.e(5);
        a.e(7);
        a.e(6);
        a.e(4);
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
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

    @Override // defpackage.bacv
    public final void p() {
        Q();
    }

    public final void q() {
        findViewById(R.id.fm_family_creation_loading_screen).setVisibility(8);
    }

    @Override // defpackage.azwz, defpackage.azwo
    public final void r() {
        t();
    }

    @Override // defpackage.azwr, defpackage.azwz, defpackage.azwo
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
        eiig.x(str);
        String str2 = this.m;
        int i = this.C;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        bacw bacwVar = new bacw();
        Bundle bundle = new Bundle(4);
        bundle.putString("accountName", str);
        bundle.putString("referencePcid", str2);
        bundle.putInt("pcidType", i2);
        bundle.putBoolean("headless", false);
        bacwVar.setArguments(bundle);
        bacwVar.show(getSupportFragmentManager(), "upgrade-preconditions");
    }

    public final void t() {
        this.A.i(32);
        setResult(3, N());
        finish();
    }

    public final void u() {
        PageDataMap pageDataMap;
        azyj x;
        if (this.I && (pageDataMap = this.u) != null && pageDataMap.c(35)) {
            q();
            this.I = false;
            if (W() && this.B.a.equals("agsa")) {
                String str = this.j;
                eiig.x(str);
                PageDataMap pageDataMap2 = this.u;
                eiig.x(pageDataMap2);
                x = azyj.x(str, pageDataMap2.a(35), new ArrayList());
            } else {
                String str2 = this.j;
                eiig.x(str2);
                PageDataMap pageDataMap3 = this.u;
                eiig.x(pageDataMap3);
                x = azyj.x(str2, pageDataMap3.a(35), null);
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
        boolean k = fnmh.k();
        if (!k) {
            this.A.a();
        }
        femw b = fnmw.b();
        String stringExtra = getIntent().getStringExtra("appId");
        eiig.x(stringExtra);
        String d = azqq.d(stringExtra);
        if (W() || !k || (!b.b.contains(d) && !D.contains(d))) {
            Intent addFlags = new Intent().setClassName(this, "com.google.android.gms.family.v2.invites.SendInvitationsActivity").putExtra("accountName", this.j).putExtra("consistencyToken", this.k.b()).putExtra("tokenExpirationTimeSecs", this.k.a()).putExtra("appId", this.B.a).putExtra("customTheme", getIntent().getIntExtra("customTheme", 0)).putExtra("predefinedTheme", asqx.c(getIntent().getStringExtra("predefinedTheme"))).putExtra("clientCallingPackage", asng.q(this)).putExtra("fromCreate", true).putExtra("familyChanged", this.H).putExtra("profileData", this.x).putExtra("inviteeRole", this.n.g).addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE);
            if (this.B.a.equals("agsa")) {
                addFlags.putExtra("isDirectAddInvitations", W());
            }
            startActivityForResult(addFlags, 2);
            return;
        }
        String str3 = this.j;
        eiig.x(str3);
        azqq azqqVar = new azqq(str3, d, this.k, asng.q(this));
        this.J = azqqVar;
        this.K.c(azqqVar.f(), ModuleManager.get(this).getCurrentModule().moduleVersion, this.J.c);
        startActivityForResult(this.J.a("family_module_create_family"), 3);
    }

    @Override // defpackage.azxx
    public final void v() {
        if (this.I) {
            this.A.i(32);
            setResult(1);
            finish();
            return;
        }
        if (!this.F) {
            CanCreateFamilyData canCreateFamilyData = this.y;
            eiig.x(canCreateFamilyData);
            if (!canCreateFamilyData.a) {
                R();
                return;
            }
        }
        m(false);
    }

    @Override // defpackage.azyf
    public final void w() {
        if (!this.F) {
            CanCreateFamilyData canCreateFamilyData = this.y;
            eiig.x(canCreateFamilyData);
            if (!canCreateFamilyData.a) {
                R();
                return;
            }
        }
        m(false);
    }

    @Override // defpackage.azyi
    public final void x() {
        this.t = false;
        u();
    }

    @Override // defpackage.bacs
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

    @Override // defpackage.azqh
    public final Context getContext() {
        return this;
    }
}
