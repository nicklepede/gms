package com.google.android.gms.backup.settings.devicedata;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.preference.Preference;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.gms.R;
import com.google.android.gms.backup.settings.devicedata.BackupSettingsDeviceDataFragment;
import com.google.android.gms.backup.settings.devicedata.intropreference.IntroPreference;
import com.google.android.gms.backup.settings.devicedata.mainswitchpreference2.MainSwitchPreference2;
import com.google.android.gms.backup.settings.devicedata.profilepreference.ProfilePreference;
import com.google.android.gms.backup.settings.devicedata.storagemeter.StorageMeterPreference;
import defpackage.aby;
import defpackage.aca;
import defpackage.acq;
import defpackage.ajtf;
import defpackage.ajwq;
import defpackage.ajws;
import defpackage.alih;
import defpackage.alog;
import defpackage.aloh;
import defpackage.aloi;
import defpackage.aloj;
import defpackage.alok;
import defpackage.alol;
import defpackage.alou;
import defpackage.alow;
import defpackage.aloz;
import defpackage.alqt;
import defpackage.alrl;
import defpackage.fxqu;
import defpackage.fxqv;
import defpackage.fxqw;
import defpackage.fxwd;
import defpackage.fxxg;
import defpackage.fxxm;
import defpackage.fxya;
import defpackage.jxm;
import defpackage.mdz;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class BackupSettingsDeviceDataFragment extends aloz {
    public ajtf ag;
    public alih ah;
    public final aca ai;
    private final fxqu aj;
    private final fxqu ak;
    private final fxqu al;
    private final fxqu am;
    private final fxqu an;
    private final fxqu ao;
    public alow d;

    public BackupSettingsDeviceDataFragment() {
        fxqu a = fxqv.a(fxqw.c, new aloi(new aloh(this)));
        int i = fxya.a;
        this.aj = new jxm(new fxxg(alou.class), new aloj(a), new alol(this, a), new alok(a));
        this.ai = registerForActivityResult(new acq(), new aby() { // from class: alnv
            @Override // defpackage.aby
            public final void jF(Object obj) {
                ActivityResult activityResult = (ActivityResult) obj;
                fxxm.f(activityResult, "result");
                Intent intent = activityResult.b;
                Account account = intent != null ? (Account) ing.a(intent, "account", Account.class) : null;
                alou L = BackupSettingsDeviceDataFragment.this.L();
                fycr.b(L.d, null, null, new aloo(account, L, null), 3);
            }
        });
        this.ak = alrl.a(this, R.string.backup_settings_device_data_preference_key_intro);
        this.al = alrl.a(this, R.string.backup_settings_device_data_preference_key_toggle_main);
        this.am = alrl.a(this, R.string.backup_settings_device_data_preference_key_profile);
        this.an = alrl.a(this, R.string.backup_settings_device_data_preference_key_storage_meter);
        this.ao = alrl.a(this, R.string.backup_settings_device_data_preference_key_toggle_metered_network);
    }

    private final IntroPreference T() {
        return (IntroPreference) this.ak.a();
    }

    @Override // defpackage.mem
    public final void C(Bundle bundle, String str) {
        A(R.xml.backup_settings_device_data_fragment);
        T().n(getString(R.string.backup_settings_devicedata_description));
        IntroPreference T = T();
        String string = getString(R.string.backup_settings_devicedata_data_protection_link_title);
        fxxm.e(string, "getString(...)");
        fxxm.f(string, "text");
        if (!TextUtils.equals(T.d, string)) {
            T.d = string;
            T.d();
        }
        IntroPreference T2 = T();
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: alnq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ew childFragmentManager = BackupSettingsDeviceDataFragment.this.getChildFragmentManager();
                fxxm.e(childFragmentManager, "getChildFragmentManager(...)");
                fxxm.f(childFragmentManager, "fragmentManager");
                new aloy().showNow(childFragmentManager, "how_data_is_protected_dialog");
            }
        };
        if (!fxxm.n(T2.c, onClickListener)) {
            T2.c = onClickListener;
            T2.d();
        }
        T().I(R.drawable.gs_devices_vd_theme_48);
        IntroPreference T3 = T();
        T3.a = false;
        T3.b = 10;
        T3.d();
        M().n("Summary not yet implemented");
        ProfilePreference N = N();
        alih alihVar = this.ah;
        if (alihVar == null) {
            fxxm.j("accountParticleDiscInitializer");
            alihVar = null;
        }
        fxxm.f(alihVar, "accountParticleDiscInitializer");
        N.b = alihVar;
        ajtf K = K();
        K.b.put("turn_off_backup_dialog", new fxwd() { // from class: alnr
            @Override // defpackage.fxwd
            public final Object a() {
                alou L = BackupSettingsDeviceDataFragment.this.L();
                fycr.b(L.d, null, null, new alos(L, null), 3);
                return fxrq.a;
            }
        });
        ajtf K2 = K();
        K2.c.put("turn_off_backup_dialog", new fxwd() { // from class: alns
            @Override // defpackage.fxwd
            public final Object a() {
                BackupSettingsDeviceDataFragment backupSettingsDeviceDataFragment = BackupSettingsDeviceDataFragment.this;
                backupSettingsDeviceDataFragment.Q((ajws) backupSettingsDeviceDataFragment.L().e.b());
                return fxrq.a;
            }
        });
        ajtf K3 = K();
        K3.d.put("turn_off_backup_dialog", new fxwd() { // from class: alnt
            @Override // defpackage.fxwd
            public final Object a() {
                BackupSettingsDeviceDataFragment backupSettingsDeviceDataFragment = BackupSettingsDeviceDataFragment.this;
                backupSettingsDeviceDataFragment.Q((ajws) backupSettingsDeviceDataFragment.L().e.b());
                return fxrq.a;
            }
        });
        J().n = new mdz() { // from class: alnu
            @Override // defpackage.mdz
            public final boolean a(Preference preference, Object obj) {
                alou L = BackupSettingsDeviceDataFragment.this.L();
                fxxm.d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                fycr.b(L.d, null, null, new alop(((Boolean) obj).booleanValue(), L, null), 3);
                return true;
            }
        };
        P(false);
    }

    public final SwitchPreferenceCompat J() {
        return (SwitchPreferenceCompat) this.ao.a();
    }

    public final ajtf K() {
        ajtf ajtfVar = this.ag;
        if (ajtfVar != null) {
            return ajtfVar;
        }
        fxxm.j("backupAlertDialogs");
        return null;
    }

    public final alou L() {
        return (alou) this.aj.a();
    }

    public final MainSwitchPreference2 M() {
        return (MainSwitchPreference2) this.al.a();
    }

    public final ProfilePreference N() {
        return (ProfilePreference) this.am.a();
    }

    public final StorageMeterPreference O() {
        return (StorageMeterPreference) this.an.a();
    }

    public final void P(boolean z) {
        J().T(z);
        O().T(z);
    }

    public final void Q(ajws ajwsVar) {
        M().n = null;
        if (ajwsVar instanceof ajwq) {
            if (((alqt) ((ajwq) ajwsVar).a).a) {
                M().k(true);
                M().n = new mdz() { // from class: alnw
                    @Override // defpackage.mdz
                    public final boolean a(Preference preference, Object obj) {
                        ew childFragmentManager = BackupSettingsDeviceDataFragment.this.getChildFragmentManager();
                        fxxm.e(childFragmentManager, "getChildFragmentManager(...)");
                        fxxm.f(childFragmentManager, "fragmentManager");
                        new alpc().showNow(childFragmentManager, "turn_off_backup_dialog");
                        return true;
                    }
                };
            } else {
                M().k(false);
                M().n = new mdz() { // from class: alnx
                    @Override // defpackage.mdz
                    public final boolean a(Preference preference, Object obj) {
                        alou L = BackupSettingsDeviceDataFragment.this.L();
                        alig aligVar = (alig) ((ajws) L.g.b()).b();
                        if (aligVar instanceof alif) {
                            fycr.b(L.d, null, null, new alot(L, aligVar, null), 3);
                            return true;
                        }
                        ((eluo) alou.a.i()).x("Tried to enable device data backup without an account.");
                        return true;
                    }
                };
            }
        }
    }

    @Override // defpackage.ozo, defpackage.mem, defpackage.dg
    public final void onViewCreated(View view, Bundle bundle) {
        fxxm.f(view, "view");
        super.onViewCreated(view, bundle);
        alrl.b(this, new alog(this, null));
    }
}
