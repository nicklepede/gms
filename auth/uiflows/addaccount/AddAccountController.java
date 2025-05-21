package com.google.android.gms.auth.uiflows.addaccount;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.UserHandle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.R;
import com.google.android.gms.auth.account.be.UpdateHideDmNotificationsIntentOperation;
import com.google.android.gms.auth.firstparty.shared.D2dOptions;
import com.google.android.gms.auth.firstparty.shared.ManagedAuthOptions;
import com.google.android.gms.auth.keyattestation.KeyAttestationWarningChimeraActivity;
import com.google.android.gms.auth.setup.d2d.SmartDeviceChimeraActivity;
import com.google.android.gms.auth.uiflows.controller.Controller;
import defpackage.aano;
import defpackage.aanp;
import defpackage.addx;
import defpackage.addy;
import defpackage.adea;
import defpackage.adeb;
import defpackage.adej;
import defpackage.adek;
import defpackage.adev;
import defpackage.adex;
import defpackage.adfw;
import defpackage.adjb;
import defpackage.adjd;
import defpackage.adjh;
import defpackage.adjj;
import defpackage.adjt;
import defpackage.adjx;
import defpackage.adle;
import defpackage.arka;
import defpackage.arke;
import defpackage.arlb;
import defpackage.arxd;
import defpackage.arxo;
import defpackage.asej;
import defpackage.asnd;
import defpackage.asot;
import defpackage.asqh;
import defpackage.denr;
import defpackage.dvni;
import defpackage.edeq;
import defpackage.edjs;
import defpackage.fkdk;
import defpackage.fkdo;
import defpackage.fkdz;
import defpackage.fkib;
import defpackage.fkkq;
import defpackage.fkkz;
import defpackage.fkmu;
import defpackage.fuvs;
import defpackage.vfv;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AddAccountController implements Controller {
    final adeb b;
    boolean c;
    boolean d;
    Intent e;
    Account f;
    boolean g;
    String h;
    boolean i;
    boolean j;
    boolean k;
    boolean l;
    adex m;
    boolean n;
    boolean o;
    String p;
    private Intent t;
    private static final asot q = asot.c("Auth", asej.AUTH_ACCOUNT_DATA, "AddAccountController");
    private static final List r = Arrays.asList("com.android.settings", "com.android.vending");
    private static final aano s = new aano("token_handle");
    public static final aano a = new aano("intentionally_canceled");
    public static final Parcelable.Creator CREATOR = new addy();

    public AddAccountController(adeb adebVar, boolean z, Intent intent, Account account, boolean z2, Intent intent2, String str, boolean z3, boolean z4, boolean z5, boolean z6, String str2, boolean z7, adex adexVar) {
        this.b = adebVar;
        this.d = z;
        this.e = intent;
        this.f = account;
        this.g = z2;
        this.t = intent2;
        this.h = str;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.p = str2;
        this.c = z7;
        this.m = adexVar;
    }

    private static adle A(int i) {
        return new adle(0, null, i, null, addx.a, addx.b);
    }

    public static boolean c(boolean z) {
        if (!z) {
            return false;
        }
        dvni dvniVar = vfv.a;
        return fkib.a.a().g();
    }

    public static boolean d(boolean z) {
        if (!z) {
            return false;
        }
        dvni dvniVar = vfv.a;
        return fkib.a.a().f();
    }

    public static void e(Context context, Account account) {
        Intent startIntent = IntentOperation.getStartIntent(context, UpdateHideDmNotificationsIntentOperation.class, "com.google.android.gms.auth.account.be.update_hide_dm_notifications");
        if (startIntent != null) {
            startIntent.putExtra("account_name", account);
            startIntent.putExtra("hide_notifications", true);
        }
        context.startService(startIntent);
    }

    private final Intent f(String str) {
        adjh adjhVar = adjh.c;
        adeb adebVar = this.b;
        Context context = adebVar.a;
        boolean z = adebVar.j;
        boolean z2 = adebVar.g;
        return adjhVar.a(context, new adjd(z, z2, ErrorChimeraActivity.j(z2), context.getString(R.string.common_something_went_wrong), str, adebVar.k));
    }

    private final Intent g() {
        boolean z = this.d;
        int i = addx.a;
        adeb adebVar = this.b;
        D2dOptions d2dOptions = adebVar.x;
        String.valueOf(d2dOptions);
        if (!asqh.a() || adebVar.l) {
            return null;
        }
        boolean z2 = d2dOptions != null && d2dOptions.b;
        boolean z3 = adebVar.g;
        if (!z3) {
            if (!z2) {
                return null;
            }
            z2 = true;
        }
        boolean z4 = d2dOptions != null && d2dOptions.c;
        if (z4 && d2dOptions.f == null) {
            return null;
        }
        boolean z5 = d2dOptions != null && d2dOptions.a && z2;
        boolean z6 = z4 && z2;
        if (z && !z5 && !z6) {
            return null;
        }
        Context context = adebVar.a;
        arke arkeVar = adebVar.k;
        boolean z7 = adebVar.j;
        String str = arkeVar.a;
        arxo arxoVar = SmartDeviceChimeraActivity.l;
        if (arlb.a(context) == null) {
            SmartDeviceChimeraActivity.l.m("Skipping TargetActivity. Reason: Bluetooth not available.", new Object[0]);
            return null;
        }
        if (!asnd.t(context)) {
            SmartDeviceChimeraActivity.l.m("Skipping TargetActivity. Reason: Not main user.", new Object[0]);
            return null;
        }
        if (denr.a(context)) {
            SmartDeviceChimeraActivity.l.m("Skipping TargetActivity. Reason: Cannot copy restricted profile", new Object[0]);
            return null;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.setup.d2d.SmartDeviceActivity");
        aanp aanpVar = new aanp();
        aanpVar.d(SmartDeviceChimeraActivity.h, str);
        aanpVar.d(SmartDeviceChimeraActivity.i, Boolean.valueOf(z7));
        aanpVar.d(SmartDeviceChimeraActivity.m, true != z3 ? "auth" : "suw");
        aanpVar.d(SmartDeviceChimeraActivity.n, arxd.n(d2dOptions));
        return className.putExtras(aanpVar.a);
    }

    private final aanp h() {
        aanp aanpVar = new aanp();
        this.c = true;
        aanpVar.d(a, true);
        return aanpVar;
    }

    private final adle i() {
        adeb adebVar = this.b;
        boolean z = adebVar.v;
        if (fkdz.h() && !z && arka.f(this.h)) {
            z = true;
        }
        adea adeaVar = new adea(adebVar);
        adeaVar.k(z);
        Intent b = addx.b(adeaVar.a(), this.f, this.g, this.j);
        return b != null ? new adle(41, b, 0, null, android.R.anim.fade_in, android.R.anim.fade_out) : l();
    }

    private final adle j() {
        if (arka.f(this.h)) {
            return q(0);
        }
        adeb adebVar = this.b;
        if (fkmu.c() && asqh.e() && !arka.f(this.h) && this.i) {
            Context context = adebVar.a;
            DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService("device_policy");
            if (devicePolicyManager == null || devicePolicyManager.getDeviceOwner() == null) {
                UserManager userManager = (UserManager) context.getSystemService("user");
                if (userManager != null && asqh.a()) {
                    Iterator<UserHandle> it = userManager.getUserProfiles().iterator();
                    while (it.hasNext()) {
                        if (userManager.isManagedProfile(it.next().getIdentifier())) {
                            break;
                        }
                    }
                }
                if (asnd.t(context)) {
                    Intent b = WrapperControlledChimeraActivity.b(context, adebVar.j, adebVar.k, new Intent("com.google.android.gms.auth.managed.UNMANAGED_WORK_PROFILE_OPT_IN").setClassName(context, "com.google.android.gms.auth.manged.ui.GenericActivity"));
                    int i = addx.a;
                    return new adle(120, b, 0, null, 0, 0);
                }
            }
        }
        return x(4);
    }

    private final adle k() {
        if (this.t == null || !y()) {
            return r();
        }
        adeb adebVar = this.b;
        return new adle(50, WrapperControlledChimeraActivity.b(adebVar.a, adebVar.j, adebVar.k, this.t), 0, null, addx.a, addx.b);
    }

    private final adle l() {
        Intent intent;
        String str = this.h;
        boolean z = this.l;
        Account account = this.f;
        boolean z2 = this.g;
        dvni dvniVar = vfv.a;
        boolean B = fkkz.a.a().B();
        adeb adebVar = this.b;
        boolean z3 = adebVar.g;
        boolean z4 = (!B || z3 || z || arka.f(str)) ? false : true;
        Log.i("Auth", String.format(Locale.US, "[AddAccount, AppPickerHelper] Showing app picker = %b", Boolean.valueOf(z4)));
        if (z4) {
            Context context = adebVar.a;
            boolean z5 = adebVar.j;
            arke arkeVar = adebVar.k;
            Intent intent2 = new Intent();
            intent2.setAction("com.google.android.apps.restore.APP_PICKER_ADD_ACCOUNT");
            intent = adev.a(context, intent2);
            if (intent != null) {
                Intent putExtra = intent.putExtra("account", account);
                aanp aanpVar = new aanp();
                aanpVar.d(adej.a, account);
                aanpVar.d(adej.b, Boolean.valueOf(z2));
                aanpVar.d(adej.c, Boolean.valueOf(z3));
                aanpVar.d(adjb.b, Boolean.valueOf(z5));
                aanpVar.d(adjb.a, arkeVar == null ? null : arkeVar.a());
                putExtra.putExtras(aanpVar.a);
            } else {
                Log.i("Auth", String.format(Locale.US, "[AddAccount, AppPickerHelper] App picker activity couldn't be resolved.", new Object[0]));
            }
        } else {
            intent = null;
        }
        Intent b = intent != null ? WrapperControlledChimeraActivity.b(adebVar.a, adebVar.j, adebVar.k, intent) : null;
        return b != null ? new adle(42, b, 0, null, android.R.anim.fade_in, android.R.anim.fade_out) : j();
    }

    private final adle m() {
        return n(null);
    }

    private final adle n(Bundle bundle) {
        Intent putExtras = new Intent().putExtras(h().a);
        if (bundle != null) {
            putExtras.putExtras(bundle);
        }
        adeb adebVar = this.b;
        int i = addx.a;
        AccountAuthenticatorResponse accountAuthenticatorResponse = adebVar.d;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(4, "Canceled");
        }
        return new adle(0, null, 0, putExtras, addx.c, addx.d);
    }

    private final adle o() {
        Intent intent;
        int i;
        if (this.d) {
            intent = new Intent().putExtras(h().a);
            i = 0;
        } else {
            Intent intent2 = this.e;
            if (intent2 != null) {
                i = intent2.getIntExtra("tap_and_go_result_code", -1);
                this.e.removeExtra("tap_and_go_result_code");
                intent = this.e;
            } else {
                intent = null;
                i = 1;
            }
        }
        Intent intent3 = intent;
        int i2 = i;
        adeb adebVar = this.b;
        int i3 = addx.a;
        AccountAuthenticatorResponse accountAuthenticatorResponse = adebVar.d;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(4, "Skipped or error");
        }
        return new adle(0, null, i2, intent3, addx.a, addx.b);
    }

    private final adle p() {
        Intent intent;
        Intent intent2 = this.e;
        int i = -1;
        if (intent2 != null) {
            i = intent2.getIntExtra("tap_and_go_result_code", -1);
            this.e.removeExtra("tap_and_go_result_code");
            intent = this.e;
        } else {
            intent = null;
        }
        int i2 = i;
        if (!z()) {
            Bundle bundle = new Bundle();
            bundle.putString("authAccount", this.f.name);
            bundle.putString("accountType", this.f.type);
            bundle.putBoolean(adjb.e.a, this.g);
            String str = this.p;
            if (str != null) {
                bundle.putString("accountStatusToken", str);
            }
            intent = new Intent().putExtras(bundle);
        }
        Intent intent3 = intent;
        adeb adebVar = this.b;
        int i3 = addx.a;
        AccountAuthenticatorResponse accountAuthenticatorResponse = adebVar.d;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onResult(intent3 != null ? intent3.getExtras() : null);
        }
        return new adle(0, null, i2, intent3, addx.a, addx.b);
    }

    private final adle q(int i) {
        ManagedAuthOptions managedAuthOptions;
        Account account = this.f;
        adeb adebVar = this.b;
        arke arkeVar = adebVar.k;
        Bundle a2 = arkeVar == null ? Bundle.EMPTY : arkeVar.a();
        boolean z = adebVar.u;
        String str = adebVar.f;
        boolean z2 = adebVar.r;
        String str2 = this.h;
        boolean z3 = this.l;
        Bundle a3 = (!fkkq.c() || (managedAuthOptions = adebVar.w) == null) ? Bundle.EMPTY : managedAuthOptions.a();
        boolean z4 = adebVar.j;
        boolean z5 = adebVar.g;
        Context context = adebVar.a;
        Intent d = arka.d(context, account, z5, z4, a2, z, str, z2, str2, z3, 0, a3, false, i);
        if (d == null) {
            return x(4);
        }
        if (fkdo.a.a().H()) {
            return new adle(60, WrapperControlledChimeraActivity.b(context, z4, arkeVar, d), 0, null, addx.a, addx.b);
        }
        Intent b = WrapperControlledChimeraActivity.b(context, z4, arkeVar, d);
        int i2 = addx.a;
        return new adle(60, b, 0, null, 0, 0);
    }

    private final adle r() {
        adeb adebVar = this.b;
        if (!adebVar.g) {
            return p();
        }
        adek adekVar = adebVar.c;
        Intent intent = new Intent(true != asqh.c() ? "android.intent.action.ACTION_CARRIER_SETUP" : "android.intent.action.CARRIER_SETUP");
        intent.putExtra("device_setup", true);
        List carrierPackageNamesForIntent = adekVar.a.getCarrierPackageNamesForIntent(intent);
        if (carrierPackageNamesForIntent == null || carrierPackageNamesForIntent.isEmpty()) {
            intent = null;
        } else {
            if (carrierPackageNamesForIntent.size() != 1) {
                Log.w("Auth", String.format(Locale.US, "[CarrierSetupHelper] Multiple matching carrier apps found, launching the first.", new Object[0]));
            }
            intent.setPackage((String) carrierPackageNamesForIntent.get(0));
            intent.putExtra("disable_back", true);
            intent.putExtra("has_account", adekVar.b.p("com.google").length > 0);
            intent.putExtra("from_add_account_controller", true);
        }
        Intent b = intent != null ? WrapperControlledChimeraActivity.b(adebVar.a, adebVar.j, adebVar.k, intent) : null;
        return b != null ? new adle(90, b, 0, null, -1, -1) : p();
    }

    private final adle s(AccountDetail accountDetail) {
        this.f = new Account(accountDetail.a, accountDetail.b);
        this.g = accountDetail.c;
        boolean z = accountDetail.e;
        this.l = z;
        this.p = accountDetail.g;
        Intent intent = accountDetail.f;
        this.t = intent;
        if (intent != null) {
            adeb adebVar = this.b;
            intent.putExtra("theme", adebVar.k.a);
            this.t.putExtra("useImmersiveMode", adebVar.j);
        }
        this.h = accountDetail.d;
        if (fkmu.c()) {
            this.i = accountDetail.i;
        }
        this.l = z;
        if (arka.f(this.h)) {
            this.k = d(this.l);
            this.j = c(this.l);
            adeb adebVar2 = this.b;
            e(adebVar2.a, this.f);
        }
        return i();
    }

    private final adle t() {
        return new adle(30, addx.a(this.b, this.m, this.d, y()), 0, null, android.R.anim.fade_in, android.R.anim.fade_out);
    }

    private final adle u() {
        int i = addx.a;
        int i2 = adfw.b;
        adeb adebVar = this.b;
        Context context = adebVar.a;
        Intent intent = new Intent();
        intent.setAction("com.google.android.gms.auth.addaccount.PRE_ADD_ACCOUNT");
        Intent a2 = adev.a(context, intent);
        boolean z = adebVar.j;
        arke arkeVar = adebVar.k;
        boolean z2 = adebVar.g;
        if (a2 != null) {
            Intent putExtra = a2.putExtra("is_setup_wizard", z2).putExtra("use_immersive_mode", z).putExtra("is_resolve_frp_only", adebVar.t);
            Bundle a3 = arkeVar == null ? null : arkeVar.a();
            D2dOptions d2dOptions = adebVar.x;
            putExtra.putExtra("ui_parameters", a3);
            if (d2dOptions != null) {
                a2.putExtra("d2d_options", arxd.n(d2dOptions));
            }
        }
        Intent b = a2 != null ? WrapperControlledChimeraActivity.b(context, z, arkeVar, a2) : null;
        return b != null ? new adle(10, b, 0, null, -1, -1) : new adle(39, adjh.c.a(context, new adjd(z, z2, ErrorChimeraActivity.j(z2), context.getString(R.string.common_something_went_wrong), context.getString(R.string.auth_error_generic_server_error), arkeVar)), 0, null, -1, -1);
    }

    private final adle v() {
        Intent g = g();
        if (this.o) {
            adeb adebVar = this.b;
            int i = KeyAttestationWarningChimeraActivity.h;
            return new adle(15, adjj.c.a(adebVar.a, fuvs.a), 0, null, addx.a, addx.b);
        }
        if (this.n) {
            adeb adebVar2 = this.b;
            return new adle(14, adjx.c.a(adebVar2.a, new adjt(adebVar2.i)), 0, null, addx.a, addx.b);
        }
        if (g == null) {
            return t();
        }
        if (fkdk.d()) {
            adeb adebVar3 = this.b;
            int i2 = edjs.a;
            if (edeq.z(adebVar3.a)) {
                return new adle(20, g, 0, null, addx.a, addx.b);
            }
        }
        int i3 = addx.a;
        return new adle(20, g, 0, null, android.R.anim.fade_in, android.R.anim.fade_out);
    }

    private final adle w(int i) {
        return new adle(70, addx.c(this.b, this.f, this.l, i), 0, null, addx.a, addx.b);
    }

    private final adle x(int i) {
        return this.k ? w(i) : k();
    }

    private final boolean y() {
        adeb adebVar = this.b;
        if (adebVar.g) {
            return true;
        }
        return r.contains(adebVar.f);
    }

    private final boolean z() {
        Intent intent = this.e;
        if (intent == null) {
            return false;
        }
        return (intent.getStringExtra("authAccount") == null || this.e.getStringExtra("accountType") == null) ? false : true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:101:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f6  */
    @Override // com.google.android.gms.auth.uiflows.controller.Controller
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.adle a(defpackage.adli r27) {
        /*
            Method dump skipped, instructions count: 2186
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.uiflows.addaccount.AddAccountController.a(adli):adle");
    }

    @Override // com.google.android.gms.auth.uiflows.controller.Controller
    public final String b() {
        return "AddAccountController";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        adeb adebVar = this.b;
        parcel.writeParcelable(adebVar.d, 0);
        parcel.writeString(adebVar.e);
        parcel.writeByte(adebVar.g ? (byte) 1 : (byte) 0);
        parcel.writeByte(adebVar.h ? (byte) 1 : (byte) 0);
        parcel.writeByte(adebVar.i ? (byte) 1 : (byte) 0);
        parcel.writeByte(adebVar.j ? (byte) 1 : (byte) 0);
        arke arkeVar = adebVar.k;
        Bundle bundle = null;
        parcel.writeParcelable(arkeVar == null ? null : arkeVar.a(), 0);
        parcel.writeByte(adebVar.l ? (byte) 1 : (byte) 0);
        parcel.writeString(adebVar.n);
        parcel.writeString(adebVar.o);
        parcel.writeString(adebVar.p);
        parcel.writeStringArray((String[]) adebVar.q.toArray(new String[0]));
        parcel.writeString(adebVar.f);
        parcel.writeString(adebVar.s);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.e, 0);
        parcel.writeParcelable(this.f, 0);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.t, 0);
        parcel.writeString(this.h);
        if (fkmu.c()) {
            parcel.writeByte(this.i ? (byte) 1 : (byte) 0);
        }
        parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.k ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.l ? (byte) 1 : (byte) 0);
        parcel.writeString(this.p);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(adebVar.t ? (byte) 1 : (byte) 0);
        parcel.writeByte(adebVar.m ? (byte) 1 : (byte) 0);
        parcel.writeByte(adebVar.u ? (byte) 1 : (byte) 0);
        parcel.writeByte(adebVar.v ? (byte) 1 : (byte) 0);
        ManagedAuthOptions managedAuthOptions = adebVar.w;
        parcel.writeByteArray(managedAuthOptions == null ? null : arxd.n(managedAuthOptions));
        D2dOptions d2dOptions = adebVar.x;
        parcel.writeByteArray(d2dOptions == null ? null : arxd.n(d2dOptions));
        adex adexVar = this.m;
        if (adexVar != null) {
            bundle = new Bundle();
            bundle.putInt("desired_flow", adexVar.a);
        }
        parcel.writeParcelable(bundle, 0);
        parcel.writeString(adebVar.y);
        parcel.writeInt(adebVar.z);
        parcel.writeByte(adebVar.A ? (byte) 1 : (byte) 0);
        parcel.writeByte(adebVar.B ? (byte) 1 : (byte) 0);
    }
}
