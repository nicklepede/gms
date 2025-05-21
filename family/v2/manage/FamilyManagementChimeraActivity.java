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
import defpackage.aqup;
import defpackage.arxo;
import defpackage.asng;
import defpackage.asqx;
import defpackage.azpv;
import defpackage.azpx;
import defpackage.azqa;
import defpackage.azqb;
import defpackage.azqc;
import defpackage.azqe;
import defpackage.azqh;
import defpackage.azqq;
import defpackage.azrr;
import defpackage.azyu;
import defpackage.azyv;
import defpackage.azzk;
import defpackage.azzl;
import defpackage.azzt;
import defpackage.azzx;
import defpackage.baac;
import defpackage.baaj;
import defpackage.baak;
import defpackage.baal;
import defpackage.baao;
import defpackage.baap;
import defpackage.baar;
import defpackage.baat;
import defpackage.baau;
import defpackage.baaw;
import defpackage.baax;
import defpackage.babc;
import defpackage.babd;
import defpackage.babe;
import defpackage.babj;
import defpackage.babk;
import defpackage.bp;
import defpackage.cq;
import defpackage.ebzi;
import defpackage.eiig;
import defpackage.epte;
import defpackage.epuz;
import defpackage.ew;
import defpackage.fecj;
import defpackage.fnmb;
import defpackage.fnmh;
import defpackage.fnml;
import defpackage.pgc;
import defpackage.pgd;
import defpackage.qet;
import defpackage.qfp;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class FamilyManagementChimeraActivity extends qet implements baaj, baat, baaw, azzt, babj, azyu, azzk, babc, azqh {
    private static final arxo o = new arxo("Family module", "FamilyManagementChimeraActivity");
    public String j;
    public azpx k;
    public azrr l;
    public azpv n;
    private boolean p;
    private DashboardDataModel r;
    private PageDataMap s;
    private ContactPickerOptionsData u;
    private String v;
    private azqq w;
    private azqc x;
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
        if (supportFragmentManager.g(R.id.fm_family_management_fragment_container) instanceof baax) {
            supportFragmentManager.as();
        }
        j();
        Q();
    }

    private final void Q() {
        ew supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.g(R.id.fm_family_management_fragment_container) instanceof baal) {
            baal baalVar = (baal) supportFragmentManager.g(R.id.fm_family_management_fragment_container);
            eiig.x(baalVar);
            baalVar.B();
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
        ProgressDialog progressDialog = new ProgressDialog(this, azqe.c(getIntent()));
        this.m = progressDialog;
        progressDialog.setIndeterminate(true);
        this.m.setCancelable(false);
        this.m.setMessage(getResources().getString(R.string.fm_delete_family_progress));
        this.m.show();
    }

    private final void T() {
        int i = azqb.a;
        azqa azqaVar = new azqa(this);
        azqaVar.m(R.string.fm_not_in_family_error);
        azqaVar.setPositiveButton(R.string.close_button_label, new DialogInterface.OnClickListener() { // from class: baan
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                FamilyManagementChimeraActivity familyManagementChimeraActivity = FamilyManagementChimeraActivity.this;
                azrr azrrVar = familyManagementChimeraActivity.l;
                eiig.x(azrrVar);
                azrrVar.e(2, 6);
                familyManagementChimeraActivity.M(-4);
            }
        });
        azqaVar.create().show();
    }

    private final void U(MemberDataModel memberDataModel) {
        Intent intent = (Intent) getIntent().getParcelableExtra("manageSupervisedMemberIntent");
        eiig.x(intent);
        azrr azrrVar = this.l;
        eiig.x(azrrVar);
        azrrVar.h(5);
        if (fnmb.c()) {
            intent.setPackage(fnmh.e());
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
            eiig.x(component);
            str = component.getClassName();
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        azrr azrrVar = this.l;
        eiig.x(azrrVar);
        fecj v = pgd.a.v();
        if (!v.b.L()) {
            v.U();
        }
        pgd pgdVar = (pgd) v.b;
        pgdVar.c = i - 1;
        pgdVar.b |= 1;
        fecj v2 = pgc.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        pgc pgcVar = (pgc) v2.b;
        str.getClass();
        pgcVar.b |= 1;
        pgcVar.c = str;
        pgc pgcVar2 = (pgc) v2.Q();
        if (!v.b.L()) {
            v.U();
        }
        pgd pgdVar2 = (pgd) v.b;
        pgcVar2.getClass();
        pgdVar2.f = pgcVar2;
        pgdVar2.b |= 8;
        azrrVar.b((pgd) v.Q());
    }

    @Override // defpackage.baaj
    public final void A(InvitationDataModel invitationDataModel) {
        baau baauVar = new baau();
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("invitation", invitationDataModel);
        baauVar.setArguments(bundle);
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.F(R.id.fm_family_management_fragment_container, baauVar);
        bpVar.w("Manage Invitations");
        bpVar.a();
    }

    @Override // defpackage.baaj
    public final void B(MemberDataModel memberDataModel) {
        Intent intent = (Intent) getIntent().getParcelableExtra("manageKIntent");
        if (intent != null) {
            if (fnmb.c()) {
                intent.setPackage(fnmh.e());
            } else if (this.n.a.equals("pfl")) {
                intent.setPackage(fnmh.g());
            }
            X(intent, 40);
            intent.putExtra("memberId", memberDataModel.a);
            R(intent);
            startActivityForResult(intent, 6);
        }
    }

    @Override // defpackage.baaj
    public final void C(MemberDataModel memberDataModel, String str, boolean z, boolean z2) {
        azrr azrrVar = this.l;
        eiig.x(azrrVar);
        azrrVar.h(5);
        if (((Intent) getIntent().getParcelableExtra("manageSupervisedMemberIntent")) != null && memberDataModel.a()) {
            U(memberDataModel);
            return;
        }
        Intent intent = (Intent) getIntent().getParcelableExtra("manageMemberIntent");
        if (intent != null) {
            if (fnmb.c()) {
                intent.setPackage(fnmh.e());
            } else if (this.n.a.equals("pfl")) {
                intent.setPackage(fnmh.g());
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
        eiig.x(pageDataMap);
        PageData a = pageDataMap.a(31);
        baax baaxVar = new baax();
        Bundle bundle = new Bundle(4);
        bundle.putParcelable("member_data", memberDataModel);
        bundle.putString("hoh_given_name", str);
        bundle.putParcelable("manage_member_pd", a);
        bundle.putBoolean("can_be_removed", z2);
        baaxVar.setArguments(bundle);
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.F(R.id.fm_family_management_fragment_container, baaxVar);
        bpVar.w(null);
        bpVar.a();
    }

    @Override // defpackage.baaj
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
        azrr azrrVar = this.l;
        eiig.x(azrrVar);
        azrrVar.h(37);
        startActivityForResult(new Intent().setClassName(this, "com.google.android.gms.family.webview.FamilyWebViewActivity").putExtra("webviewUrl", "https://families.google.com/familylink/kids/".concat(String.valueOf(memberDataModel.a))).putExtra("accountName", this.j), 9);
    }

    @Override // defpackage.baaj, defpackage.baaw
    public final void E(MemberDataModel memberDataModel, String str, boolean z) {
        Intent I = I(memberDataModel, str, z);
        if (z) {
            azrr azrrVar = this.l;
            eiig.x(azrrVar);
            azrrVar.h(16);
            startActivityForResult(I, 3);
            return;
        }
        azrr azrrVar2 = this.l;
        eiig.x(azrrVar2);
        azrrVar2.h(7);
        startActivityForResult(I, 2);
    }

    @Override // defpackage.baaj
    public final void F() {
        PageDataMap pageDataMap = this.s;
        if (pageDataMap != null && pageDataMap.c(31) && this.s.a(31).a.containsKey(33)) {
            azrr azrrVar = this.l;
            eiig.x(azrrVar);
            azrrVar.h(36);
            PageDataMap pageDataMap2 = this.s;
            eiig.x(pageDataMap2);
            String str = (String) pageDataMap2.a(31).a.get(33);
            eiig.x(str);
            startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse(str)), 7);
        }
    }

    @Override // defpackage.baaj
    public final void G(ArrayList arrayList, PageData pageData) {
        String str = this.j;
        eiig.x(str);
        PageDataMap pageDataMap = this.s;
        eiig.x(pageDataMap);
        PageData a = pageDataMap.a(33);
        Bundle bundle = new Bundle(4);
        bundle.putString("accountName", str);
        bundle.putParcelableArrayList("MEMBERS", arrayList);
        bundle.putParcelable("mppd", pageData);
        bundle.putParcelable("mpnepd", a);
        babe babeVar = new babe();
        babeVar.setArguments(bundle);
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.F(R.id.fm_family_management_fragment_container, babeVar);
        bpVar.w("ManageParents");
        bpVar.a();
    }

    @Override // defpackage.baaj
    public final void H(ContactPickerOptionsData contactPickerOptionsData) {
        this.u = contactPickerOptionsData;
    }

    final Intent I(MemberDataModel memberDataModel, String str, boolean z) {
        Intent putExtra = new Intent().setClassName(this, "com.google.android.gms.family.v2.manage.DeleteMemberActivity").putExtra("accountName", this.j);
        eiig.x(memberDataModel);
        Intent putExtra2 = putExtra.putExtra("memberId", memberDataModel.a);
        eiig.x(memberDataModel);
        return putExtra2.putExtra("memberGivenName", memberDataModel.d).putExtra("hohGivenName", str).putExtra("leaveFamily", z).putExtra("appId", this.n.a).putExtra("customTheme", getIntent().getIntExtra("customTheme", 0)).putExtra("predefinedTheme", asqx.c(getIntent().getStringExtra("predefinedTheme"))).putExtra("clientCallingPackage", asng.q(this));
    }

    public final Intent J() {
        Intent putExtra = new Intent().putExtra("accountName", this.j).putExtra("familyChanged", this.p);
        R(putExtra);
        return putExtra;
    }

    @Override // defpackage.baat
    public final void K(InvitationDataModel invitationDataModel) {
        onBackPressed();
        ew supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.g(R.id.fm_family_management_fragment_container) instanceof baal) {
            baal baalVar = (baal) supportFragmentManager.g(R.id.fm_family_management_fragment_container);
            eiig.x(baalVar);
            baalVar.D(baalVar.getResources().getString(R.string.fm_cancelling_invitation_message));
            qfp qfpVar = (qfp) baalVar.getContext();
            eiig.x(qfpVar);
            qfpVar.getSupportLoaderManager().c(3, null, new baac(baalVar, invitationDataModel));
        }
    }

    public final void L() {
        azqb.b(this).show();
    }

    public final void M(int i) {
        setResult(4, new Intent().putExtra("accountName", this.j).putExtra("errorCode", i));
        finish();
    }

    @Override // defpackage.babj
    public final int a() {
        return 5;
    }

    @Override // defpackage.azzk
    public final void b() {
        super.onBackPressed();
        ew supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.g(R.id.fm_family_management_fragment_container) instanceof babe) {
            azrr azrrVar = this.l;
            eiig.x(azrrVar);
            azrrVar.h(31);
            babe babeVar = (babe) supportFragmentManager.g(R.id.fm_family_management_fragment_container);
            eiig.x(babeVar);
            babeVar.y();
        }
        if (supportFragmentManager.g(R.id.fm_family_management_fragment_container) instanceof baal) {
            azrr azrrVar2 = this.l;
            eiig.x(azrrVar2);
            azrrVar2.h(27);
        }
    }

    @Override // defpackage.azzk
    public final void c(String str, int i) {
        super.onBackPressed();
        ew supportFragmentManager = getSupportFragmentManager();
        epte b = epte.b(i);
        if (b == null) {
            b = epte.UNKNOWN_FAMILY_ROLE;
        }
        if (supportFragmentManager.g(R.id.fm_family_management_fragment_container) instanceof babe) {
            azrr azrrVar = this.l;
            eiig.x(azrrVar);
            azrrVar.h(30);
            babe babeVar = (babe) supportFragmentManager.g(R.id.fm_family_management_fragment_container);
            eiig.x(babeVar);
            babeVar.B();
            qfp qfpVar = (qfp) babeVar.getContext();
            eiig.x(qfpVar);
            qfpVar.getSupportLoaderManager().d(7, null, new babd(babeVar, str, b));
        }
        if (supportFragmentManager.g(R.id.fm_family_management_fragment_container) instanceof baal) {
            azrr azrrVar2 = this.l;
            eiig.x(azrrVar2);
            azrrVar2.h(26);
            baal baalVar = (baal) supportFragmentManager.g(R.id.fm_family_management_fragment_container);
            eiig.x(baalVar);
            baalVar.C();
            qfp qfpVar2 = (qfp) baalVar.getContext();
            eiig.x(qfpVar2);
            qfpVar2.getSupportLoaderManager().d(7, null, new baak(baalVar, str, b));
        }
    }

    @Override // defpackage.azzt
    public final void d() {
        azrr azrrVar = this.l;
        eiig.x(azrrVar);
        azrrVar.h(13);
        onBackPressed();
    }

    @Override // defpackage.azzt
    public final void e() {
        String str = this.j;
        eiig.x(str);
        babk.x(str, getString(R.string.fm_reauth_password_title_delete_family), getString(R.string.fm_reauth_pin_title_delete_family)).show(getSupportFragmentManager(), (String) null);
    }

    @Override // defpackage.baaj
    public final String f() {
        return asng.q(this);
    }

    @Override // defpackage.baaj
    public final void g() {
        azrr azrrVar = this.l;
        eiig.x(azrrVar);
        azrrVar.f(2, 8, "updaterequired");
        M(4);
    }

    @Override // defpackage.baaj
    public final void h() {
        this.x.c(this.w.f(), ModuleManager.get(this).getCurrentModule().moduleVersion, this.w.c);
        startActivityForResult(this.w.a("family_module_management_dashboard"), 10);
    }

    @Override // defpackage.baaj, defpackage.baat, defpackage.baaw, defpackage.azyu, defpackage.azyi
    public final azrr hA() {
        azrr azrrVar = this.l;
        eiig.x(azrrVar);
        return azrrVar;
    }

    @Override // defpackage.babj
    public final void hB() {
        this.q = true;
        S();
        getSupportLoaderManager().c(0, null, new baar(this));
    }

    @Override // defpackage.baaj
    public final void i(DashboardDataModel dashboardDataModel) {
        this.r = dashboardDataModel;
    }

    @Override // defpackage.baaj
    public final void j() {
        this.p = true;
    }

    @Override // defpackage.babj
    public final int k() {
        return 1;
    }

    @Override // defpackage.baaj, defpackage.azzt, defpackage.azyu
    public final azpv l() {
        return this.n;
    }

    @Override // defpackage.baaj, defpackage.azzt, defpackage.azyu
    public final azpx m() {
        return this.k;
    }

    @Override // defpackage.baaj, defpackage.babc
    public final void n() {
        j();
        this.t = true;
    }

    @Override // defpackage.azyu
    public final void o() {
        L();
        N();
    }

    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i, int i2, Intent intent) {
        ArrayList parcelableArrayListExtra;
        super.onActivityResult(i, i2, intent);
        switch (i) {
            case 1:
                j();
                eiig.x(intent);
                V(intent);
                if (intent.getIntExtra("num-invitations-sent", 0) > 0 || (W() && intent != null && (parcelableArrayListExtra = intent.getParcelableArrayListExtra("direct-add-contacts-list")) != null && !parcelableArrayListExtra.isEmpty())) {
                    PageDataMap pageDataMap = this.s;
                    if (pageDataMap != null && pageDataMap.c(38) && this.s.a(38).a.containsKey(34)) {
                        String str = (String) this.s.a(38).a.get(34);
                        View findViewById = findViewById(R.id.fm_family_management_fragment_container);
                        eiig.x(str);
                        ebzi.t(findViewById, str, 0).i();
                    } else {
                        ebzi.s(findViewById(R.id.fm_family_management_fragment_container), R.string.fm_invitations_sent, 0).i();
                    }
                    Q();
                    break;
                }
                break;
            case 2:
                if (i2 == 6) {
                    eiig.x(intent);
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
                    eiig.x(intent);
                    P(intent);
                    break;
                }
                break;
            case 5:
                if (i2 == 11) {
                    j();
                    eiig.x(intent);
                    V(intent);
                    Q();
                    break;
                }
                break;
            case 6:
                if (i2 == 12) {
                    j();
                    eiig.x(intent);
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
                azqq azqqVar = this.w;
                eiig.x(intent);
                azqqVar.e(intent);
                Q();
                break;
        }
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        if (getSupportFragmentManager().b() == 0) {
            setResult(3, J());
            finish();
        } else {
            if (getSupportFragmentManager().g(R.id.fm_family_management_fragment_container) instanceof azzl) {
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

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (fnmb.a.a().a() && (intent.getFlags() & 33554432) != 0) {
            o.m("FamilyManagementChimeraActivity: Intent has unexpected forward activity result flag", new Object[0]);
            setResult(4);
            finish();
            return;
        }
        String action = intent.getAction();
        if (fnmb.a.a().b() && action != null && !action.equals("com.google.android.gms.family.v2.MANAGE")) {
            o.m("FamilyManagementChimeraActivity: Intent has unexpected action: %s", action);
            setResult(4);
            finish();
            return;
        }
        this.l = new azrr(this);
        String q = asng.q(this);
        if (!aqup.d(this).h(q)) {
            azrr azrrVar = this.l;
            eiig.x(azrrVar);
            azrrVar.e(2, 8);
            M(-3);
            return;
        }
        azqe.d(this, getIntent(), q);
        String stringExtra = getIntent().getStringExtra("accountName");
        this.j = stringExtra;
        if (stringExtra == null) {
            azrr azrrVar2 = this.l;
            eiig.x(azrrVar2);
            azrrVar2.e(2, 13);
            M(-2);
            return;
        }
        String stringExtra2 = getIntent().getStringExtra("appId");
        eiig.x(stringExtra2);
        this.v = stringExtra2;
        this.n = new azpv(this.v, Integer.toString(ModuleManager.get(this).getCurrentModule().moduleVersion));
        azrr azrrVar3 = this.l;
        eiig.x(azrrVar3);
        String str = this.j;
        eiig.x(str);
        azpv azpvVar = this.n;
        azrrVar3.d(str, azpvVar.b, azpvVar.a);
        azrr azrrVar4 = this.l;
        eiig.x(azrrVar4);
        azrrVar4.h(2);
        String str2 = this.j;
        eiig.x(str2);
        this.x = new azqc(this, str2);
        getSupportLoaderManager();
        this.k = new azpx();
        V(getIntent());
        this.p = getIntent().getBooleanExtra("familyChanged", false) || (bundle != null && bundle.getBoolean("familyChanged", false));
        if (fnmh.h()) {
            getWindow();
            azqe.e(this);
            fnmh.l();
        }
        setContentView(R.layout.fm_activity_family_management);
        this.t = bundle != null && bundle.getBoolean("FamilyRolesChanged", false);
        boolean z = getIntent().getParcelableExtra("manageMemberIntent") != null;
        boolean z2 = getIntent().getParcelableExtra("manageSupervisedMemberIntent") != null;
        boolean z3 = getIntent().getParcelableExtra("manageKIntent") != null;
        ew supportFragmentManager = getSupportFragmentManager();
        String str3 = this.j;
        eiig.x(str3);
        boolean W = W();
        String str4 = this.v;
        baal baalVar = new baal();
        Bundle bundle2 = new Bundle(5);
        bundle2.putString("accountName", str3);
        bundle2.putBoolean("hasMemberIntent", z);
        bundle2.putBoolean("hasSupervisedMemberIntent", z2);
        bundle2.putBoolean("hasKidIntent", z3);
        bundle2.putBoolean("directAdd", W);
        bundle2.putString("appId", str4);
        baalVar.setArguments(bundle2);
        if (supportFragmentManager.g(R.id.fm_family_management_fragment_container) == null) {
            bp bpVar = new bp(supportFragmentManager);
            bpVar.t(R.id.fm_family_management_fragment_container, baalVar);
            bpVar.a();
        }
        if (bundle != null && bundle.getBoolean("DeleteFamilyInProgress", false)) {
            S();
            getSupportLoaderManager().c(0, null, new baar(this));
        }
        this.r = bundle != null ? (DashboardDataModel) bundle.getParcelable("DashboardDataModel") : null;
        this.s = bundle != null ? (PageDataMap) bundle.getParcelable("pageDataMap") : null;
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onDestroy() {
        azrr azrrVar = this.l;
        if (azrrVar != null) {
            azrrVar.h(3);
        }
        super.onDestroy();
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
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

    @Override // defpackage.azyu
    public final void p() {
        N();
    }

    @Override // defpackage.baaj
    public final void q(azqq azqqVar) {
        this.w = azqqVar;
    }

    @Override // defpackage.baaj
    public final void r(PageDataMap pageDataMap) {
        this.s = pageDataMap;
    }

    @Override // defpackage.baaj, defpackage.babc
    public final void s(PageData pageData, String str, int i) {
        ew supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.g(R.id.fm_family_management_fragment_container) instanceof babe) {
            azrr azrrVar = this.l;
            eiig.x(azrrVar);
            azrrVar.h(29);
        }
        if (supportFragmentManager.g(R.id.fm_family_management_fragment_container) instanceof baal) {
            azrr azrrVar2 = this.l;
            eiig.x(azrrVar2);
            azrrVar2.h(25);
        }
        String str2 = this.j;
        eiig.x(str2);
        azzl azzlVar = new azzl();
        Bundle bundle = new Bundle(4);
        bundle.putString("accountName", str2);
        bundle.putParcelable("pageData", pageData);
        bundle.putInt("desiredRole", i);
        bundle.putString("memberId", str);
        azzlVar.setArguments(bundle);
        bp bpVar = new bp(supportFragmentManager);
        bpVar.F(R.id.fm_family_management_fragment_container, azzlVar);
        bpVar.w("ChangeRoleConfirmation");
        bpVar.b();
    }

    @Override // defpackage.baaj
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

    @Override // defpackage.azyu
    public final void u(int i, int i2) {
        Intent putExtra = new Intent().setClassName(this, "com.google.android.gms.family.invites.SendInvitationsActivity").putExtra("accountName", this.j).putExtra("consistencyToken", this.k.b()).putExtra("tokenExpirationTimeSecs", this.k.a()).putExtra("max-available-slots", i).putExtra("appId", this.n.a).putExtra("isDirectAddInvitations", W()).putExtra("customTheme", getIntent().getIntExtra("customTheme", 0)).putExtra("predefinedTheme", asqx.c(getIntent().getStringExtra("predefinedTheme"))).putExtra("clientCallingPackage", asng.q(this)).putExtra("inviteeRole", i2);
        PageDataMap pageDataMap = this.s;
        Intent putExtra2 = putExtra.putExtra("invitesSendingPagedata", (pageDataMap == null || !pageDataMap.c(23)) ? new PageData(epuz.a) : this.s.a(23));
        PageDataMap pageDataMap2 = this.s;
        Intent putExtra3 = putExtra2.putExtra("invitesRetryPagedata", (pageDataMap2 == null || !pageDataMap2.c(24)) ? new PageData(epuz.a) : this.s.a(24));
        PageDataMap pageDataMap3 = this.s;
        Intent putExtra4 = putExtra3.putExtra("invitesRetryLaterPagedata", (pageDataMap3 == null || !pageDataMap3.c(25)) ? new PageData(epuz.a) : this.s.a(25));
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
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: baam
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                azrr azrrVar = FamilyManagementChimeraActivity.this.l;
                eiig.x(azrrVar);
                azrrVar.e(2, 42);
            }
        };
        int i3 = azqb.a;
        azqa azqaVar = new azqa(this);
        azqaVar.m(R.string.common_something_went_wrong);
        azqaVar.setPositiveButton(R.string.common_cancel, onClickListener);
        azqaVar.create().show();
        N();
    }

    @Override // defpackage.baaj
    public final void v() {
        azrr azrrVar = this.l;
        eiig.x(azrrVar);
        azrrVar.h(11);
        String str = this.j;
        eiig.x(str);
        azzx azzxVar = new azzx();
        Bundle bundle = new Bundle(1);
        bundle.putString("accountName", str);
        azzxVar.setArguments(bundle);
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.F(R.id.fm_family_management_fragment_container, azzxVar);
        bpVar.w("Confirm delete family");
        bpVar.a();
    }

    @Override // defpackage.baaj
    public final void w(PageData pageData) {
        if (pageData == null) {
            T();
            return;
        }
        String str = this.j;
        eiig.x(str);
        azqb.a(this, pageData, str, new baao(this), null, false).show();
    }

    @Override // defpackage.baaj
    public final void x(PageData pageData) {
        if (pageData == null) {
            T();
            return;
        }
        String str = this.j;
        eiig.x(str);
        azqb.a(this, pageData, str, new baap(this), null, false).show();
    }

    @Override // defpackage.baaj
    public final void y(int i, int i2) {
        if (!fnml.c()) {
            getWindow().addFlags(8192);
        }
        String str = this.j;
        eiig.x(str);
        azyv.x(str, i, i2).show(getSupportFragmentManager(), "InvitationsPreconditions");
    }

    @Override // defpackage.azyu
    public final boolean z() {
        return false;
    }

    @Override // defpackage.azqh
    public final Context getContext() {
        return this;
    }
}
