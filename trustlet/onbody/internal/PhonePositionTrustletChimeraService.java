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
import defpackage.auid;
import defpackage.auio;
import defpackage.ausn;
import defpackage.auub;
import defpackage.diwx;
import defpackage.dixj;
import defpackage.diyh;
import defpackage.diyj;
import defpackage.djek;
import defpackage.djfa;
import defpackage.djfb;
import defpackage.djfo;
import defpackage.eluo;
import defpackage.emup;
import defpackage.emur;
import defpackage.emus;
import defpackage.fgrc;
import defpackage.fvkq;
import defpackage.ind;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class PhonePositionTrustletChimeraService extends dixj implements djfa, diwx {
    private static final ausn d = ausn.b("Trustlet_Onbody", auid.TRUSTLET_ONBODY);
    private final BroadcastReceiver e = new TracingBroadcastReceiver() { // from class: com.google.android.gms.trustlet.onbody.internal.PhonePositionTrustletChimeraService.1
        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, Intent intent) {
            if (Objects.equals(intent.getAction(), "com.google.android.gms.trustagent.TRUST_STATE_CHANGED") && intent.getExtras().keySet().contains("is_trustagent_on")) {
                djek.d().e();
            }
        }
    };
    private djfb f;
    private ScreenOnOffReceiver g;
    private boolean h;
    private SharedPreferences i;
    private djek j;
    private SharedPreferences.OnSharedPreferenceChangeListener k;

    private final String v() {
        if (!djfo.f(this)) {
            return "On-body_detection_can_not_started_due_to_absence_of_hardware";
        }
        if (this.i.getBoolean("auth_trust_agent_pref_trustlet_enabled_com.google.android.gms.auth.trustagent.trustlet.PhonePositionTrustlet", false)) {
            return "is_supported";
        }
        djfb djfbVar = this.f;
        if (!djfbVar.f) {
            return "On-body_detection_is_disabled_by_user";
        }
        djfbVar.b();
        return "On-body_detection_is_disabled_by_user";
    }

    private final String w() {
        if (this.i == null) {
            this.i = diyh.a(this);
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
                ((eluo) ((eluo) ((eluo) d.i()).s(e)).ai((char) 11723)).x("[PhonePositionTrustletService] Couldn't find resource");
                return "";
            }
        }
    }

    private final void x() {
        if (this.k != null) {
            return;
        }
        this.k = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: djfc
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                if (Objects.equals(str, "auth_trust_agent_pref_trustlet_enabled_com.google.android.gms.auth.trustagent.trustlet.PhonePositionTrustlet")) {
                    PhonePositionTrustletChimeraService.this.n();
                }
            }
        };
        diyh.a(this).registerOnSharedPreferenceChangeListener(this.k);
    }

    private final void y() {
        ind.b(this, this.e, new IntentFilter("com.google.android.gms.trustagent.TRUST_STATE_CHANGED"), 2);
    }

    @Override // defpackage.diwx
    public final void c() {
        this.h = true;
    }

    @Override // defpackage.dixj
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

    @Override // defpackage.dixj
    public final emur e() {
        return emur.PHONE_POSITION_TRUSTLET;
    }

    @Override // defpackage.dixj
    public final String f() {
        return "PhonePosition";
    }

    @Override // defpackage.dixj
    protected final void g() {
        this.f.b();
        this.g.c();
        super.g();
    }

    @Override // defpackage.djfa
    public final void h(boolean z) {
        ki(z, z);
        if (z || !r()) {
            return;
        }
        kg("Cannot register to activity recognition service.");
    }

    @Override // defpackage.dixj
    protected final void i() {
        super.i();
        ScreenOnOffReceiver screenOnOffReceiver = this.g;
        if (screenOnOffReceiver == null) {
            screenOnOffReceiver = new ScreenOnOffReceiver(this, this);
        }
        this.g = screenOnOffReceiver;
        screenOnOffReceiver.b();
        djfb djfbVar = this.f;
        if (djfbVar == null) {
            djfbVar = new djfb(this, this);
        }
        this.f = djfbVar;
        this.i = diyh.a(this);
        if (v().equals("is_supported")) {
            this.f.a();
        } else {
            ki(false, false);
        }
    }

    @Override // defpackage.djfa
    public final void j(String str) {
        this.f.b();
        if (r()) {
            kg(str);
        }
    }

    @Override // defpackage.diwx
    public final void kb() {
        String str;
        if (this.h) {
            this.h = false;
            djfb djfbVar = this.f;
            djfbVar.g = SystemClock.elapsedRealtime();
            djfbVar.b.set(-1L);
            if (!v().equals("is_supported")) {
                ki(false, false);
                return;
            }
            if (!r()) {
                try {
                    str = getResources().getString(R.string.onbody_trust_granted_message);
                } catch (Resources.NotFoundException unused) {
                    str = "";
                }
                kd(str, "user-present", auio.TRUSTLET_ONBODY_TRUST_GRANTED);
            }
            this.f.a();
        }
    }

    @Override // defpackage.dixj
    public final void kf() {
        super.kf();
        this.j.e();
    }

    @Override // defpackage.diwx
    public final void kh() {
        djfb djfbVar = this.f;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!djfbVar.f || elapsedRealtime <= djfbVar.i + 30000 || elapsedRealtime <= djfbVar.g + 30000) {
            return;
        }
        ((eluo) ((eluo) djfb.a.i()).ai((char) 11705)).x("[PhonePositionTracker] Activity recognition timeout, disable trustlet.");
        djfbVar.d.j("On-body_detection_is_disabled_due_to_activity_recognition_timeout");
    }

    @Override // defpackage.djfa
    public final void l() {
        r();
        if (!auub.f() || !fvkq.c()) {
            djfb djfbVar = this.f;
            if (djfbVar.f) {
                djfbVar.b();
            }
        }
        if (r()) {
            kg("Phone off person");
        }
    }

    @Override // defpackage.djfa
    public final void m() {
        String str;
        if (auub.f() && fvkq.c() && this.h) {
            if (!v().equals("is_supported")) {
                ki(false, false);
            } else {
                if (r()) {
                    return;
                }
                try {
                    str = getResources().getString(R.string.onbody_trust_granted_message);
                } catch (Resources.NotFoundException unused) {
                    str = "";
                }
                kd(str, "user-present", auio.TRUSTLET_ONBODY_TRUST_GRANTED);
            }
        }
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        x();
        djek d2 = djek.d();
        this.j = d2;
        d2.e();
        y();
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onRebind(Intent intent) {
        x();
        y();
    }

    @Override // defpackage.dixj, com.google.android.chimera.BoundService, defpackage.rtr
    public final boolean onUnbind(Intent intent) {
        if (this.k != null) {
            diyh.a(this).unregisterOnSharedPreferenceChangeListener(this.k);
        }
        unregisterReceiver(this.e);
        super.onUnbind(intent);
        return true;
    }

    @Override // defpackage.dixj
    public final boolean p() {
        return diyj.a().b;
    }

    @Override // defpackage.dixj
    public final boolean q() {
        return djfo.f(AppContextProvider.a());
    }

    @Override // defpackage.dixj
    protected final boolean t() {
        return q() && p() && diyh.a(this).getBoolean("auth_trust_agent_pref_trustlet_enabled_com.google.android.gms.auth.trustagent.trustlet.PhonePositionTrustlet", false);
    }

    @Override // defpackage.dixj
    public final void u(fgrc fgrcVar) {
        emup emupVar = ((emus) fgrcVar.b).i;
        if (emupVar == null) {
            emupVar = emup.a;
        }
        fgrc fgrcVar2 = (fgrc) emupVar.iQ(5, null);
        fgrcVar2.X(emupVar);
        boolean o = o();
        if (!fgrcVar2.b.L()) {
            fgrcVar2.U();
        }
        emup emupVar2 = (emup) fgrcVar2.b;
        emupVar2.b |= 4;
        emupVar2.e = o;
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        emus emusVar = (emus) fgrcVar.b;
        emup emupVar3 = (emup) fgrcVar2.Q();
        emupVar3.getClass();
        emusVar.i = emupVar3;
        emusVar.b |= 128;
    }
}
