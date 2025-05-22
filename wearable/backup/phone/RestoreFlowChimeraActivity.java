package com.google.android.gms.wearable.backup.phone;

import android.os.Bundle;
import android.util.Pair;
import androidx.navigation.fragment.NavHostFragment;
import com.google.android.gms.R;
import com.google.android.gms.wearable.AppTheme;
import com.google.android.gms.wearable.backup.phone.RestoreFlowChimeraActivity;
import defpackage.atac;
import defpackage.atad;
import defpackage.auad;
import defpackage.aupv;
import defpackage.dhlh;
import defpackage.dhln;
import defpackage.dhlq;
import defpackage.dhlw;
import defpackage.dlwl;
import defpackage.dlxc;
import defpackage.dlxe;
import defpackage.dmbb;
import defpackage.dmbg;
import defpackage.dmbh;
import defpackage.dmbi;
import defpackage.dmbj;
import defpackage.dmbk;
import defpackage.dmbl;
import defpackage.dmby;
import defpackage.dmbz;
import defpackage.dmca;
import defpackage.dmmw;
import defpackage.dmyr;
import defpackage.edxt;
import defpackage.ekvl;
import defpackage.fwfq;
import defpackage.jvr;
import defpackage.jvs;
import defpackage.jxr;
import defpackage.jxw;
import defpackage.jze;
import defpackage.jzi;
import defpackage.lwb;
import defpackage.rxx;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class RestoreFlowChimeraActivity extends rxx implements dmby {
    public static final auad j = new dlxc("RestoreFlowActivity");
    public static final jze k = new dmbg();
    public static final jze l = new dmbh();
    public static final jze m = new dmbi();
    public static final jze n = new dmbj();
    public static final jze o = new dmbk();
    public AppTheme q;
    public lwb p = null;
    private jzi r = null;

    private final jzi k() {
        if (this.r == null) {
            String l2 = l("nodeId");
            String l3 = l("accountName");
            jzi jziVar = new jzi();
            this.r = jziVar;
            jziVar.b(k, new dmbb(dlwl.e(this), new aupv(2, 9), l2, l3));
            this.r.b(l, new dmyr(this, atac.a));
            this.r.b(m, new dlxe());
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
        dmmw.f(appTheme, getIntent(), this);
        setContentView(R.layout.companion_restore_flow_activity);
        if (fwfq.e()) {
            str = null;
        } else {
            str = l("deviceName");
            if (str.equals("watch")) {
                str = getResources().getString(R.string.common_watch_lowercase);
            }
        }
        final dmca dmcaVar = (dmca) new jxw(getViewModelStore(), jxr.b(dmca.b), k()).a(dmca.class);
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().g(R.id.nav_host);
        if (navHostFragment == null) {
            throw new IllegalStateException("NavHostFragment not found.");
        }
        getOnBackPressedDispatcher().b(navHostFragment, new dmbl());
        this.p = navHostFragment.y();
        jvr jvrVar = dmcaVar.h;
        jvrVar.g(this, new jvs() { // from class: dmbf
            @Override // defpackage.jvs
            public final void a(Object obj) {
                dmbz dmbzVar = (dmbz) obj;
                RestoreFlowChimeraActivity.j.h("OnStateChange: ".concat(String.valueOf(String.valueOf(dmbzVar))), new Object[0]);
                Bundle bundle = new Bundle();
                RestoreFlowChimeraActivity restoreFlowChimeraActivity = RestoreFlowChimeraActivity.this;
                bundle.putParcelable("theme", restoreFlowChimeraActivity.q);
                lwb lwbVar = restoreFlowChimeraActivity.p;
                ekvl.y(lwbVar);
                int ordinal = dmbzVar.ordinal();
                if (ordinal == 0) {
                    lwbVar.k(R.id.loading_accounts_fragment, bundle);
                    return;
                }
                if (ordinal == 1) {
                    lwbVar.k(R.id.select_backup_fragment, bundle);
                    return;
                }
                if (ordinal == 3) {
                    lwbVar.k(R.id.decrypt_backup_fragment, bundle);
                    return;
                }
                switch (ordinal) {
                    case 5:
                        lwbVar.k(R.id.request_charging_fragment, bundle);
                        break;
                    case 6:
                        lwbVar.k(R.id.restore_start_fragment, bundle);
                        break;
                    case 7:
                    case 8:
                    case 9:
                        restoreFlowChimeraActivity.finish();
                        break;
                }
            }
        });
        dmcaVar.k = this;
        if (!fwfq.e()) {
            ekvl.y(str);
            dmcaVar.j = str;
        }
        if (jvrVar.n()) {
            return;
        }
        if (!getIntent().getBooleanExtra("resume", false)) {
            dmca.a.j("Start restore flow", new Object[0]);
            dmcaVar.b(dmbz.FETCH_BACKUPS);
            return;
        }
        lwb lwbVar = this.p;
        ekvl.y(lwbVar);
        lwbVar.j(R.id.blank_fragment);
        dmca.a.j("Resume restore flow", new Object[0]);
        dhlw c = dmcaVar.d.c(dmcaVar.e);
        c.z(new dhlq() { // from class: dmbm
            @Override // defpackage.dhlq
            public final void gC(Object obj) {
                dmca dmcaVar2 = dmca.this;
                Pair pair = (Pair) obj;
                try {
                    byte[] bArr = (byte[]) pair.second;
                    fgri y = fgri.y(ajjm.a, bArr, 0, bArr.length, fgqp.a());
                    fgri.M(y);
                    dmcaVar2.i.l((ajjm) y);
                    dmcaVar2.b(dmbz.values()[((Integer) pair.first).intValue()]);
                } catch (fgsd e) {
                    dmca.a.g("Failed to deserialize the previous backup data. Fallback to start restore flow", e, new Object[0]);
                    dmcaVar2.b(dmbz.FETCH_BACKUPS);
                }
            }
        });
        c.y(new dhln() { // from class: dmbp
            @Override // defpackage.dhln
            public final void gB(Exception exc) {
                dmca.a.g("Failed to get restore state. Fallback to start restore flow", exc, new Object[0]);
                dmca.this.b(dmbz.FETCH_BACKUPS);
            }
        });
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j.j("onCreate", new Object[0]);
        setTheme(R.style.CompanionBackupTheme);
        int i = edxt.a;
        atad d = dlwl.d(this);
        String callingPackage = getCallingPackage();
        if (fwfq.a.lK().k()) {
            ((dmca) new jxw(getViewModelStore(), jxr.b(dmca.b), k()).a(dmca.class)).k = this;
        }
        if (callingPackage == null) {
            a(dmmw.d());
            return;
        }
        dhlw bc = d.bc(callingPackage);
        bc.z(new dhlq() { // from class: dmbc
            @Override // defpackage.dhlq
            public final void gC(Object obj) {
                RestoreFlowChimeraActivity.this.a((AppTheme) obj);
            }
        });
        bc.y(new dhln() { // from class: dmbd
            @Override // defpackage.dhln
            public final void gB(Exception exc) {
                RestoreFlowChimeraActivity.j.g("Did not get app theme result", exc, new Object[0]);
                RestoreFlowChimeraActivity.this.a(dmmw.d());
            }
        });
        bc.a(new dhlh() { // from class: dmbe
            @Override // defpackage.dhlh
            public final void jX() {
                RestoreFlowChimeraActivity.this.a(dmmw.d());
            }
        });
    }
}
