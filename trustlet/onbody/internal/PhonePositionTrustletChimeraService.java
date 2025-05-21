package com.google.android.gms.trustlet.onbody.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.R;
import com.google.android.gms.chimera.modules.trustlet.onbody.AppContextProvider;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.trustagent.common.receiver.ScreenOnOffReceiver;
import com.google.android.gms.trustlet.onbody.internal.PhonePositionTrustletChimeraService;
import defpackage.asej;
import defpackage.aseu;
import defpackage.asot;
import defpackage.asqh;
import defpackage.dgls;
import defpackage.dgme;
import defpackage.dgnc;
import defpackage.dgne;
import defpackage.dgtf;
import defpackage.dgtv;
import defpackage.dgtw;
import defpackage.dgui;
import defpackage.ejhf;
import defpackage.ekhd;
import defpackage.ekhf;
import defpackage.ekhg;
import defpackage.fecj;
import defpackage.fspd;
import defpackage.iln;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PhonePositionTrustletChimeraService extends dgme implements dgtv, dgls {
    private static final asot d = asot.b("Trustlet_Onbody", asej.TRUSTLET_ONBODY);
    private final BroadcastReceiver e = new TracingBroadcastReceiver() { // from class: com.google.android.gms.trustlet.onbody.internal.PhonePositionTrustletChimeraService.1
        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, Intent intent) {
            if (Objects.equals(intent.getAction(), "com.google.android.gms.trustagent.TRUST_STATE_CHANGED") && intent.getExtras().keySet().contains("is_trustagent_on")) {
                dgtf.d().e();
            }
        }
    };
    private dgtw f;
    private ScreenOnOffReceiver g;
    private boolean h;
    private SharedPreferences i;
    private dgtf j;
    private SharedPreferences.OnSharedPreferenceChangeListener k;

    private final String v() {
        if (!dgui.f(this)) {
            return "On-body_detection_can_not_started_due_to_absence_of_hardware";
        }
        if (this.i.getBoolean("auth_trust_agent_pref_trustlet_enabled_com.google.android.gms.auth.trustagent.trustlet.PhonePositionTrustlet", false)) {
            return "is_supported";
        }
        dgtw dgtwVar = this.f;
        if (!dgtwVar.f) {
            return "On-body_detection_is_disabled_by_user";
        }
        dgtwVar.b();
        return "On-body_detection_is_disabled_by_user";
    }

    private final String w() {
        if (this.i == null) {
            this.i = dgnc.a(this);
        }
        if (this.i.getBoolean("auth_trust_agent_pref_trustlet_enabled_com.google.android.gms.auth.trustagent.trustlet.PhonePositionTrustlet", false)) {
            return getString(R.string.onbody_settings_page_summary_on);
        }
        try {
            return getString(R.string.extend_unlock_menu_summary_trustlet_off);
        } catch (Resources.NotFoundException e) {
            try {
                return getResources().getString(R.string.extend_unlock_menu_summary_trustlet_off);
            } catch (Resources.NotFoundException unused) {
                ((ejhf) ((ejhf) ((ejhf) d.i()).s(e)).ah((char) 11720)).x("[PhonePositionTrustletService] Couldn't find resource");
                return "";
            }
        }
    }

    private final void x() {
        if (this.k != null) {
            return;
        }
        this.k = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: dgtx
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                if (Objects.equals(str, "auth_trust_agent_pref_trustlet_enabled_com.google.android.gms.auth.trustagent.trustlet.PhonePositionTrustlet")) {
                    PhonePositionTrustletChimeraService.this.n();
                }
            }
        };
        dgnc.a(this).registerOnSharedPreferenceChangeListener(this.k);
    }

    private final void y() {
        iln.b(this, this.e, new IntentFilter("com.google.android.gms.trustagent.TRUST_STATE_CHANGED"), 2);
    }

    @Override // defpackage.dgme
    public final Bundle d() {
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.gms.trustagent.api.trustlet.key_trustlet_name", "PhonePosition");
        bundle.putBoolean("com.google.android.gms.trustagent.api.trustlet.key_is_user_initiated", false);
        bundle.putBoolean("com.google.android.gms.trustagent.api.trustlet.key_dismiss_keyguard", false);
        bundle.putBoolean("key_trustlet_is_suppored", q());
        bundle.putBoolean("key_trustlet_has_required_permissions", true);
        bundle.putBoolean("key_trustlet_is_enabled_by_device_policy", p());
        bundle.putString("key_trustlet_pref_key", "auth_trust_agent_pref_activity_recognition_unlock_key");
        bundle.putString("key_trustlet_pref_title", getString(R.string.auth_trust_agent_pref_activity_recognition_unlock_title));
        bundle.putString("key_trustlet_pref_summary", w());
        bundle.putInt("key_trustlet_icon_res_id", R.drawable.quantum_gm_ic_directions_walk_vd_theme_24);
        bundle.putString("key_trustlet_settings_activity_class_name", "com.google.android.gms.trustlet.onbody.ui.OnBodyDetectionSettings");
        bundle.putString("key_trustlet_settings_activity_package_name", "com.google.android.gms");
        return bundle;
    }

    @Override // defpackage.dgme
    public final ekhf e() {
        return ekhf.PHONE_POSITION_TRUSTLET;
    }

    @Override // defpackage.dgme
    public final String f() {
        return "PhonePosition";
    }

    @Override // defpackage.dgme
    protected final void g() {
        this.f.b();
        this.g.c();
        super.g();
    }

    @Override // defpackage.dgtv
    public final void h(boolean z) {
        jT(z, z);
        if (z || !r()) {
            return;
        }
        jR("Cannot register to activity recognition service.");
    }

    @Override // defpackage.dgme
    protected final void i() {
        super.i();
        ScreenOnOffReceiver screenOnOffReceiver = this.g;
        if (screenOnOffReceiver == null) {
            screenOnOffReceiver = new ScreenOnOffReceiver(this, this);
        }
        this.g = screenOnOffReceiver;
        screenOnOffReceiver.b();
        dgtw dgtwVar = this.f;
        if (dgtwVar == null) {
            dgtwVar = new dgtw(this, this);
        }
        this.f = dgtwVar;
        this.i = dgnc.a(this);
        if (v().equals("is_supported")) {
            this.f.a();
        } else {
            jT(false, false);
        }
    }

    @Override // defpackage.dgtv
    public final void j(String str) {
        this.f.b();
        if (r()) {
            jR(str);
        }
    }

    @Override // defpackage.dgls
    public final void jL() {
        String str;
        if (this.h) {
            this.h = false;
            dgtw dgtwVar = this.f;
            dgtwVar.g = SystemClock.elapsedRealtime();
            dgtwVar.b.set(-1L);
            if (!v().equals("is_supported")) {
                jT(false, false);
                return;
            }
            if (!r()) {
                try {
                    str = getResources().getString(R.string.onbody_trust_granted_message);
                } catch (Resources.NotFoundException unused) {
                    str = "";
                }
                jO(str, "user-present", aseu.TRUSTLET_ONBODY_TRUST_GRANTED);
            }
            this.f.a();
        }
    }

    @Override // defpackage.dgls
    public final void jM() {
        this.h = true;
    }

    @Override // defpackage.dgme
    public final void jQ() {
        super.jQ();
        this.j.e();
    }

    @Override // defpackage.dgls
    public final void jS() {
        dgtw dgtwVar = this.f;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!dgtwVar.f || elapsedRealtime <= dgtwVar.i + 30000 || elapsedRealtime <= dgtwVar.g + 30000) {
            return;
        }
        ((ejhf) ((ejhf) dgtw.a.i()).ah((char) 11702)).x("[PhonePositionTracker] Activity recognition timeout, disable trustlet.");
        dgtwVar.d.j("On-body_detection_is_disabled_due_to_activity_recognition_timeout");
    }

    @Override // defpackage.dgtv
    public final void l() {
        r();
        if (!asqh.f() || !fspd.c()) {
            dgtw dgtwVar = this.f;
            if (dgtwVar.f) {
                dgtwVar.b();
            }
        }
        if (r()) {
            jR("Phone off person");
        }
    }

    @Override // defpackage.dgtv
    public final void m() {
        String str;
        if (asqh.f() && fspd.c() && this.h) {
            if (!v().equals("is_supported")) {
                jT(false, false);
            } else {
                if (r()) {
                    return;
                }
                try {
                    str = getResources().getString(R.string.onbody_trust_granted_message);
                } catch (Resources.NotFoundException unused) {
                    str = "";
                }
                jO(str, "user-present", aseu.TRUSTLET_ONBODY_TRUST_GRANTED);
            }
        }
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        x();
        dgtf d2 = dgtf.d();
        this.j = d2;
        d2.e();
        y();
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onRebind(Intent intent) {
        x();
        y();
    }

    @Override // defpackage.dgme, com.google.android.chimera.BoundService, defpackage.qan
    public final boolean onUnbind(Intent intent) {
        if (this.k != null) {
            dgnc.a(this).unregisterOnSharedPreferenceChangeListener(this.k);
        }
        unregisterReceiver(this.e);
        super.onUnbind(intent);
        return true;
    }

    @Override // defpackage.dgme
    public final boolean p() {
        return dgne.a().b;
    }

    @Override // defpackage.dgme
    public final boolean q() {
        return dgui.f(AppContextProvider.a());
    }

    @Override // defpackage.dgme
    protected final boolean t() {
        return q() && p() && dgnc.a(this).getBoolean("auth_trust_agent_pref_trustlet_enabled_com.google.android.gms.auth.trustagent.trustlet.PhonePositionTrustlet", false);
    }

    @Override // defpackage.dgme
    public final void u(fecj fecjVar) {
        ekhd ekhdVar = ((ekhg) fecjVar.b).i;
        if (ekhdVar == null) {
            ekhdVar = ekhd.a;
        }
        fecj fecjVar2 = (fecj) ekhdVar.iB(5, null);
        fecjVar2.X(ekhdVar);
        boolean o = o();
        if (!fecjVar2.b.L()) {
            fecjVar2.U();
        }
        ekhd ekhdVar2 = (ekhd) fecjVar2.b;
        ekhdVar2.b |= 4;
        ekhdVar2.e = o;
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        ekhg ekhgVar = (ekhg) fecjVar.b;
        ekhd ekhdVar3 = (ekhd) fecjVar2.Q();
        ekhdVar3.getClass();
        ekhgVar.i = ekhdVar3;
        ekhgVar.b |= 128;
    }
}
