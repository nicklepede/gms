package com.google.android.gms.family.v2.manage;

import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.R;
import com.google.android.gms.family.model.DashboardDataModel;
import com.google.android.gms.family.model.InvitationDataModel;
import com.google.android.gms.family.model.MemberDataModel;
import com.google.android.gms.family.v2.manage.FamilyManagementChimeraActivity;
import com.google.android.gms.family.v2.model.ContactPickerOptionsData;
import com.google.android.gms.family.v2.model.PageData;
import com.google.android.gms.family.v2.model.PageDataMap;
import defpackage.asxe;
import defpackage.auad;
import defpackage.aura;
import defpackage.auur;
import defpackage.bbtr;
import defpackage.bbtt;
import defpackage.bbtw;
import defpackage.bbtx;
import defpackage.bbty;
import defpackage.bbua;
import defpackage.bbud;
import defpackage.bbum;
import defpackage.bbvn;
import defpackage.bccq;
import defpackage.bccr;
import defpackage.bcdg;
import defpackage.bcdh;
import defpackage.bcdp;
import defpackage.bcdt;
import defpackage.bcdy;
import defpackage.bcef;
import defpackage.bceg;
import defpackage.bceh;
import defpackage.bcek;
import defpackage.bcel;
import defpackage.bcen;
import defpackage.bcep;
import defpackage.bceq;
import defpackage.bces;
import defpackage.bcet;
import defpackage.bcey;
import defpackage.bcez;
import defpackage.bcfa;
import defpackage.bcff;
import defpackage.bcfg;
import defpackage.bp;
import defpackage.cq;
import defpackage.eelx;
import defpackage.ekvl;
import defpackage.eshd;
import defpackage.esiy;
import defpackage.ew;
import defpackage.fgrc;
import defpackage.fqej;
import defpackage.fqep;
import defpackage.fqet;
import defpackage.qzg;
import defpackage.qzh;
import defpackage.rxx;
import defpackage.ryt;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class FamilyManagementChimeraActivity extends rxx implements bcef, bcep, bces, bcdp, bcff, bccq, bcdg, bcey, bbud {
    private static final auad o = new auad("Family module", "FamilyManagementChimeraActivity");
    public String j;
    public bbtt k;
    public bbvn l;
    public bbtr n;
    private boolean p;
    private DashboardDataModel r;
    private PageDataMap s;
    private ContactPickerOptionsData u;
    private String v;
    private bbum w;
    private bbty x;
    private boolean q = false;
    public ProgressDialog m = null;
    private boolean t = false;

    private final void N() {
        cq cqVar = (cq) getSupportFragmentManager().h("InvitationsPreconditions");
        if (cqVar != null) {
            cqVar.dismissAllowingStateLoss();
        }
        getWindow().clearFlags(8192);
    }

    private final void O() {
        j();
        setResult(9, J());
        finish();
    }

    private final void P(Intent intent) {
        V(intent);
        ew supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.g(R.id.fm_family_management_fragment_container) instanceof bcet) {
            supportFragmentManager.as();
        }
        j();
        Q();
    }

    private final void Q() {
        ew supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.g(R.id.fm_family_management_fragment_container) instanceof bceh) {
            bceh bcehVar = (bceh) supportFragmentManager.g(R.id.fm_family_management_fragment_container);
            ekvl.y(bcehVar);
            bcehVar.B();
        }
    }

    private final void R(Intent intent) {
        this.k.b();
        if (this.k.b().isEmpty()) {
            return;
        }
        intent.putExtra("consistencyToken", this.k.b()).putExtra("tokenExpirationTimeSecs", this.k.a());
    }

    private final void S() {
        ProgressDialog progressDialog = new ProgressDialog(this, bbua.c(getIntent()));
        this.m = progressDialog;
        progressDialog.setIndeterminate(true);
        this.m.setCancelable(false);
        this.m.setMessage(getResources().getString(R.string.fm_delete_family_progress));
        this.m.show();
    }

    private final void T() {
        int i = bbtx.a;
        bbtw bbtwVar = new bbtw(this);
        bbtwVar.o(R.string.fm_not_in_family_error);
        bbtwVar.setPositiveButton(R.string.close_button_label, new DialogInterface.OnClickListener() { // from class: bcej
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                FamilyManagementChimeraActivity familyManagementChimeraActivity = FamilyManagementChimeraActivity.this;
                bbvn bbvnVar = familyManagementChimeraActivity.l;
                ekvl.y(bbvnVar);
                bbvnVar.e(2, 6);
                familyManagementChimeraActivity.M(-4);
            }
        });
        bbtwVar.create().show();
    }

    private final void U(MemberDataModel memberDataModel) {
        Intent intent = (Intent) getIntent().getParcelableExtra("manageSupervisedMemberIntent");
        ekvl.y(intent);
        bbvn bbvnVar = this.l;
        ekvl.y(bbvnVar);
        bbvnVar.h(5);
        if (fqej.c()) {
            intent.setPackage(fqep.e());
        }
        X(intent, 39);
        intent.putExtra("memberId", memberDataModel.a);
        R(intent);
        startActivityForResult(intent, 8);
    }

    private final void V(Intent intent) {
        if (intent.getStringExtra("consistencyToken") != null) {
            this.k.c(intent.getStringExtra("consistencyToken"), intent.getLongExtra("tokenExpirationTimeSecs", 0L));
        }
    }

    private final boolean W() {
        return getIntent().getBooleanExtra("isDirectAddInvitations", false);
    }

    private final void X(Intent intent, int i) {
        String str = intent.getPackage();
        if (TextUtils.isEmpty(str)) {
            ComponentName component = intent.getComponent();
            ekvl.y(component);
            str = component.getClassName();
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        bbvn bbvnVar = this.l;
        ekvl.y(bbvnVar);
        fgrc v = qzh.a.v();
        if (!v.b.L()) {
            v.U();
        }
        qzh qzhVar = (qzh) v.b;
        qzhVar.c = i - 1;
        qzhVar.b |= 1;
        fgrc v2 = qzg.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        qzg qzgVar = (qzg) v2.b;
        str.getClass();
        qzgVar.b |= 1;
        qzgVar.c = str;
        qzg qzgVar2 = (qzg) v2.Q();
        if (!v.b.L()) {
            v.U();
        }
        qzh qzhVar2 = (qzh) v.b;
        qzgVar2.getClass();
        qzhVar2.f = qzgVar2;
        qzhVar2.b |= 8;
        bbvnVar.b((qzh) v.Q());
    }

    @Override // defpackage.bcef
    public final void A(InvitationDataModel invitationDataModel) {
        bceq bceqVar = new bceq();
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("invitation", invitationDataModel);
        bceqVar.setArguments(bundle);
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.F(R.id.fm_family_management_fragment_container, bceqVar);
        bpVar.w("Manage Invitations");
        bpVar.a();
    }

    @Override // defpackage.bcef
    public final void B(MemberDataModel memberDataModel) {
        Intent intent = (Intent) getIntent().getParcelableExtra("manageKIntent");
        if (intent != null) {
            if (fqej.c()) {
                intent.setPackage(fqep.e());
            } else if (this.n.a.equals("pfl")) {
                intent.setPackage(fqep.g());
            }
            X(intent, 40);
            intent.putExtra("memberId", memberDataModel.a);
            R(intent);
            startActivityForResult(intent, 6);
        }
    }

    @Override // defpackage.bcef
    public final void C(MemberDataModel memberDataModel, String str, boolean z, boolean z2) {
        bbvn bbvnVar = this.l;
        ekvl.y(bbvnVar);
        bbvnVar.h(5);
        if (((Intent) getIntent().getParcelableExtra("manageSupervisedMemberIntent")) != null && memberDataModel.a()) {
            U(memberDataModel);
            return;
        }
        Intent intent = (Intent) getIntent().getParcelableExtra("manageMemberIntent");
        if (intent != null) {
            if (fqej.c()) {
                intent.setPackage(fqep.e());
            } else if (this.n.a.equals("pfl")) {
                intent.setPackage(fqep.g());
            }
            X(intent, 41);
            if (z2) {
                intent.putExtra("removeMemberIntent", I(memberDataModel, str, z));
            } else {
                intent.removeExtra("removeMemberIntent");
            }
            intent.putExtra("memberId", memberDataModel.a);
            R(intent);
            startActivityForResult(intent, 4);
            return;
        }
        PageDataMap pageDataMap = this.s;
        ekvl.y(pageDataMap);
        PageData a = pageDataMap.a(31);
        bcet bcetVar = new bcet();
        Bundle bundle = new Bundle(4);
        bundle.putParcelable("member_data", memberDataModel);
        bundle.putString("hoh_given_name", str);
        bundle.putParcelable("manage_member_pd", a);
        bundle.putBoolean("can_be_removed", z2);
        bcetVar.setArguments(bundle);
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.F(R.id.fm_family_management_fragment_container, bcetVar);
        bpVar.w(null);
        bpVar.a();
    }

    @Override // defpackage.bcef
    public final void D(MemberDataModel memberDataModel) {
        Intent intent = (Intent) getIntent().getParcelableExtra("manageKIntent");
        Intent intent2 = (Intent) getIntent().getParcelableExtra("manageSupervisedMemberIntent");
        if (intent != null && memberDataModel.g == 4) {
            B(memberDataModel);
            return;
        }
        if (intent2 != null && memberDataModel.g != 4) {
            U(memberDataModel);
            return;
        }
        bbvn bbvnVar = this.l;
        ekvl.y(bbvnVar);
        bbvnVar.h(37);
        startActivityForResult(new Intent().setClassName(this, "com.google.android.gms.family.webview.FamilyWebViewActivity").putExtra("webviewUrl", "https://families.google.com/familylink/kids/".concat(String.valueOf(memberDataModel.a))).putExtra("accountName", this.j), 9);
    }

    @Override // defpackage.bcef, defpackage.bces
    public final void E(MemberDataModel memberDataModel, String str, boolean z) {
        Intent I = I(memberDataModel, str, z);
        if (z) {
            bbvn bbvnVar = this.l;
            ekvl.y(bbvnVar);
            bbvnVar.h(16);
            startActivityForResult(I, 3);
            return;
        }
        bbvn bbvnVar2 = this.l;
        ekvl.y(bbvnVar2);
        bbvnVar2.h(7);
        startActivityForResult(I, 2);
    }

    @Override // defpackage.bcef
    public final void F() {
        PageDataMap pageDataMap = this.s;
        if (pageDataMap != null && pageDataMap.c(31) && this.s.a(31).a.containsKey(33)) {
            bbvn bbvnVar = this.l;
            ekvl.y(bbvnVar);
            bbvnVar.h(36);
            PageDataMap pageDataMap2 = this.s;
            ekvl.y(pageDataMap2);
            String str = (String) pageDataMap2.a(31).a.get(33);
            ekvl.y(str);
            startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse(str)), 7);
        }
    }

    @Override // defpackage.bcef
    public final void G(ArrayList arrayList, PageData pageData) {
        String str = this.j;
        ekvl.y(str);
        PageDataMap pageDataMap = this.s;
        ekvl.y(pageDataMap);
        PageData a = pageDataMap.a(33);
        Bundle bundle = new Bundle(4);
        bundle.putString("accountName", str);
        bundle.putParcelableArrayList("MEMBERS", arrayList);
        bundle.putParcelable("mppd", pageData);
        bundle.putParcelable("mpnepd", a);
        bcfa bcfaVar = new bcfa();
        bcfaVar.setArguments(bundle);
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.F(R.id.fm_family_management_fragment_container, bcfaVar);
        bpVar.w("ManageParents");
        bpVar.a();
    }

    @Override // defpackage.bcef
    public final void H(ContactPickerOptionsData contactPickerOptionsData) {
        this.u = contactPickerOptionsData;
    }

    final Intent I(MemberDataModel memberDataModel, String str, boolean z) {
        Intent putExtra = new Intent().setClassName(this, "com.google.android.gms.family.v2.manage.DeleteMemberActivity").putExtra("accountName", this.j);
        ekvl.y(memberDataModel);
        Intent putExtra2 = putExtra.putExtra("memberId", memberDataModel.a);
        ekvl.y(memberDataModel);
        return putExtra2.putExtra("memberGivenName", memberDataModel.d).putExtra("hohGivenName", str).putExtra("leaveFamily", z).putExtra("appId", this.n.a).putExtra("customTheme", getIntent().getIntExtra("customTheme", 0)).putExtra("predefinedTheme", auur.c(getIntent().getStringExtra("predefinedTheme"))).putExtra("clientCallingPackage", aura.q(this));
    }

    public final Intent J() {
        Intent putExtra = new Intent().putExtra("accountName", this.j).putExtra("familyChanged", this.p);
        R(putExtra);
        return putExtra;
    }

    @Override // defpackage.bcep
    public final void K(InvitationDataModel invitationDataModel) {
        onBackPressed();
        ew supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.g(R.id.fm_family_management_fragment_container) instanceof bceh) {
            bceh bcehVar = (bceh) supportFragmentManager.g(R.id.fm_family_management_fragment_container);
            ekvl.y(bcehVar);
            bcehVar.D(bcehVar.getResources().getString(R.string.fm_cancelling_invitation_message));
            ryt rytVar = (ryt) bcehVar.getContext();
            ekvl.y(rytVar);
            rytVar.getSupportLoaderManager().c(3, null, new bcdy(bcehVar, invitationDataModel));
        }
    }

    public final void L() {
        bbtx.b(this).show();
    }

    public final void M(int i) {
        setResult(4, new Intent().putExtra("accountName", this.j).putExtra("errorCode", i));
        finish();
    }

    @Override // defpackage.bcff
    public final int a() {
        return 5;
    }

    @Override // defpackage.bcdg
    public final void b() {
        super.onBackPressed();
        ew supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.g(R.id.fm_family_management_fragment_container) instanceof bcfa) {
            bbvn bbvnVar = this.l;
            ekvl.y(bbvnVar);
            bbvnVar.h(31);
            bcfa bcfaVar = (bcfa) supportFragmentManager.g(R.id.fm_family_management_fragment_container);
            ekvl.y(bcfaVar);
            bcfaVar.y();
        }
        if (supportFragmentManager.g(R.id.fm_family_management_fragment_container) instanceof bceh) {
            bbvn bbvnVar2 = this.l;
            ekvl.y(bbvnVar2);
            bbvnVar2.h(27);
        }
    }

    @Override // defpackage.bcdg
    public final void c(String str, int i) {
        super.onBackPressed();
        ew supportFragmentManager = getSupportFragmentManager();
        eshd b = eshd.b(i);
        if (b == null) {
            b = eshd.UNKNOWN_FAMILY_ROLE;
        }
        if (supportFragmentManager.g(R.id.fm_family_management_fragment_container) instanceof bcfa) {
            bbvn bbvnVar = this.l;
            ekvl.y(bbvnVar);
            bbvnVar.h(30);
            bcfa bcfaVar = (bcfa) supportFragmentManager.g(R.id.fm_family_management_fragment_container);
            ekvl.y(bcfaVar);
            bcfaVar.B();
            ryt rytVar = (ryt) bcfaVar.getContext();
            ekvl.y(rytVar);
            rytVar.getSupportLoaderManager().d(7, null, new bcez(bcfaVar, str, b));
        }
        if (supportFragmentManager.g(R.id.fm_family_management_fragment_container) instanceof bceh) {
            bbvn bbvnVar2 = this.l;
            ekvl.y(bbvnVar2);
            bbvnVar2.h(26);
            bceh bcehVar = (bceh) supportFragmentManager.g(R.id.fm_family_management_fragment_container);
            ekvl.y(bcehVar);
            bcehVar.C();
            ryt rytVar2 = (ryt) bcehVar.getContext();
            ekvl.y(rytVar2);
            rytVar2.getSupportLoaderManager().d(7, null, new bceg(bcehVar, str, b));
        }
    }

    @Override // defpackage.bcdp
    public final void d() {
        bbvn bbvnVar = this.l;
        ekvl.y(bbvnVar);
        bbvnVar.h(13);
        onBackPressed();
    }

    @Override // defpackage.bcdp
    public final void e() {
        String str = this.j;
        ekvl.y(str);
        bcfg.x(str, getString(R.string.fm_reauth_password_title_delete_family), getString(R.string.fm_reauth_pin_title_delete_family)).show(getSupportFragmentManager(), (String) null);
    }

    @Override // defpackage.bcef
    public final String f() {
        return aura.q(this);
    }

    @Override // defpackage.bcef
    public final void g() {
        bbvn bbvnVar = this.l;
        ekvl.y(bbvnVar);
        bbvnVar.f(2, 8, "updaterequired");
        M(4);
    }

    @Override // defpackage.bcef
    public final void h() {
        this.x.c(this.w.f(), ModuleManager.get(this).getCurrentModule().moduleVersion, this.w.c);
        startActivityForResult(this.w.a("family_module_management_dashboard"), 10);
    }

    @Override // defpackage.bcef, defpackage.bcep, defpackage.bces, defpackage.bccq, defpackage.bcce
    public final bbvn hQ() {
        bbvn bbvnVar = this.l;
        ekvl.y(bbvnVar);
        return bbvnVar;
    }

    @Override // defpackage.bcff
    public final void hR() {
        this.q = true;
        S();
        getSupportLoaderManager().c(0, null, new bcen(this));
    }

    @Override // defpackage.bcef
    public final void i(DashboardDataModel dashboardDataModel) {
        this.r = dashboardDataModel;
    }

    @Override // defpackage.bcef
    public final void j() {
        this.p = true;
    }

    @Override // defpackage.bcff
    public final int k() {
        return 1;
    }

    @Override // defpackage.bcef, defpackage.bcdp, defpackage.bccq
    public final bbtr l() {
        return this.n;
    }

    @Override // defpackage.bcef, defpackage.bcdp, defpackage.bccq
    public final bbtt m() {
        return this.k;
    }

    @Override // defpackage.bcef, defpackage.bcey
    public final void n() {
        j();
        this.t = true;
    }

    @Override // defpackage.bccq
    public final void o() {
        L();
        N();
    }

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        ArrayList parcelableArrayListExtra;
        super.onActivityResult(i, i2, intent);
        switch (i) {
            case 1:
                j();
                ekvl.y(intent);
                V(intent);
                if (intent.getIntExtra("num-invitations-sent", 0) > 0 || (W() && intent != null && (parcelableArrayListExtra = intent.getParcelableArrayListExtra("direct-add-contacts-list")) != null && !parcelableArrayListExtra.isEmpty())) {
                    PageDataMap pageDataMap = this.s;
                    if (pageDataMap != null && pageDataMap.c(38) && this.s.a(38).a.containsKey(34)) {
                        String str = (String) this.s.a(38).a.get(34);
                        View findViewById = findViewById(R.id.fm_family_management_fragment_container);
                        ekvl.y(str);
                        eelx.t(findViewById, str, 0).i();
                    } else {
                        eelx.s(findViewById(R.id.fm_family_management_fragment_container), R.string.fm_invitations_sent, 0).i();
                    }
                    Q();
                    break;
                }
                break;
            case 2:
                if (i2 == 6) {
                    ekvl.y(intent);
                    P(intent);
                    break;
                }
                break;
            case 3:
                if (i2 == 9) {
                    O();
                    break;
                }
                break;
            case 4:
                if (i2 != 6) {
                    if (i2 == 9) {
                        O();
                        break;
                    }
                } else {
                    ekvl.y(intent);
                    P(intent);
                    break;
                }
                break;
            case 5:
                if (i2 == 11) {
                    j();
                    ekvl.y(intent);
                    V(intent);
                    Q();
                    break;
                }
                break;
            case 6:
                if (i2 == 12) {
                    j();
                    ekvl.y(intent);
                    V(intent);
                    Q();
                    break;
                }
                break;
            case 7:
            case 8:
            case 9:
                Q();
                break;
            case 10:
                this.x.b(this.w.c, i2);
                j();
                bbum bbumVar = this.w;
                ekvl.y(intent);
                bbumVar.e(intent);
                Q();
                break;
        }
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        if (getSupportFragmentManager().b() == 0) {
            setResult(3, J());
            finish();
        } else {
            if (getSupportFragmentManager().g(R.id.fm_family_management_fragment_container) instanceof bcdh) {
                b();
                return;
            }
            super.onBackPressed();
            if (this.t) {
                j();
                Q();
                this.t = false;
            }
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        fqej fqejVar = fqej.a;
        if (fqejVar.lK().a() && (intent.getFlags() & 33554432) != 0) {
            o.m("FamilyManagementChimeraActivity: Intent has unexpected forward activity result flag", new Object[0]);
            setResult(4);
            finish();
            return;
        }
        String action = intent.getAction();
        if (fqejVar.lK().b() && action != null && !action.equals("com.google.android.gms.family.v2.MANAGE")) {
            o.m("FamilyManagementChimeraActivity: Intent has unexpected action: %s", action);
            setResult(4);
            finish();
            return;
        }
        this.l = new bbvn(this);
        String q = aura.q(this);
        if (!asxe.d(this).h(q)) {
            bbvn bbvnVar = this.l;
            ekvl.y(bbvnVar);
            bbvnVar.e(2, 8);
            M(-3);
            return;
        }
        bbua.d(this, getIntent(), q);
        String stringExtra = getIntent().getStringExtra("accountName");
        this.j = stringExtra;
        if (stringExtra == null) {
            bbvn bbvnVar2 = this.l;
            ekvl.y(bbvnVar2);
            bbvnVar2.e(2, 13);
            M(-2);
            return;
        }
        String stringExtra2 = getIntent().getStringExtra("appId");
        ekvl.y(stringExtra2);
        this.v = stringExtra2;
        this.n = new bbtr(this.v, Integer.toString(ModuleManager.get(this).getCurrentModule().moduleVersion));
        bbvn bbvnVar3 = this.l;
        ekvl.y(bbvnVar3);
        String str = this.j;
        ekvl.y(str);
        bbtr bbtrVar = this.n;
        bbvnVar3.d(str, bbtrVar.b, bbtrVar.a);
        bbvn bbvnVar4 = this.l;
        ekvl.y(bbvnVar4);
        bbvnVar4.h(2);
        String str2 = this.j;
        ekvl.y(str2);
        this.x = new bbty(this, str2);
        getSupportLoaderManager();
        this.k = new bbtt();
        V(getIntent());
        this.p = getIntent().getBooleanExtra("familyChanged", false) || (bundle != null && bundle.getBoolean("familyChanged", false));
        if (fqep.h()) {
            getWindow();
            bbua.e(this);
            fqep.l();
        }
        setContentView(R.layout.fm_activity_family_management);
        this.t = bundle != null && bundle.getBoolean("FamilyRolesChanged", false);
        boolean z = getIntent().getParcelableExtra("manageMemberIntent") != null;
        boolean z2 = getIntent().getParcelableExtra("manageSupervisedMemberIntent") != null;
        boolean z3 = getIntent().getParcelableExtra("manageKIntent") != null;
        ew supportFragmentManager = getSupportFragmentManager();
        String str3 = this.j;
        ekvl.y(str3);
        boolean W = W();
        String str4 = this.v;
        bceh bcehVar = new bceh();
        Bundle bundle2 = new Bundle(5);
        bundle2.putString("accountName", str3);
        bundle2.putBoolean("hasMemberIntent", z);
        bundle2.putBoolean("hasSupervisedMemberIntent", z2);
        bundle2.putBoolean("hasKidIntent", z3);
        bundle2.putBoolean("directAdd", W);
        bundle2.putString("appId", str4);
        bcehVar.setArguments(bundle2);
        if (supportFragmentManager.g(R.id.fm_family_management_fragment_container) == null) {
            bp bpVar = new bp(supportFragmentManager);
            bpVar.t(R.id.fm_family_management_fragment_container, bcehVar);
            bpVar.a();
        }
        if (bundle != null && bundle.getBoolean("DeleteFamilyInProgress", false)) {
            S();
            getSupportLoaderManager().c(0, null, new bcen(this));
        }
        this.r = bundle != null ? (DashboardDataModel) bundle.getParcelable("DashboardDataModel") : null;
        this.s = bundle != null ? (PageDataMap) bundle.getParcelable("pageDataMap") : null;
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onDestroy() {
        bbvn bbvnVar = this.l;
        if (bbvnVar != null) {
            bbvnVar.h(3);
        }
        super.onDestroy();
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("familyChanged", this.p);
        bundle.putBoolean("DeleteFamilyInProgress", this.q);
        bundle.putBoolean("FamilyRolesChanged", this.t);
        ProgressDialog progressDialog = this.m;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        bundle.putParcelable("DashboardDataModel", this.r);
        bundle.putParcelable("pageDataMap", this.s);
    }

    @Override // defpackage.bccq
    public final void p() {
        N();
    }

    @Override // defpackage.bcef
    public final void q(bbum bbumVar) {
        this.w = bbumVar;
    }

    @Override // defpackage.bcef
    public final void r(PageDataMap pageDataMap) {
        this.s = pageDataMap;
    }

    @Override // defpackage.bcef, defpackage.bcey
    public final void s(PageData pageData, String str, int i) {
        ew supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.g(R.id.fm_family_management_fragment_container) instanceof bcfa) {
            bbvn bbvnVar = this.l;
            ekvl.y(bbvnVar);
            bbvnVar.h(29);
        }
        if (supportFragmentManager.g(R.id.fm_family_management_fragment_container) instanceof bceh) {
            bbvn bbvnVar2 = this.l;
            ekvl.y(bbvnVar2);
            bbvnVar2.h(25);
        }
        String str2 = this.j;
        ekvl.y(str2);
        bcdh bcdhVar = new bcdh();
        Bundle bundle = new Bundle(4);
        bundle.putString("accountName", str2);
        bundle.putParcelable("pageData", pageData);
        bundle.putInt("desiredRole", i);
        bundle.putString("memberId", str);
        bcdhVar.setArguments(bundle);
        bp bpVar = new bp(supportFragmentManager);
        bpVar.F(R.id.fm_family_management_fragment_container, bcdhVar);
        bpVar.w("ChangeRoleConfirmation");
        bpVar.b();
    }

    @Override // defpackage.bcef
    public final void t() {
        Intent intent = (Intent) getIntent().getParcelableExtra("createAccountIntent");
        if (intent != null) {
            X(intent, 38);
        }
        if (intent == null) {
            L();
            return;
        }
        intent.putExtra("consistencyToken", this.k.b());
        intent.putExtra("tokenExpirationTimeSecs", this.k.a());
        startActivityForResult(intent, 5);
    }

    @Override // defpackage.bccq
    public final void u(int i, int i2) {
        Intent putExtra = new Intent().setClassName(this, "com.google.android.gms.family.invites.SendInvitationsActivity").putExtra("accountName", this.j).putExtra("consistencyToken", this.k.b()).putExtra("tokenExpirationTimeSecs", this.k.a()).putExtra("max-available-slots", i).putExtra("appId", this.n.a).putExtra("isDirectAddInvitations", W()).putExtra("customTheme", getIntent().getIntExtra("customTheme", 0)).putExtra("predefinedTheme", auur.c(getIntent().getStringExtra("predefinedTheme"))).putExtra("clientCallingPackage", aura.q(this)).putExtra("inviteeRole", i2);
        PageDataMap pageDataMap = this.s;
        Intent putExtra2 = putExtra.putExtra("invitesSendingPagedata", (pageDataMap == null || !pageDataMap.c(23)) ? new PageData(esiy.a) : this.s.a(23));
        PageDataMap pageDataMap2 = this.s;
        Intent putExtra3 = putExtra2.putExtra("invitesRetryPagedata", (pageDataMap2 == null || !pageDataMap2.c(24)) ? new PageData(esiy.a) : this.s.a(24));
        PageDataMap pageDataMap3 = this.s;
        Intent putExtra4 = putExtra3.putExtra("invitesRetryLaterPagedata", (pageDataMap3 == null || !pageDataMap3.c(25)) ? new PageData(esiy.a) : this.s.a(25));
        DashboardDataModel dashboardDataModel = this.r;
        if (dashboardDataModel != null && dashboardDataModel.f) {
            putExtra4.putExtra("disable-sms-invites", true);
        }
        ContactPickerOptionsData contactPickerOptionsData = this.u;
        if (contactPickerOptionsData != null) {
            putExtra4.putExtra("contactPickerOptions", contactPickerOptionsData);
            startActivityForResult(putExtra4, 1);
            N();
            return;
        }
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: bcei
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                bbvn bbvnVar = FamilyManagementChimeraActivity.this.l;
                ekvl.y(bbvnVar);
                bbvnVar.e(2, 42);
            }
        };
        int i3 = bbtx.a;
        bbtw bbtwVar = new bbtw(this);
        bbtwVar.o(R.string.common_something_went_wrong);
        bbtwVar.setPositiveButton(R.string.common_cancel, onClickListener);
        bbtwVar.create().show();
        N();
    }

    @Override // defpackage.bcef
    public final void v() {
        bbvn bbvnVar = this.l;
        ekvl.y(bbvnVar);
        bbvnVar.h(11);
        String str = this.j;
        ekvl.y(str);
        bcdt bcdtVar = new bcdt();
        Bundle bundle = new Bundle(1);
        bundle.putString("accountName", str);
        bcdtVar.setArguments(bundle);
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.F(R.id.fm_family_management_fragment_container, bcdtVar);
        bpVar.w("Confirm delete family");
        bpVar.a();
    }

    @Override // defpackage.bcef
    public final void w(PageData pageData) {
        if (pageData == null) {
            T();
            return;
        }
        String str = this.j;
        ekvl.y(str);
        bbtx.a(this, pageData, str, new bcek(this), null, false).show();
    }

    @Override // defpackage.bcef
    public final void x(PageData pageData) {
        if (pageData == null) {
            T();
            return;
        }
        String str = this.j;
        ekvl.y(str);
        bbtx.a(this, pageData, str, new bcel(this), null, false).show();
    }

    @Override // defpackage.bcef
    public final void y(int i, int i2) {
        if (!fqet.c()) {
            getWindow().addFlags(8192);
        }
        String str = this.j;
        ekvl.y(str);
        bccr.x(str, i, i2).show(getSupportFragmentManager(), "InvitationsPreconditions");
    }

    @Override // defpackage.bccq
    public final boolean z() {
        return false;
    }

    @Override // defpackage.bbud
    public final Context getContext() {
        return this;
    }
}
