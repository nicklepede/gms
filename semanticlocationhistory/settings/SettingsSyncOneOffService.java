package com.google.android.gms.semanticlocationhistory.settings;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.settings.SettingsSyncOneOffService;
import defpackage.asej;
import defpackage.asot;
import defpackage.byjl;
import defpackage.bykj;
import defpackage.byln;
import defpackage.czix;
import defpackage.czje;
import defpackage.dbkw;
import defpackage.eiho;
import defpackage.ejhf;
import defpackage.enox;
import defpackage.enps;
import defpackage.enre;
import defpackage.ensi;
import defpackage.ensj;
import defpackage.enss;
import defpackage.enti;
import defpackage.erdc;
import defpackage.erdd;
import defpackage.etqp;
import defpackage.frxq;
import defpackage.ftye;
import defpackage.unx;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SettingsSyncOneOffService extends GmsTaskBoundService {
    public static final asot a = asot.c("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY, "SettingsSyncOneOffTask");
    static final String b = SettingsSyncOneOffService.class.getName();
    private czje c;
    private dbkw d;

    public static void g(Context context) {
        byjl a2 = byjl.a(context);
        bykj bykjVar = new bykj();
        bykjVar.w(b);
        bykjVar.t("OdlhSettingsSyncOneOffTask");
        bykjVar.v(true == frxq.p() ? 2 : 1);
        frxq frxqVar = frxq.a;
        bykjVar.e(frxqVar.a().n(), frxqVar.a().m());
        a2.f(bykjVar.b());
    }

    public static final erdd h(Throwable th) {
        return new erdd(erdc.NO_USER_DATA, th.getMessage());
    }

    private final czje j() {
        if (this.c == null) {
            this.c = new czje();
        }
        return this.c;
    }

    public final dbkw d() {
        if (this.d == null) {
            this.d = new dbkw();
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
    public final enss im(byln bylnVar) {
        String str = bylnVar.a;
        if (!Objects.equals(str, "OdlhSettingsSyncOneOffTask")) {
            ((ejhf) ((ejhf) a.i()).ah((char) 10798)).B("Unexpected tag: %s.", str);
            return ensj.i(2);
        }
        f(1);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Account account : czix.d(AppContextProvider.a())) {
            e(1);
            try {
                hashMap.put(account, d().c(account));
            } catch (ftye | unx e) {
                e(2);
                ((ejhf) ((ejhf) ((ejhf) a.j()).s(e)).ah((char) 10797)).B("Fetching LH settings from server failed for account: %s", h(e));
                arrayList.add(ensj.i(false));
            }
        }
        d().e();
        for (Map.Entry entry : hashMap.entrySet()) {
            Account account2 = (Account) entry.getKey();
            etqp etqpVar = (etqp) entry.getValue();
            enti entiVar = new enti(enre.a);
            arrayList.add(enox.f(enps.f(ensi.h(d().a(account2, etqpVar)), new eiho() { // from class: dbkx
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    Boolean bool = (Boolean) obj;
                    boolean booleanValue = bool.booleanValue();
                    SettingsSyncOneOffService settingsSyncOneOffService = SettingsSyncOneOffService.this;
                    if (booleanValue) {
                        settingsSyncOneOffService.e(5);
                    } else {
                        ((ejhf) ((ejhf) SettingsSyncOneOffService.a.j()).ah((char) 10793)).x("Failed to sync lh controls for account");
                        settingsSyncOneOffService.e(3);
                    }
                    settingsSyncOneOffService.d().f();
                    return bool;
                }
            }, entiVar), Exception.class, new eiho() { // from class: dbky
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    SettingsSyncOneOffService.this.e(4);
                    ((ejhf) ((ejhf) SettingsSyncOneOffService.a.j()).ah((char) 10795)).B("Failed to sync settings with error: %s", SettingsSyncOneOffService.h((Exception) obj));
                    return false;
                }
            }, entiVar));
        }
        return enps.f(ensi.h(ensj.e(arrayList)), new eiho() { // from class: dbkz
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                boolean contains = ((List) obj).contains(false);
                SettingsSyncOneOffService settingsSyncOneOffService = SettingsSyncOneOffService.this;
                if (contains) {
                    settingsSyncOneOffService.f(2);
                    ((ejhf) ((ejhf) SettingsSyncOneOffService.a.j()).ah((char) 10792)).x("Failed to sync ODLH settings for all accounts");
                    return 2;
                }
                settingsSyncOneOffService.f(3);
                ((ejhf) ((ejhf) SettingsSyncOneOffService.a.h()).ah((char) 10791)).x("Synced ODLH settings for all accounts.");
                return 0;
            }
        }, enre.a);
    }
}
