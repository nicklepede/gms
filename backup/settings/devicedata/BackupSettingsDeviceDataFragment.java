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
import defpackage.abt;
import defpackage.abv;
import defpackage.acl;
import defpackage.ahsp;
import defpackage.ahwa;
import defpackage.ahwc;
import defpackage.ajhp;
import defpackage.ajnn;
import defpackage.ajno;
import defpackage.ajnp;
import defpackage.ajnq;
import defpackage.ajnr;
import defpackage.ajns;
import defpackage.ajob;
import defpackage.ajod;
import defpackage.ajog;
import defpackage.ajqa;
import defpackage.ajqs;
import defpackage.fuuw;
import defpackage.fuux;
import defpackage.fuuy;
import defpackage.fvaf;
import defpackage.fvbi;
import defpackage.fvbo;
import defpackage.fvcc;
import defpackage.jqx;
import defpackage.klo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class BackupSettingsDeviceDataFragment extends ajog {
    public ahsp ag;
    public ajhp ah;
    public final abv ai;
    private final fuuw aj;
    private final fuuw ak;
    private final fuuw al;
    private final fuuw am;
    private final fuuw an;
    private final fuuw ao;
    public ajod d;

    public BackupSettingsDeviceDataFragment() {
        fuuw a = fuux.a(fuuy.c, new ajnp(new ajno(this)));
        int i = fvcc.a;
        this.aj = new jqx(new fvbi(ajob.class), new ajnq(a), new ajns(this, a), new ajnr(a));
        this.ai = registerForActivityResult(new acl(), new abt() { // from class: ajnc
            @Override // defpackage.abt
            public final void jq(Object obj) {
                ActivityResult activityResult = (ActivityResult) obj;
                fvbo.f(activityResult, "result");
                Intent intent = activityResult.b;
                Account account = intent != null ? (Account) ilq.a(intent, "account", Account.class) : null;
                ajob L = BackupSettingsDeviceDataFragment.this.L();
                fvgt.b(L.d, null, null, new ajnv(account, L, null), 3);
            }
        });
        this.ak = ajqs.a(this, R.string.backup_settings_device_data_preference_key_intro);
        this.al = ajqs.a(this, R.string.backup_settings_device_data_preference_key_toggle_main);
        this.am = ajqs.a(this, R.string.backup_settings_device_data_preference_key_profile);
        this.an = ajqs.a(this, R.string.backup_settings_device_data_preference_key_storage_meter);
        this.ao = ajqs.a(this, R.string.backup_settings_device_data_preference_key_toggle_metered_network);
    }

    private final IntroPreference T() {
        return (IntroPreference) this.ak.a();
    }

    @Override // defpackage.kmb
    public final void C(Bundle bundle, String str) {
        A(R.xml.backup_settings_device_data_fragment);
        T().n(getString(R.string.backup_settings_devicedata_description));
        IntroPreference T = T();
        String string = getString(R.string.backup_settings_devicedata_data_protection_link_title);
        fvbo.e(string, "getString(...)");
        fvbo.f(string, "text");
        if (!TextUtils.equals(T.d, string)) {
            T.d = string;
            T.d();
        }
        IntroPreference T2 = T();
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: ajmy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ew childFragmentManager = BackupSettingsDeviceDataFragment.this.getChildFragmentManager();
                fvbo.e(childFragmentManager, "getChildFragmentManager(...)");
                fvbo.f(childFragmentManager, "fragmentManager");
                new ajof().showNow(childFragmentManager, "how_data_is_protected_dialog");
            }
        };
        if (!fvbo.n(T2.c, onClickListener)) {
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
        ajhp ajhpVar = this.ah;
        if (ajhpVar == null) {
            fvbo.j("accountParticleDiscInitializer");
            ajhpVar = null;
        }
        fvbo.f(ajhpVar, "accountParticleDiscInitializer");
        N.b = ajhpVar;
        ahsp K = K();
        K.b.put("turn_off_backup_dialog", new fvaf() { // from class: ajmz
            @Override // defpackage.fvaf
            public final Object a() {
                ajob L = BackupSettingsDeviceDataFragment.this.L();
                fvgt.b(L.d, null, null, new ajnz(L, null), 3);
                return fuvs.a;
            }
        });
        ahsp K2 = K();
        K2.c.put("turn_off_backup_dialog", new fvaf() { // from class: ajna
            @Override // defpackage.fvaf
            public final Object a() {
                BackupSettingsDeviceDataFragment backupSettingsDeviceDataFragment = BackupSettingsDeviceDataFragment.this;
                backupSettingsDeviceDataFragment.Q((ahwc) backupSettingsDeviceDataFragment.L().e.b());
                return fuvs.a;
            }
        });
        J().n = new klo() { // from class: ajnb
            @Override // defpackage.klo
            public final boolean a(Preference preference, Object obj) {
                fvbo.f(preference, "<unused var>");
                ajob L = BackupSettingsDeviceDataFragment.this.L();
                fvbo.d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                fvgt.b(L.d, null, null, new ajnw(((Boolean) obj).booleanValue(), L, null), 3);
                return true;
            }
        };
        P(false);
    }

    public final SwitchPreferenceCompat J() {
        return (SwitchPreferenceCompat) this.ao.a();
    }

    public final ahsp K() {
        ahsp ahspVar = this.ag;
        if (ahspVar != null) {
            return ahspVar;
        }
        fvbo.j("backupAlertDialogs");
        return null;
    }

    public final ajob L() {
        return (ajob) this.aj.a();
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

    public final void Q(ahwc ahwcVar) {
        M().n = null;
        if (ahwcVar instanceof ahwa) {
            if (((ajqa) ((ahwa) ahwcVar).a).a) {
                M().k(true);
                M().n = new klo() { // from class: ajnd
                    @Override // defpackage.klo
                    public final boolean a(Preference preference, Object obj) {
                        fvbo.f(preference, "<unused var>");
                        ew childFragmentManager = BackupSettingsDeviceDataFragment.this.getChildFragmentManager();
                        fvbo.e(childFragmentManager, "getChildFragmentManager(...)");
                        fvbo.f(childFragmentManager, "fragmentManager");
                        new ajoj().showNow(childFragmentManager, "turn_off_backup_dialog");
                        return true;
                    }
                };
            } else {
                M().k(false);
                M().n = new klo() { // from class: ajne
                    @Override // defpackage.klo
                    public final boolean a(Preference preference, Object obj) {
                        fvbo.f(preference, "<unused var>");
                        ajob L = BackupSettingsDeviceDataFragment.this.L();
                        ajho ajhoVar = (ajho) ((ahwc) L.g.b()).b();
                        if (ajhoVar instanceof ajhn) {
                            fvgt.b(L.d, null, null, new ajoa(L, ajhoVar, null), 3);
                            return true;
                        }
                        ((ejhf) ajob.a.i()).x("Tried to enable device data backup without an account.");
                        return true;
                    }
                };
            }
        }
    }

    @Override // defpackage.ngn, defpackage.kmb, defpackage.dg
    public final void onViewCreated(View view, Bundle bundle) {
        fvbo.f(view, "view");
        super.onViewCreated(view, bundle);
        ajqs.b(this, new ajnn(this, null));
    }
}
