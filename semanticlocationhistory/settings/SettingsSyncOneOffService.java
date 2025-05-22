package com.google.android.gms.semanticlocationhistory.settings;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.settings.SettingsSyncOneOffService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.casd;
import defpackage.catb;
import defpackage.cauf;
import defpackage.dbsv;
import defpackage.dbtc;
import defpackage.ddvc;
import defpackage.ekut;
import defpackage.eluo;
import defpackage.eqcq;
import defpackage.eqdl;
import defpackage.eqex;
import defpackage.eqgb;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.eqhb;
import defpackage.etry;
import defpackage.etrz;
import defpackage.ewgh;
import defpackage.fusk;
import defpackage.fwuc;
import defpackage.wjw;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SettingsSyncOneOffService extends GmsTaskBoundService {
    public static final ausn a = ausn.c("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY, "SettingsSyncOneOffTask");
    static final String b = SettingsSyncOneOffService.class.getName();
    private dbtc c;
    private ddvc d;

    public static void g(Context context) {
        casd a2 = casd.a(context);
        catb catbVar = new catb();
        catbVar.w(b);
        catbVar.t("OdlhSettingsSyncOneOffTask");
        catbVar.v(true == fusk.n() ? 2 : 1);
        fusk fuskVar = fusk.a;
        catbVar.e(fuskVar.lK().m(), fuskVar.lK().l());
        a2.f(catbVar.b());
    }

    public static final etrz h(Throwable th) {
        return new etrz(etry.NO_USER_DATA, th.getMessage());
    }

    private final dbtc j() {
        if (this.c == null) {
            this.c = new dbtc();
        }
        return this.c;
    }

    public final ddvc d() {
        if (this.d == null) {
            this.d = new ddvc();
        }
        return this.d;
    }

    public final void e(int i) {
        j().k("OdlhSettingsSyncOneOffAccount", i);
    }

    public final void f(int i) {
        j().k("OdlhSettingsSyncOneOffJob", i);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        String str = caufVar.a;
        if (!Objects.equals(str, "OdlhSettingsSyncOneOffTask")) {
            ((eluo) ((eluo) a.i()).ai((char) 10801)).B("Unexpected tag: %s.", str);
            return eqgc.i(2);
        }
        f(1);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Account account : dbsv.d(AppContextProvider.a())) {
            e(1);
            try {
                hashMap.put(account, d().c(account));
            } catch (fwuc | wjw e) {
                e(2);
                ((eluo) ((eluo) ((eluo) a.j()).s(e)).ai((char) 10800)).B("Fetching LH settings from server failed for account: %s", h(e));
                arrayList.add(eqgc.i(false));
            }
        }
        d().e();
        for (Map.Entry entry : hashMap.entrySet()) {
            Account account2 = (Account) entry.getKey();
            ewgh ewghVar = (ewgh) entry.getValue();
            eqhb eqhbVar = new eqhb(eqex.a);
            arrayList.add(eqcq.f(eqdl.f(eqgb.h(d().a(account2, ewghVar)), new ekut() { // from class: ddvd
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    Boolean bool = (Boolean) obj;
                    boolean booleanValue = bool.booleanValue();
                    SettingsSyncOneOffService settingsSyncOneOffService = SettingsSyncOneOffService.this;
                    if (booleanValue) {
                        settingsSyncOneOffService.e(5);
                    } else {
                        ((eluo) ((eluo) SettingsSyncOneOffService.a.j()).ai((char) 10796)).x("Failed to sync lh controls for account");
                        settingsSyncOneOffService.e(3);
                    }
                    settingsSyncOneOffService.d().f();
                    return bool;
                }
            }, eqhbVar), Exception.class, new ekut() { // from class: ddve
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    SettingsSyncOneOffService.this.e(4);
                    ((eluo) ((eluo) SettingsSyncOneOffService.a.j()).ai((char) 10798)).B("Failed to sync settings with error: %s", SettingsSyncOneOffService.h((Exception) obj));
                    return false;
                }
            }, eqhbVar));
        }
        return eqdl.f(eqgb.h(eqgc.e(arrayList)), new ekut() { // from class: ddvf
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                boolean contains = ((List) obj).contains(false);
                SettingsSyncOneOffService settingsSyncOneOffService = SettingsSyncOneOffService.this;
                if (contains) {
                    settingsSyncOneOffService.f(2);
                    ((eluo) ((eluo) SettingsSyncOneOffService.a.j()).ai((char) 10795)).x("Failed to sync ODLH settings for all accounts");
                    return 2;
                }
                settingsSyncOneOffService.f(3);
                ((eluo) ((eluo) SettingsSyncOneOffService.a.h()).ai((char) 10794)).x("Synced ODLH settings for all accounts.");
                return 0;
            }
        }, eqex.a);
    }
}
