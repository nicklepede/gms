package com.google.android.gms.telephonyspam.sync;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.dhne;
import defpackage.dhnf;
import defpackage.dhng;
import defpackage.dhox;
import defpackage.eluo;
import defpackage.fvge;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class TelephonySpamChimeraService extends GmsTaskChimeraService {
    private static final ausn a = ausn.b("TelephonySpamChimeraService", auid.TELEPHONY_SPAM);

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        ausn ausnVar = a;
        ((eluo) ((eluo) ausnVar.h()).ai((char) 11138)).x("Running Telephony Spam Chimera Service");
        dhng dhngVar = new dhng(getApplicationContext());
        Bundle bundle = caufVar.b;
        if (bundle == null) {
            bundle = new Bundle();
        }
        int i = 2;
        if (bundle.getDouble("Action") == 1.0d) {
            fvge fvgeVar = fvge.a;
            if (fvgeVar.lK().C()) {
                ((eluo) ((eluo) ausnVar.h()).ai((char) 11141)).x("Cleaning SIP Header local table of old entries");
                Context applicationContext = getApplicationContext();
                ausn ausnVar2 = dhox.a;
                if (dhne.f(applicationContext, 1).isEmpty()) {
                    ((eluo) ((eluo) dhox.a.h()).ai((char) 11120)).x("Call spam module disabled. Skipping cleaning cache sip header table.");
                } else {
                    dhnf.e(applicationContext);
                    long currentTimeMillis = System.currentTimeMillis() - TimeUnit.HOURS.toMillis(fvgeVar.lK().i());
                    try {
                        dhnf.a.getWritableDatabase().delete("sip_header_table", "timestamp < ?", new String[]{String.valueOf(currentTimeMillis)});
                    } catch (SQLiteException unused) {
                    }
                }
                ((eluo) ((eluo) a.h()).ai((char) 11142)).x("Syncing Call Spam List");
                Bundle bundle2 = caufVar.b;
                bundle2.putInt("SpamList Type", 0);
                i = dhox.a(new cauf(caufVar.a, bundle2), dhngVar, getApplicationContext());
            }
            if (fvge.a.lK().D()) {
                ((eluo) ((eluo) a.h()).ai((char) 11140)).x("Syncing Sms Spam List");
                Bundle bundle3 = caufVar.b;
                bundle3.putInt("SpamList Type", 1);
                return dhox.a(new cauf(caufVar.a, bundle3), new dhng(getApplicationContext()), getApplicationContext());
            }
        }
        return i;
    }
}
