package com.google.android.gms.trustlet.place.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.R;
import com.google.android.gms.chimera.modules.trustlet.place.AppContextProvider;
import com.google.android.gms.significantplaces.SignificantPlacesRequest;
import com.google.android.gms.trustlet.place.internal.PlaceTrustletChimeraService;
import defpackage.athr;
import defpackage.auid;
import defpackage.auio;
import defpackage.ausn;
import defpackage.auve;
import defpackage.bzbw;
import defpackage.deqv;
import defpackage.deqw;
import defpackage.desd;
import defpackage.dhlk;
import defpackage.dhln;
import defpackage.dhlq;
import defpackage.dhlw;
import defpackage.dixj;
import defpackage.diyh;
import defpackage.diyj;
import defpackage.djfw;
import defpackage.eluo;
import defpackage.emup;
import defpackage.emur;
import defpackage.emus;
import defpackage.fgrc;
import defpackage.fvku;
import j$.util.Objects;
import java.util.Iterator;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class PlaceTrustletChimeraService extends dixj implements deqw, bzbw {
    public static final ausn d = ausn.b("Trustlet_Place", auid.TRUSTLET_PLACE);
    private SharedPreferences f;
    private SharedPreferences.OnSharedPreferenceChangeListener h;
    private boolean i;
    private boolean g = false;
    private desd j = null;
    public String e = "";

    private final void x() {
        if (this.i) {
            y().c().x(new dhlk() { // from class: djft
                @Override // defpackage.dhlk
                public final void hH(dhlw dhlwVar) {
                    int i;
                    PlaceTrustletChimeraService placeTrustletChimeraService = PlaceTrustletChimeraService.this;
                    if (fvkf.e()) {
                        if (dhlwVar.m()) {
                            i = ((Integer) dhlwVar.i()).intValue();
                        } else {
                            ((eluo) ((eluo) ((eluo) PlaceTrustletChimeraService.d.i()).s(dhlwVar.h())).ai((char) 11743)).x("Failed to get significant places count");
                            i = 0;
                        }
                        placeTrustletChimeraService.e = oka.b(placeTrustletChimeraService, R.string.trusted_places_significant_places_summary, "count", Integer.valueOf(i));
                        return;
                    }
                    if (!dhlwVar.m()) {
                        ((eluo) ((eluo) ((eluo) PlaceTrustletChimeraService.d.i()).s(dhlwVar.h())).ai((char) 11742)).x("Failed to get significant places count");
                        placeTrustletChimeraService.e = placeTrustletChimeraService.getString(R.string.trusted_places_significant_places_no_places_summary);
                        return;
                    }
                    Integer num = (Integer) dhlwVar.i();
                    int intValue = num.intValue();
                    if (intValue != 0) {
                        placeTrustletChimeraService.e = placeTrustletChimeraService.getString(R.string.trusted_places_significant_places_multiple_configured_summary, placeTrustletChimeraService.getResources().getQuantityString(R.plurals.significant_places_places_configured_count, intValue, num));
                    } else {
                        placeTrustletChimeraService.e = placeTrustletChimeraService.getString(R.string.trusted_places_significant_places_no_places_summary);
                    }
                }
            });
        } else {
            this.e = getString(R.string.extend_unlock_menu_summary_trustlet_off);
        }
    }

    private final desd y() {
        desd desdVar = this.j;
        if (desdVar != null) {
            return desdVar;
        }
        desd desdVar2 = new desd(this);
        this.j = desdVar2;
        return desdVar2;
    }

    @Override // defpackage.deqw
    public final void c(deqv deqvVar) {
        boolean z;
        ausn ausnVar = d;
        ((eluo) ((eluo) ausnVar.h()).ai((char) 11747)).B("onSignificantPlacesEvent: %s", deqvVar);
        int ordinal = deqvVar.ordinal();
        boolean z2 = true;
        if (ordinal != 0) {
            z = false;
            if (ordinal != 1) {
                z2 = false;
            }
        } else {
            z = true;
        }
        if (z2 != o()) {
            ((eluo) ((eluo) ausnVar.h()).ai((char) 11750)).x("[PlaceTrustletChimeraService] update configuration");
            ki(z2, z2);
            x();
        }
        if (z) {
            if (r()) {
                return;
            }
            ((eluo) ((eluo) ausnVar.h()).ai((char) 11749)).x("[PlaceTrustletChimeraService] grant trust using significant places");
            kd("Entered a trusted location", null, auio.TRUSTLET_PLACE_TRUST_GRANTED);
            return;
        }
        if (r()) {
            ((eluo) ((eluo) ausnVar.h()).ai((char) 11748)).x("[PlaceTrustletChimeraService] revoke trust using significant places");
            kg("Left a trusted location");
        }
    }

    @Override // defpackage.dixj
    public final Bundle d() {
        Bundle bundle = new Bundle();
        x();
        bundle.putString("com.google.android.gms.trustagent.api.trustlet.key_trustlet_name", "Place");
        bundle.putBoolean("com.google.android.gms.trustagent.api.trustlet.key_is_user_initiated", false);
        bundle.putBoolean("com.google.android.gms.trustagent.api.trustlet.key_dismiss_keyguard", false);
        bundle.putBoolean("key_trustlet_is_suppored", q());
        bundle.putBoolean("key_trustlet_has_required_permissions", true);
        bundle.putBoolean("key_trustlet_is_enabled_by_device_policy", p());
        bundle.putString("key_trustlet_pref_key", "auth_trust_agent_pref_trusted_places_key");
        bundle.putString("key_trustlet_pref_title", getString(R.string.auth_trust_agent_pref_trusted_places_title));
        bundle.putString("key_trustlet_pref_summary", this.e);
        bundle.putInt("key_trustlet_icon_res_id", R.drawable.quantum_gm_ic_place_vd_theme_24);
        bundle.putString("key_trustlet_settings_activity_intent_action", "com.google.android.gms.trustlet.place.ui.TrustedPlacesSettingsActivity.START");
        bundle.putString("key_trustlet_settings_activity_package_name", "com.google.android.gms");
        return bundle;
    }

    @Override // defpackage.dixj
    public final emur e() {
        return emur.PLACE_TRUSTLET;
    }

    @Override // defpackage.dixj
    public final String f() {
        return "Place";
    }

    @Override // defpackage.dixj
    protected final void g() {
        super.g();
        if (this.i) {
            w();
        }
        if (this.g) {
            ((eluo) ((eluo) d.h()).ai((char) 11738)).x("[PlaceTrustletChimeraService] destroyTrustlet, unregister listener");
            this.f.unregisterOnSharedPreferenceChangeListener(this.h);
            this.g = false;
        }
    }

    @Override // defpackage.dixj
    protected final void i() {
        boolean z;
        super.i();
        this.i = false;
        this.h = new djfw(this);
        if (!this.f.contains("auth_trust_agent_pref_trusted_places_is_places_enabled_key")) {
            SharedPreferences.Editor edit = this.f.edit();
            Iterator<String> it = this.f.getAll().keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                String next = it.next();
                if (!TextUtils.isEmpty(!next.startsWith("auth_trust_agent_pref_trusted_place_enabled_") ? "" : next.substring(44)) && this.f.getBoolean(next, false)) {
                    z = true;
                    break;
                }
            }
            edit.putBoolean("auth_trust_agent_pref_trusted_places_is_places_enabled_key", z).apply();
        }
        this.j = y();
        if (!this.g) {
            ((eluo) ((eluo) d.h()).ai((char) 11740)).x("[PlaceTrustletChimeraService] onSharedPreferenceChanged, register listener");
            this.f.registerOnSharedPreferenceChangeListener(this.h);
            this.g = true;
        }
        if (this.f.getBoolean("auth_trust_agent_pref_trusted_places_is_places_enabled_key", false)) {
            v();
        } else {
            x();
        }
    }

    @Override // defpackage.bzbw
    public final void ir(String str, boolean z) {
        if (Objects.equals(str, "network")) {
            boolean z2 = this.i;
            if (!z2 && z) {
                v();
            } else {
                if (!z2 || z) {
                    return;
                }
                w();
            }
        }
    }

    @Override // defpackage.bzbw
    public final void ix(Set set) {
        if (this.i || !set.contains("network")) {
            return;
        }
        v();
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        AppContextProvider appContextProvider = AppContextProvider.c;
        this.f = diyh.a(appContextProvider == null ? athr.a() : appContextProvider.a);
    }

    @Override // defpackage.dixj
    public final boolean p() {
        return diyj.a().c;
    }

    @Override // defpackage.dixj
    public final boolean q() {
        boolean c = fvku.c();
        ((eluo) ((eluo) d.h()).ai((char) 11741)).B("[PlaceTrustletChimeraService] Trusted Places isSupported: %s", Boolean.valueOf(c));
        return c;
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
        emupVar2.b |= 2;
        emupVar2.d = o;
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        emus emusVar = (emus) fgrcVar.b;
        emup emupVar3 = (emup) fgrcVar2.Q();
        emupVar3.getClass();
        emusVar.i = emupVar3;
        emusVar.b |= 128;
    }

    public final void v() {
        ausn ausnVar = d;
        ((eluo) ((eluo) ausnVar.h()).ai((char) 11751)).x("[PlaceTrustletChimeraService] Place trustlet started");
        this.i = true;
        dhlw d2 = y().d(new SignificantPlacesRequest(null), this, new auve(Looper.getMainLooper()));
        d2.z(new dhlq() { // from class: djfu
            @Override // defpackage.dhlq
            public final void gC(Object obj) {
                ((eluo) ((eluo) PlaceTrustletChimeraService.d.h()).ai((char) 11744)).x("Registered Significant Places listener");
            }
        });
        d2.y(new dhln() { // from class: djfv
            @Override // defpackage.dhln
            public final void gB(Exception exc) {
                ((eluo) ((eluo) ((eluo) PlaceTrustletChimeraService.d.i()).s(exc)).ai((char) 11745)).x("Failed to register for significant place updates");
            }
        });
        x();
        if (this.g) {
            return;
        }
        ((eluo) ((eluo) ausnVar.h()).ai((char) 11753)).x("[PlaceTrustletChimeraService] startTrustlet, register listener");
        this.f.registerOnSharedPreferenceChangeListener(this.h);
        this.g = true;
    }

    public final void w() {
        ((eluo) ((eluo) d.h()).ai((char) 11754)).x("[PlaceTrustletChimeraService] stopTrustlet()");
        y().e(this);
        ki(false, false);
        this.i = false;
        x();
        if (r()) {
            kg("Place trustlet is stopping");
        }
    }
}
