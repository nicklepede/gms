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
import defpackage.a;
import defpackage.acno;
import defpackage.acnp;
import defpackage.afdz;
import defpackage.afea;
import defpackage.afec;
import defpackage.afed;
import defpackage.afel;
import defpackage.afem;
import defpackage.afex;
import defpackage.afez;
import defpackage.affy;
import defpackage.afji;
import defpackage.afjk;
import defpackage.afjo;
import defpackage.afjq;
import defpackage.afka;
import defpackage.afke;
import defpackage.afll;
import defpackage.atmp;
import defpackage.atmt;
import defpackage.atnq;
import defpackage.atzb;
import defpackage.atzs;
import defpackage.auad;
import defpackage.auid;
import defpackage.auqx;
import defpackage.ausn;
import defpackage.auub;
import defpackage.dgyu;
import defpackage.dvsy;
import defpackage.dvsz;
import defpackage.dvtb;
import defpackage.dvtd;
import defpackage.dvte;
import defpackage.dxyi;
import defpackage.efrl;
import defpackage.efwn;
import defpackage.eluo;
import defpackage.fmtw;
import defpackage.fmua;
import defpackage.fmul;
import defpackage.fmyq;
import defpackage.fnbf;
import defpackage.fnbo;
import defpackage.fndj;
import defpackage.fxrq;
import defpackage.xbw;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AddAccountController implements Controller {
    final afed b;
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
    afez m;
    boolean n;
    boolean o;
    String p;
    private Intent t;
    private static final ausn q = ausn.c("Auth", auid.AUTH_ACCOUNT_DATA, "AddAccountController");
    private static final List r = Arrays.asList("com.android.settings", "com.android.vending");
    private static final acno s = new acno("token_handle");
    public static final acno a = new acno("intentionally_canceled");
    public static final Parcelable.Creator CREATOR = new afea();

    public AddAccountController(afed afedVar, boolean z, Intent intent, Account account, boolean z2, Intent intent2, String str, boolean z3, boolean z4, boolean z5, boolean z6, String str2, boolean z7, afez afezVar) {
        this.b = afedVar;
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
        this.m = afezVar;
    }

    public static boolean c(boolean z) {
        if (!z) {
            return false;
        }
        dxyi dxyiVar = xbw.a;
        return fmyq.a.lK().g();
    }

    public static boolean d(boolean z) {
        if (!z) {
            return false;
        }
        dxyi dxyiVar = xbw.a;
        return fmyq.a.lK().f();
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
        afjo afjoVar = afjo.c;
        afed afedVar = this.b;
        Context context = afedVar.a;
        boolean z = afedVar.j;
        boolean z2 = afedVar.g;
        return afjoVar.a(context, new afjk(z, z2, ErrorChimeraActivity.j(z2), context.getString(R.string.common_something_went_wrong), str, afedVar.k));
    }

    private final Intent g() {
        boolean z = this.d;
        int i = afdz.a;
        afed afedVar = this.b;
        D2dOptions d2dOptions = afedVar.x;
        String.valueOf(d2dOptions);
        if (!auub.a() || afedVar.l) {
            return null;
        }
        boolean z2 = d2dOptions != null && d2dOptions.b;
        boolean z3 = afedVar.g;
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
        Context context = afedVar.a;
        atmt atmtVar = afedVar.k;
        boolean z7 = afedVar.j;
        String str = atmtVar.a;
        auad auadVar = SmartDeviceChimeraActivity.l;
        if (atnq.a(context) == null) {
            SmartDeviceChimeraActivity.l.m("Skipping TargetActivity. Reason: Bluetooth not available.", new Object[0]);
            return null;
        }
        if (!auqx.t(context)) {
            SmartDeviceChimeraActivity.l.m("Skipping TargetActivity. Reason: Not main user.", new Object[0]);
            return null;
        }
        if (dgyu.a(context)) {
            SmartDeviceChimeraActivity.l.m("Skipping TargetActivity. Reason: Cannot copy restricted profile", new Object[0]);
            return null;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.setup.d2d.SmartDeviceActivity");
        acnp acnpVar = new acnp();
        acnpVar.d(SmartDeviceChimeraActivity.h, str);
        acnpVar.d(SmartDeviceChimeraActivity.i, Boolean.valueOf(z7));
        acnpVar.d(SmartDeviceChimeraActivity.m, true != z3 ? "auth" : "suw");
        acnpVar.d(SmartDeviceChimeraActivity.n, atzs.n(d2dOptions));
        return className.putExtras(acnpVar.a);
    }

    private final afll h() {
        afed afedVar = this.b;
        boolean z = afedVar.v;
        if (fmul.g() && !z && atmp.f(this.h)) {
            z = true;
        }
        afec afecVar = new afec(afedVar);
        afecVar.k(z);
        Intent b = afdz.b(afecVar.a(), this.f, this.g, this.j);
        return b != null ? new afll(41, b, 0, null, android.R.anim.fade_in, android.R.anim.fade_out) : k();
    }

    private final afll i() {
        if (atmp.f(this.h)) {
            return o(0);
        }
        afed afedVar = this.b;
        if (fndj.c() && auub.e() && !atmp.f(this.h) && this.i) {
            Context context = afedVar.a;
            DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService("device_policy");
            if (devicePolicyManager == null || devicePolicyManager.getDeviceOwner() == null) {
                UserManager userManager = (UserManager) context.getSystemService("user");
                if (userManager != null && auub.a()) {
                    Iterator<UserHandle> it = userManager.getUserProfiles().iterator();
                    while (it.hasNext()) {
                        if (userManager.isManagedProfile(it.next().getIdentifier())) {
                            break;
                        }
                    }
                }
                if (auqx.t(context)) {
                    Intent b = WrapperControlledChimeraActivity.b(context, afedVar.j, afedVar.k, new Intent("com.google.android.gms.auth.managed.UNMANAGED_WORK_PROFILE_OPT_IN").setClassName(context, "com.google.android.gms.auth.manged.ui.GenericActivity"));
                    int i = afdz.a;
                    return new afll(120, b, 0, null, 0, 0);
                }
            }
        }
        return v(4);
    }

    private final afll j() {
        if (this.t == null || !w()) {
            return p();
        }
        afed afedVar = this.b;
        return new afll(50, WrapperControlledChimeraActivity.b(afedVar.a, afedVar.j, afedVar.k, this.t), 0, null, afdz.a, afdz.b);
    }

    private final afll k() {
        Intent intent;
        String str = this.h;
        boolean z = this.l;
        Account account = this.f;
        boolean z2 = this.g;
        dxyi dxyiVar = xbw.a;
        boolean B = fnbo.a.lK().B();
        afed afedVar = this.b;
        boolean z3 = afedVar.g;
        boolean z4 = (!B || z3 || z || atmp.f(str)) ? false : true;
        Log.i("Auth", String.format(Locale.US, "[AddAccount, AppPickerHelper] Showing app picker = %b", Boolean.valueOf(z4)));
        if (z4) {
            Context context = afedVar.a;
            boolean z5 = afedVar.j;
            atmt atmtVar = afedVar.k;
            Intent intent2 = new Intent();
            intent2.setAction("com.google.android.apps.restore.APP_PICKER_ADD_ACCOUNT");
            intent = afex.a(context, intent2);
            if (intent != null) {
                Intent putExtra = intent.putExtra("account", account);
                acnp acnpVar = new acnp();
                acnpVar.d(afel.a, account);
                acnpVar.d(afel.b, Boolean.valueOf(z2));
                acnpVar.d(afel.c, Boolean.valueOf(z3));
                acnpVar.d(afji.b, Boolean.valueOf(z5));
                acnpVar.d(afji.a, atmtVar == null ? null : atmtVar.a());
                putExtra.putExtras(acnpVar.a);
            } else {
                Log.i("Auth", String.format(Locale.US, "[AddAccount, AppPickerHelper] App picker activity couldn't be resolved.", new Object[0]));
            }
        } else {
            intent = null;
        }
        Intent b = intent != null ? WrapperControlledChimeraActivity.b(afedVar.a, afedVar.j, afedVar.k, intent) : null;
        return b != null ? new afll(42, b, 0, null, android.R.anim.fade_in, android.R.anim.fade_out) : i();
    }

    private final afll l(dvte dvteVar) {
        atzb.c(dvteVar instanceof dvsz, a.H(dvteVar, "unhandled argument type=", " to finishCancel"));
        Bundle bundle = dvteVar.d;
        boolean z = bundle.getBoolean("intentionally_canceled", false);
        this.c = z;
        if (!z) {
            ((eluo) q.j()).x("Unintentional cancel from AddAccountController");
        }
        Intent putExtras = new Intent().putExtras(bundle);
        afed afedVar = this.b;
        int i = afdz.a;
        AccountAuthenticatorResponse accountAuthenticatorResponse = afedVar.d;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(4, "Canceled");
        }
        return new afll(0, null, 0, putExtras, afdz.c, afdz.d);
    }

    private final afll m() {
        if (this.d) {
            afed afedVar = this.b;
            dvsy dvsyVar = dvsy.a;
            return afdz.d(afedVar, dvsyVar.c, new Intent().putExtras(dvsyVar.d));
        }
        Intent intent = this.e;
        if (intent == null) {
            return afdz.d(this.b, dvtb.a.c, null);
        }
        int intExtra = intent.getIntExtra("tap_and_go_result_code", -1);
        this.e.removeExtra("tap_and_go_result_code");
        return afdz.d(this.b, intExtra, this.e);
    }

    private final afll n() {
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
        if (!x()) {
            Bundle bundle = new dvtd(this.f.name, this.f.type, this.g, null, null).d;
            String str = this.p;
            if (str != null) {
                bundle.putString("accountStatusToken", str);
            }
            intent = new Intent().putExtras(bundle);
        }
        Intent intent3 = intent;
        afed afedVar = this.b;
        int i3 = afdz.a;
        AccountAuthenticatorResponse accountAuthenticatorResponse = afedVar.d;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onResult(intent3 != null ? intent3.getExtras() : null);
        }
        return new afll(0, null, i2, intent3, afdz.a, afdz.b);
    }

    private final afll o(int i) {
        ManagedAuthOptions managedAuthOptions;
        Account account = this.f;
        afed afedVar = this.b;
        atmt atmtVar = afedVar.k;
        Bundle a2 = atmtVar == null ? Bundle.EMPTY : atmtVar.a();
        boolean z = afedVar.u;
        String str = afedVar.f;
        boolean z2 = afedVar.r;
        String str2 = this.h;
        boolean z3 = this.l;
        Bundle a3 = (!fnbf.c() || (managedAuthOptions = afedVar.w) == null) ? Bundle.EMPTY : managedAuthOptions.a();
        boolean z4 = afedVar.j;
        boolean z5 = afedVar.g;
        Context context = afedVar.a;
        Intent d = atmp.d(context, account, z5, z4, a2, z, str, z2, str2, z3, 0, a3, false, i);
        if (d == null) {
            return v(4);
        }
        if (fmua.a.lK().H()) {
            return new afll(60, WrapperControlledChimeraActivity.b(context, z4, atmtVar, d), 0, null, afdz.a, afdz.b);
        }
        Intent b = WrapperControlledChimeraActivity.b(context, z4, atmtVar, d);
        int i2 = afdz.a;
        return new afll(60, b, 0, null, 0, 0);
    }

    private final afll p() {
        afed afedVar = this.b;
        if (!afedVar.g) {
            return n();
        }
        afem afemVar = afedVar.c;
        Intent intent = new Intent(true != auub.c() ? "android.intent.action.ACTION_CARRIER_SETUP" : "android.intent.action.CARRIER_SETUP");
        intent.putExtra("device_setup", true);
        List carrierPackageNamesForIntent = afemVar.a.getCarrierPackageNamesForIntent(intent);
        if (carrierPackageNamesForIntent == null || carrierPackageNamesForIntent.isEmpty()) {
            intent = null;
        } else {
            if (carrierPackageNamesForIntent.size() != 1) {
                Log.w("Auth", String.format(Locale.US, "[CarrierSetupHelper] Multiple matching carrier apps found, launching the first.", new Object[0]));
            }
            intent.setPackage((String) carrierPackageNamesForIntent.get(0));
            intent.putExtra("disable_back", true);
            intent.putExtra("has_account", afemVar.b.p("com.google").length > 0);
            intent.putExtra("from_add_account_controller", true);
        }
        Intent b = intent != null ? WrapperControlledChimeraActivity.b(afedVar.a, afedVar.j, afedVar.k, intent) : null;
        return b != null ? new afll(90, b, 0, null, -1, -1) : n();
    }

    private final afll q(AccountDetail accountDetail) {
        this.f = new Account(accountDetail.a, accountDetail.b);
        this.g = accountDetail.c;
        boolean z = accountDetail.e;
        this.l = z;
        this.p = accountDetail.g;
        Intent intent = accountDetail.f;
        this.t = intent;
        if (intent != null) {
            afed afedVar = this.b;
            intent.putExtra("theme", afedVar.k.a);
            this.t.putExtra("useImmersiveMode", afedVar.j);
        }
        this.h = accountDetail.d;
        if (fndj.c()) {
            this.i = accountDetail.i;
        }
        this.l = z;
        if (atmp.f(this.h)) {
            this.k = d(this.l);
            this.j = c(this.l);
            afed afedVar2 = this.b;
            e(afedVar2.a, this.f);
        }
        return h();
    }

    private final afll r() {
        return new afll(30, afdz.a(this.b, this.m, this.d, w()), 0, null, android.R.anim.fade_in, android.R.anim.fade_out);
    }

    private final afll s() {
        int i = afdz.a;
        int i2 = affy.b;
        afed afedVar = this.b;
        Context context = afedVar.a;
        Intent intent = new Intent();
        intent.setAction("com.google.android.gms.auth.addaccount.PRE_ADD_ACCOUNT");
        Intent a2 = afex.a(context, intent);
        boolean z = afedVar.j;
        atmt atmtVar = afedVar.k;
        boolean z2 = afedVar.g;
        if (a2 != null) {
            Intent putExtra = a2.putExtra("is_setup_wizard", z2).putExtra("use_immersive_mode", z).putExtra("is_resolve_frp_only", afedVar.t);
            Bundle a3 = atmtVar == null ? null : atmtVar.a();
            D2dOptions d2dOptions = afedVar.x;
            putExtra.putExtra("ui_parameters", a3);
            if (d2dOptions != null) {
                a2.putExtra("d2d_options", atzs.n(d2dOptions));
            }
        }
        Intent b = a2 != null ? WrapperControlledChimeraActivity.b(context, z, atmtVar, a2) : null;
        return b != null ? new afll(10, b, 0, null, -1, -1) : new afll(39, afjo.c.a(context, new afjk(z, z2, ErrorChimeraActivity.j(z2), context.getString(R.string.common_something_went_wrong), context.getString(R.string.auth_error_generic_server_error), atmtVar)), 0, null, -1, -1);
    }

    private final afll t() {
        Intent g = g();
        if (this.o) {
            afed afedVar = this.b;
            int i = KeyAttestationWarningChimeraActivity.h;
            return new afll(15, afjq.c.a(afedVar.a, fxrq.a), 0, null, afdz.a, afdz.b);
        }
        if (this.n) {
            afed afedVar2 = this.b;
            return new afll(14, afke.c.a(afedVar2.a, new afka(afedVar2.i)), 0, null, afdz.a, afdz.b);
        }
        if (g == null) {
            return r();
        }
        if (fmtw.d()) {
            afed afedVar3 = this.b;
            int i2 = efwn.a;
            if (efrl.z(afedVar3.a)) {
                return new afll(20, g, 0, null, afdz.a, afdz.b);
            }
        }
        int i3 = afdz.a;
        return new afll(20, g, 0, null, android.R.anim.fade_in, android.R.anim.fade_out);
    }

    private final afll u(int i) {
        return new afll(70, afdz.c(this.b, this.f, this.l, i), 0, null, afdz.a, afdz.b);
    }

    private final afll v(int i) {
        return this.k ? u(i) : j();
    }

    private final boolean w() {
        afed afedVar = this.b;
        if (afedVar.g) {
            return true;
        }
        return r.contains(afedVar.f);
    }

    private final boolean x() {
        Intent intent = this.e;
        if (intent == null) {
            return false;
        }
        return (intent.getStringExtra("authAccount") == null || this.e.getStringExtra("accountType") == null) ? false : true;
    }

    private static afll y(int i) {
        return new afll(0, null, i, null, afdz.a, afdz.b);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x07ad  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01eb  */
    @Override // com.google.android.gms.auth.uiflows.controller.Controller
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.afll a(defpackage.aflp r27) {
        /*
            Method dump skipped, instructions count: 2206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.uiflows.addaccount.AddAccountController.a(aflp):afll");
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
        afed afedVar = this.b;
        parcel.writeParcelable(afedVar.d, 0);
        parcel.writeString(afedVar.e);
        parcel.writeByte(afedVar.g ? (byte) 1 : (byte) 0);
        parcel.writeByte(afedVar.h ? (byte) 1 : (byte) 0);
        parcel.writeByte(afedVar.i ? (byte) 1 : (byte) 0);
        parcel.writeByte(afedVar.j ? (byte) 1 : (byte) 0);
        atmt atmtVar = afedVar.k;
        Bundle bundle = null;
        parcel.writeParcelable(atmtVar == null ? null : atmtVar.a(), 0);
        parcel.writeByte(afedVar.l ? (byte) 1 : (byte) 0);
        parcel.writeString(afedVar.n);
        parcel.writeString(afedVar.o);
        parcel.writeString(afedVar.p);
        parcel.writeStringArray((String[]) afedVar.q.toArray(new String[0]));
        parcel.writeString(afedVar.f);
        parcel.writeString(afedVar.s);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.e, 0);
        parcel.writeParcelable(this.f, 0);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.t, 0);
        parcel.writeString(this.h);
        if (fndj.c()) {
            parcel.writeByte(this.i ? (byte) 1 : (byte) 0);
        }
        parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.k ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.l ? (byte) 1 : (byte) 0);
        parcel.writeString(this.p);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(afedVar.t ? (byte) 1 : (byte) 0);
        parcel.writeByte(afedVar.m ? (byte) 1 : (byte) 0);
        parcel.writeByte(afedVar.u ? (byte) 1 : (byte) 0);
        parcel.writeByte(afedVar.v ? (byte) 1 : (byte) 0);
        ManagedAuthOptions managedAuthOptions = afedVar.w;
        parcel.writeByteArray(managedAuthOptions == null ? null : atzs.n(managedAuthOptions));
        D2dOptions d2dOptions = afedVar.x;
        parcel.writeByteArray(d2dOptions == null ? null : atzs.n(d2dOptions));
        afez afezVar = this.m;
        if (afezVar != null) {
            bundle = new Bundle();
            bundle.putInt("desired_flow", afezVar.a);
        }
        parcel.writeParcelable(bundle, 0);
        parcel.writeString(afedVar.y);
        parcel.writeInt(afedVar.z);
        parcel.writeByte(afedVar.A ? (byte) 1 : (byte) 0);
        parcel.writeByte(afedVar.B ? (byte) 1 : (byte) 0);
    }
}
