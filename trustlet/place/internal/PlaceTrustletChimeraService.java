package com.google.android.gms.trustlet.place.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.R;
import com.google.android.gms.chimera.modules.trustlet.place.AppContextProvider;
import com.google.android.gms.significantplaces.SignificantPlacesRequest;
import com.google.android.gms.trustlet.place.internal.PlaceTrustletChimeraService;
import defpackage.arfc;
import defpackage.asej;
import defpackage.aseu;
import defpackage.asot;
import defpackage.asrk;
import defpackage.bwtg;
import defpackage.dcgp;
import defpackage.dcgq;
import defpackage.dchx;
import defpackage.dfae;
import defpackage.dfah;
import defpackage.dfak;
import defpackage.dfaq;
import defpackage.dgme;
import defpackage.dgnc;
import defpackage.dgne;
import defpackage.dguq;
import defpackage.ejhf;
import defpackage.ekhd;
import defpackage.ekhf;
import defpackage.ekhg;
import defpackage.fecj;
import defpackage.fspg;
import j$.util.Objects;
import java.util.Iterator;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PlaceTrustletChimeraService extends dgme implements dcgq, bwtg {
    public static final asot d = asot.b("Trustlet_Place", asej.TRUSTLET_PLACE);
    private SharedPreferences f;
    private SharedPreferences.OnSharedPreferenceChangeListener h;
    private boolean i;
    private boolean g = false;
    private dchx j = null;
    public String e = "";

    private final void x() {
        if (this.i) {
            y().c().x(new dfae() { // from class: dgun
                @Override // defpackage.dfae
                public final void hr(dfaq dfaqVar) {
                    int i;
                    PlaceTrustletChimeraService placeTrustletChimeraService = PlaceTrustletChimeraService.this;
                    if (fsot.d()) {
                        if (dfaqVar.m()) {
                            i = ((Integer) dfaqVar.i()).intValue();
                        } else {
                            ((ejhf) ((ejhf) ((ejhf) PlaceTrustletChimeraService.d.i()).s(dfaqVar.h())).ah((char) 11740)).x("Failed to get significant places count");
                            i = 0;
                        }
                        placeTrustletChimeraService.e = mrs.b(placeTrustletChimeraService, R.string.trusted_places_significant_places_summary, "count", Integer.valueOf(i));
                        return;
                    }
                    if (!dfaqVar.m()) {
                        ((ejhf) ((ejhf) ((ejhf) PlaceTrustletChimeraService.d.i()).s(dfaqVar.h())).ah((char) 11739)).x("Failed to get significant places count");
                        placeTrustletChimeraService.e = placeTrustletChimeraService.getString(R.string.trusted_places_significant_places_no_places_summary);
                        return;
                    }
                    Integer num = (Integer) dfaqVar.i();
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

    private final dchx y() {
        dchx dchxVar = this.j;
        if (dchxVar != null) {
            return dchxVar;
        }
        dchx dchxVar2 = new dchx(this);
        this.j = dchxVar2;
        return dchxVar2;
    }

    @Override // defpackage.dcgq
    public final void c(dcgp dcgpVar) {
        boolean z;
        asot asotVar = d;
        ((ejhf) ((ejhf) asotVar.h()).ah((char) 11744)).B("onSignificantPlacesEvent: %s", dcgpVar);
        int ordinal = dcgpVar.ordinal();
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
            ((ejhf) ((ejhf) asotVar.h()).ah((char) 11747)).x("[PlaceTrustletChimeraService] update configuration");
            jT(z2, z2);
            x();
        }
        if (z) {
            if (r()) {
                return;
            }
            ((ejhf) ((ejhf) asotVar.h()).ah((char) 11746)).x("[PlaceTrustletChimeraService] grant trust using significant places");
            jO("Entered a trusted location", null, aseu.TRUSTLET_PLACE_TRUST_GRANTED);
            return;
        }
        if (r()) {
            ((ejhf) ((ejhf) asotVar.h()).ah((char) 11745)).x("[PlaceTrustletChimeraService] revoke trust using significant places");
            jR("Left a trusted location");
        }
    }

    @Override // defpackage.dgme
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

    @Override // defpackage.dgme
    public final ekhf e() {
        return ekhf.PLACE_TRUSTLET;
    }

    @Override // defpackage.dgme
    public final String f() {
        return "Place";
    }

    @Override // defpackage.dgme
    protected final void g() {
        super.g();
        if (this.i) {
            w();
        }
        if (this.g) {
            ((ejhf) ((ejhf) d.h()).ah((char) 11735)).x("[PlaceTrustletChimeraService] destroyTrustlet, unregister listener");
            this.f.unregisterOnSharedPreferenceChangeListener(this.h);
            this.g = false;
        }
    }

    @Override // defpackage.dgme
    protected final void i() {
        boolean z;
        super.i();
        this.i = false;
        this.h = new dguq(this);
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
            ((ejhf) ((ejhf) d.h()).ah((char) 11737)).x("[PlaceTrustletChimeraService] onSharedPreferenceChanged, register listener");
            this.f.registerOnSharedPreferenceChangeListener(this.h);
            this.g = true;
        }
        if (this.f.getBoolean("auth_trust_agent_pref_trusted_places_is_places_enabled_key", false)) {
            v();
        } else {
            x();
        }
    }

    @Override // defpackage.bwtg
    public final void ic(String str, boolean z) {
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

    @Override // defpackage.bwtg
    public final void ii(Set set) {
        if (this.i || !set.contains("network")) {
            return;
        }
        v();
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        AppContextProvider appContextProvider = AppContextProvider.c;
        this.f = dgnc.a(appContextProvider == null ? arfc.a() : appContextProvider.a);
    }

    @Override // defpackage.dgme
    public final boolean p() {
        return dgne.a().c;
    }

    @Override // defpackage.dgme
    public final boolean q() {
        boolean c = fspg.c();
        ((ejhf) ((ejhf) d.h()).ah((char) 11738)).B("[PlaceTrustletChimeraService] Trusted Places isSupported: %s", Boolean.valueOf(c));
        return c;
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
        ekhdVar2.b |= 2;
        ekhdVar2.d = o;
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        ekhg ekhgVar = (ekhg) fecjVar.b;
        ekhd ekhdVar3 = (ekhd) fecjVar2.Q();
        ekhdVar3.getClass();
        ekhgVar.i = ekhdVar3;
        ekhgVar.b |= 128;
    }

    public final void v() {
        asot asotVar = d;
        ((ejhf) ((ejhf) asotVar.h()).ah((char) 11748)).x("[PlaceTrustletChimeraService] Place trustlet started");
        this.i = true;
        dfaq d2 = y().d(new SignificantPlacesRequest(null), this, new asrk(Looper.getMainLooper()));
        d2.z(new dfak() { // from class: dguo
            @Override // defpackage.dfak
            public final void gn(Object obj) {
                ((ejhf) ((ejhf) PlaceTrustletChimeraService.d.h()).ah((char) 11741)).x("Registered Significant Places listener");
            }
        });
        d2.y(new dfah() { // from class: dgup
            @Override // defpackage.dfah
            public final void gm(Exception exc) {
                ((ejhf) ((ejhf) ((ejhf) PlaceTrustletChimeraService.d.i()).s(exc)).ah((char) 11742)).x("Failed to register for significant place updates");
            }
        });
        x();
        if (this.g) {
            return;
        }
        ((ejhf) ((ejhf) asotVar.h()).ah((char) 11750)).x("[PlaceTrustletChimeraService] startTrustlet, register listener");
        this.f.registerOnSharedPreferenceChangeListener(this.h);
        this.g = true;
    }

    public final void w() {
        ((ejhf) ((ejhf) d.h()).ah((char) 11751)).x("[PlaceTrustletChimeraService] stopTrustlet()");
        y().e(this);
        jT(false, false);
        this.i = false;
        x();
        if (r()) {
            jR("Place trustlet is stopping");
        }
    }
}
