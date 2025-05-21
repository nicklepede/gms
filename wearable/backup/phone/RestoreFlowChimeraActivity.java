package com.google.android.gms.wearable.backup.phone;

import android.os.Bundle;
import android.util.Pair;
import androidx.navigation.fragment.NavHostFragment;
import com.google.android.gms.R;
import com.google.android.gms.wearable.AppTheme;
import com.google.android.gms.wearable.backup.phone.RestoreFlowChimeraActivity;
import defpackage.aqxn;
import defpackage.aqxo;
import defpackage.arxo;
import defpackage.asmb;
import defpackage.dfab;
import defpackage.dfah;
import defpackage.dfak;
import defpackage.dfaq;
import defpackage.djks;
import defpackage.djlj;
import defpackage.djll;
import defpackage.djpi;
import defpackage.djpn;
import defpackage.djpo;
import defpackage.djpp;
import defpackage.djpq;
import defpackage.djpr;
import defpackage.djps;
import defpackage.djqf;
import defpackage.djqg;
import defpackage.djqh;
import defpackage.dkbd;
import defpackage.dkmy;
import defpackage.eble;
import defpackage.eiig;
import defpackage.ftjy;
import defpackage.jpc;
import defpackage.jpd;
import defpackage.jrc;
import defpackage.jrh;
import defpackage.jsp;
import defpackage.jst;
import defpackage.kdr;
import defpackage.qet;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class RestoreFlowChimeraActivity extends qet implements djqf {
    public static final arxo j = new djlj("RestoreFlowActivity");
    public static final jsp k = new djpn();
    public static final jsp l = new djpo();
    public static final jsp m = new djpp();
    public static final jsp n = new djpq();
    public static final jsp o = new djpr();
    public AppTheme q;
    public kdr p = null;
    private jst r = null;

    private final jst k() {
        if (this.r == null) {
            String l2 = l("nodeId");
            String l3 = l("accountName");
            jst jstVar = new jst();
            this.r = jstVar;
            jstVar.b(k, new djpi(djks.e(this), new asmb(2, 9), l2, l3));
            this.r.b(l, new dkmy(this, aqxn.a));
            this.r.b(m, new djll());
            this.r.b(n, l2);
            this.r.b(o, Boolean.valueOf(getIntent().getBooleanExtra("requireWifi", false)));
        }
        return this.r;
    }

    private final String l(String str) {
        String stringExtra = getIntent().getStringExtra(str);
        if (stringExtra != null) {
            return stringExtra;
        }
        throw new IllegalStateException(String.format(Locale.getDefault(), "Extra %s is required.", str));
    }

    public final void a(AppTheme appTheme) {
        String str;
        this.q = appTheme;
        dkbd.f(appTheme, getIntent(), this);
        setContentView(R.layout.companion_restore_flow_activity);
        if (ftjy.e()) {
            str = null;
        } else {
            str = l("deviceName");
            if (str.equals("watch")) {
                str = getResources().getString(R.string.common_watch_lowercase);
            }
        }
        final djqh djqhVar = (djqh) new jrh(getViewModelStore(), jrc.b(djqh.b), k()).a(djqh.class);
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().g(R.id.nav_host);
        if (navHostFragment == null) {
            throw new IllegalStateException("NavHostFragment not found.");
        }
        getOnBackPressedDispatcher().b(navHostFragment, new djps());
        this.p = navHostFragment.y();
        jpc jpcVar = djqhVar.h;
        jpcVar.g(this, new jpd() { // from class: djpm
            @Override // defpackage.jpd
            public final void a(Object obj) {
                djqg djqgVar = (djqg) obj;
                RestoreFlowChimeraActivity.j.h("OnStateChange: ".concat(String.valueOf(String.valueOf(djqgVar))), new Object[0]);
                Bundle bundle = new Bundle();
                RestoreFlowChimeraActivity restoreFlowChimeraActivity = RestoreFlowChimeraActivity.this;
                bundle.putParcelable("theme", restoreFlowChimeraActivity.q);
                kdr kdrVar = restoreFlowChimeraActivity.p;
                eiig.x(kdrVar);
                int ordinal = djqgVar.ordinal();
                if (ordinal == 0) {
                    kdrVar.k(R.id.loading_accounts_fragment, bundle);
                    return;
                }
                if (ordinal == 1) {
                    kdrVar.k(R.id.select_backup_fragment, bundle);
                    return;
                }
                if (ordinal == 3) {
                    kdrVar.k(R.id.decrypt_backup_fragment, bundle);
                    return;
                }
                switch (ordinal) {
                    case 5:
                        kdrVar.k(R.id.request_charging_fragment, bundle);
                        break;
                    case 6:
                        kdrVar.k(R.id.restore_start_fragment, bundle);
                        break;
                    case 7:
                    case 8:
                    case 9:
                        restoreFlowChimeraActivity.finish();
                        break;
                }
            }
        });
        djqhVar.k = this;
        if (!ftjy.e()) {
            eiig.x(str);
            djqhVar.j = str;
        }
        if (jpcVar.n()) {
            return;
        }
        if (!getIntent().getBooleanExtra("resume", false)) {
            djqh.a.j("Start restore flow", new Object[0]);
            djqhVar.b(djqg.FETCH_BACKUPS);
            return;
        }
        kdr kdrVar = this.p;
        eiig.x(kdrVar);
        kdrVar.j(R.id.blank_fragment);
        djqh.a.j("Resume restore flow", new Object[0]);
        dfaq c = djqhVar.d.c(djqhVar.e);
        c.z(new dfak() { // from class: djpt
            @Override // defpackage.dfak
            public final void gn(Object obj) {
                djqh djqhVar2 = djqh.this;
                Pair pair = (Pair) obj;
                try {
                    byte[] bArr = (byte[]) pair.second;
                    fecp y = fecp.y(ahiw.a, bArr, 0, bArr.length, febw.a());
                    fecp.M(y);
                    djqhVar2.i.l((ahiw) y);
                    djqhVar2.b(djqg.values()[((Integer) pair.first).intValue()]);
                } catch (fedk e) {
                    djqh.a.g("Failed to deserialize the previous backup data. Fallback to start restore flow", e, new Object[0]);
                    djqhVar2.b(djqg.FETCH_BACKUPS);
                }
            }
        });
        c.y(new dfah() { // from class: djpw
            @Override // defpackage.dfah
            public final void gm(Exception exc) {
                djqh.a.g("Failed to get restore state. Fallback to start restore flow", exc, new Object[0]);
                djqh.this.b(djqg.FETCH_BACKUPS);
            }
        });
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j.j("onCreate", new Object[0]);
        setTheme(R.style.CompanionBackupTheme);
        int i = eble.a;
        aqxo d = djks.d(this);
        String callingPackage = getCallingPackage();
        if (ftjy.a.a().k()) {
            ((djqh) new jrh(getViewModelStore(), jrc.b(djqh.b), k()).a(djqh.class)).k = this;
        }
        if (callingPackage == null) {
            a(dkbd.d());
            return;
        }
        dfaq bd = d.bd(callingPackage);
        bd.z(new dfak() { // from class: djpj
            @Override // defpackage.dfak
            public final void gn(Object obj) {
                RestoreFlowChimeraActivity.this.a((AppTheme) obj);
            }
        });
        bd.y(new dfah() { // from class: djpk
            @Override // defpackage.dfah
            public final void gm(Exception exc) {
                RestoreFlowChimeraActivity.j.g("Did not get app theme result", exc, new Object[0]);
                RestoreFlowChimeraActivity.this.a(dkbd.d());
            }
        });
        bd.a(new dfab() { // from class: djpl
            @Override // defpackage.dfab
            public final void jH() {
                RestoreFlowChimeraActivity.this.a(dkbd.d());
            }
        });
    }
}
