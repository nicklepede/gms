package com.google.android.gms.auth.proximity.multidevice;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.R;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import defpackage.aeex;
import defpackage.aeey;
import defpackage.aeez;
import defpackage.aend;
import defpackage.aenr;
import defpackage.aeqe;
import defpackage.aeql;
import defpackage.aesm;
import defpackage.apzg;
import defpackage.auad;
import defpackage.aued;
import defpackage.aura;
import defpackage.ausn;
import defpackage.auub;
import defpackage.dhpk;
import defpackage.elkk;
import defpackage.euzc;
import defpackage.fntp;
import defpackage.fnts;
import defpackage.fnum;
import defpackage.ilr;
import defpackage.ilt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class BetterTogetherUnifiedSetupIntentOperation extends IntentOperation {
    public static final /* synthetic */ int a = 0;
    private static final auad b = new auad("ProximityAuth", "BetterTogetherSetup");
    private final aeqe c = new aeqe();

    public BetterTogetherUnifiedSetupIntentOperation() {
    }

    public static Intent a(Context context) {
        return IntentOperation.getStartIntent(context, BetterTogetherUnifiedSetupIntentOperation.class, "com.google.android.gms.auth.proximity.multidevice.UPDATE_UNIFIED_SETUP");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        ?? r4;
        int i;
        int i2;
        boolean contains;
        boolean contains2;
        boolean contains3;
        int i3 = 0;
        if (intent == null) {
            b.m("Better Together setup was started with a null intent.", new Object[0]);
            return;
        }
        if (fnum.a.lK().k() && !aeez.d(this, false)) {
            ausn ausnVar = SettingsChimeraActivity.j;
            aura.K("com.google.android.gms.auth.proximity.multidevice.SettingsActivity", false);
            aura.K("com.google.android.gms.auth.proximity.multidevice.SettingsContentProvider", false);
            ausn ausnVar2 = SettingsMaterialNextChimeraActivity.j;
            aura.K("com.google.android.gms.auth.proximity.multidevice.SettingsMaterialNextActivity", false);
            return;
        }
        if ("com.google.android.gms.auth.proximity.multidevice.UPDATE_UNIFIED_SETUP".equals(intent.getAction())) {
            ausn ausnVar3 = SettingsChimeraActivity.j;
            aura.H(this, "com.google.android.gms.auth.proximity.multidevice.SettingsActivity", true);
            aura.H(this, "com.google.android.gms.auth.proximity.multidevice.SettingsContentProvider", true);
            ausn ausnVar4 = SettingsMaterialNextChimeraActivity.j;
            aura.H(this, "com.google.android.gms.auth.proximity.multidevice.SettingsMaterialNextActivity", false);
            return;
        }
        if ("com.google.android.gms.auth.proximity.multidevice.UNIFIED_SETUP_REQUESTED".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("EXTRA_ACCOUNT_NAME_FOR_SETUP");
            int i4 = 2;
            if (stringExtra == null || stringExtra.isEmpty()) {
                b.m("No accounts for Better Together setup", new Object[0]);
                this.c.g(2);
                return;
            }
            SyncedCryptauthDevice b2 = aend.b(this, stringExtra);
            aeey a2 = aeex.a(this);
            char c = 3;
            if (b2 == null) {
                this.c.g(3);
                return;
            }
            Account account = new Account(stringExtra, "com.google");
            boolean d = a2.d(account, euzc.BETTER_TOGETHER_HOST);
            HashSet<String> hashSet = new HashSet(b2.m);
            b.h("Trying to ".concat(true != d ? "disable" : "enable"), new Object[0]);
            if (!d) {
                ArrayList arrayList = new ArrayList();
                int i5 = 0;
                int i6 = 0;
                for (String str : hashSet) {
                    if (new HashSet(Arrays.asList(TextUtils.split(fnum.a.lK().c(), ","))).contains(str)) {
                        b.h("Not disabling enabled feature %s since it is blocklisted for disabling", str);
                    } else {
                        auad auadVar = b;
                        auadVar.h("Attempting to disable enabled feature %s", str);
                        i5++;
                        if (fnts.f()) {
                            arrayList.add(str);
                        } else if (aenr.b(elkk.d(str), stringExtra, this)) {
                            i6++;
                        } else {
                            auadVar.m("Failed to disable feature: ".concat(String.valueOf(str)), new Object[0]);
                        }
                    }
                }
                if (fnts.f() && !arrayList.isEmpty()) {
                    if (aenr.b(arrayList, stringExtra, this)) {
                        i6 = arrayList.size();
                    } else {
                        b.m("Failed to disable features: ".concat(arrayList.toString()), new Object[0]);
                    }
                }
                if (i5 == 0) {
                    this.c.e(1);
                } else if (i6 == 0) {
                    this.c.e(2);
                } else if (i5 > i6) {
                    this.c.e(3);
                } else {
                    this.c.e(0);
                }
                aeql.b(this, false);
                return;
            }
            HashSet hashSet2 = new HashSet();
            if (fntp.h()) {
                try {
                    hashSet2 = new HashSet(new aeez(this).a(account));
                } catch (IOException e) {
                    b.n("Couldn't retrieve supported features", e, new Object[0]);
                }
            } else {
                hashSet2 = new HashSet(new aeez(this).b(account, new ArrayList()));
            }
            List<String> list = b2.l;
            ArrayList arrayList2 = new ArrayList();
            int i7 = 0;
            int i8 = 0;
            for (String str2 : list) {
                char c2 = c;
                try {
                    contains = hashSet2.contains(euzc.b(str2));
                    contains2 = hashSet.contains(str2);
                    i2 = i4;
                    contains3 = new HashSet(Arrays.asList(TextUtils.split(fnum.a.lK().d(), ","))).contains(str2);
                } catch (IllegalArgumentException unused) {
                    i = i3;
                    i2 = i4;
                    auad auadVar2 = b;
                    Object[] objArr = new Object[1];
                    objArr[i] = str2;
                    auadVar2.m("Invalid supported feature: %s", objArr);
                }
                if (!contains || contains2 || contains3) {
                    auad auadVar3 = b;
                    Boolean valueOf = Boolean.valueOf(contains);
                    Boolean valueOf2 = Boolean.valueOf(contains2);
                    Boolean valueOf3 = Boolean.valueOf(contains3);
                    i = i3;
                    Object[] objArr2 = new Object[4];
                    objArr2[i] = str2;
                    objArr2[1] = valueOf;
                    objArr2[i2] = valueOf2;
                    objArr2[c2] = valueOf3;
                    auadVar3.h("Not enabling feature %s. isLocallySupported: %s isFeatureAlreadyEnabled: %s isFeatureSupportBlocklisted: %s", objArr2);
                    c = c2;
                    i4 = i2;
                    i3 = i;
                } else {
                    auad auadVar4 = b;
                    Object[] objArr3 = new Object[1];
                    objArr3[i3] = str2;
                    auadVar4.h("Enabling disabled feature %s", objArr3);
                    i7++;
                    if (fnts.f()) {
                        arrayList2.add(str2);
                    } else if (aenr.c(elkk.d(str2), account.name, this)) {
                        i8++;
                    } else {
                        auadVar4.m("Failed to enable feature: ".concat(String.valueOf(str2)), new Object[i3]);
                    }
                    c = c2;
                    i4 = i2;
                }
            }
            int i9 = i3;
            int i10 = i4;
            if (fnts.f() && !arrayList2.isEmpty()) {
                if (aenr.c(arrayList2, account.name, this)) {
                    i8 = arrayList2.size();
                } else {
                    b.m("Failed to enable features: ".concat(arrayList2.toString()), new Object[i9]);
                }
            }
            if (i7 == 0) {
                this.c.g(1);
            } else {
                if (i8 == 0) {
                    this.c.g(4);
                    return;
                }
                if (i7 <= i8) {
                    r4 = 0;
                    this.c.g(0);
                    if (i8 > 0 || getSharedPreferences("com.google.android.gms.auth.proximity.UNIFIED_SETUP", r4).getBoolean("SETUP_COMPLETE_NOTIFICATION", r4)) {
                    }
                    aued f = aued.f(this);
                    Resources resources = getResources();
                    aeql.a(f, resources);
                    Object[] objArr4 = new Object[i10];
                    objArr4[r4] = SettingsChimeraContentProvider.a(this, stringExtra);
                    objArr4[1] = "";
                    String string = resources.getString(R.string.settings_subhead_enabled, objArr4);
                    ilt iltVar = new ilt(this, "better-together-notification-channel-id");
                    iltVar.n(apzg.a(this, 2131233359));
                    iltVar.A = resources.getColor(R.color.quantum_googblue);
                    iltVar.l = 0;
                    iltVar.r(resources.getString(R.string.settings_summary_enabled));
                    iltVar.j(string);
                    ilr ilrVar = new ilr();
                    ilrVar.d(string);
                    iltVar.o(ilrVar);
                    iltVar.g = PendingIntent.getActivity(this, 0, aesm.a(this).putExtra("FROM_BETTER_TOGETHER_NOTIFICATION", true), 134217728);
                    iltVar.i(true);
                    if (auub.a()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("android.substName", resources.getString(R.string.notification_substitute_app_name));
                        iltVar.g(bundle);
                    }
                    if (fnum.e()) {
                        f.w("better-together-setup-complete-tag", 1, dhpk.CHROMEBOOK_CROSS_DEVICE_ONBOARDING, iltVar.b());
                    } else {
                        f.v("better-together-setup-complete-tag", 1, iltVar.b());
                    }
                    aeql.b(this, true);
                    return;
                }
                this.c.g(5);
            }
            r4 = 0;
            if (i8 > 0) {
            }
        }
    }

    public BetterTogetherUnifiedSetupIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
