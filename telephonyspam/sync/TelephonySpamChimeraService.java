package com.google.android.gms.telephonyspam.sync;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.asej;
import defpackage.asot;
import defpackage.byln;
import defpackage.dfby;
import defpackage.dfbz;
import defpackage.dfca;
import defpackage.dfdr;
import defpackage.ejhf;
import defpackage.fsld;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class TelephonySpamChimeraService extends GmsTaskChimeraService {
    private static final asot a = asot.b("TelephonySpamChimeraService", asej.TELEPHONY_SPAM);

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        asot asotVar = a;
        ((ejhf) ((ejhf) asotVar.h()).ah((char) 11135)).x("Running Telephony Spam Chimera Service");
        dfca dfcaVar = new dfca(getApplicationContext());
        Bundle bundle = bylnVar.b;
        if (bundle == null) {
            bundle = new Bundle();
        }
        int i = 2;
        if (bundle.getDouble("Action") == 1.0d) {
            fsld fsldVar = fsld.a;
            if (fsldVar.a().C()) {
                ((ejhf) ((ejhf) asotVar.h()).ah((char) 11138)).x("Cleaning SIP Header local table of old entries");
                Context applicationContext = getApplicationContext();
                asot asotVar2 = dfdr.a;
                if (dfby.f(applicationContext, 1).isEmpty()) {
                    ((ejhf) ((ejhf) dfdr.a.h()).ah((char) 11117)).x("Call spam module disabled. Skipping cleaning cache sip header table.");
                } else {
                    dfbz.e(applicationContext);
                    long currentTimeMillis = System.currentTimeMillis() - TimeUnit.HOURS.toMillis(fsldVar.a().i());
                    try {
                        dfbz.a.getWritableDatabase().delete("sip_header_table", "timestamp < ?", new String[]{String.valueOf(currentTimeMillis)});
                    } catch (SQLiteException unused) {
                    }
                }
                ((ejhf) ((ejhf) a.h()).ah((char) 11139)).x("Syncing Call Spam List");
                Bundle bundle2 = bylnVar.b;
                bundle2.putInt("SpamList Type", 0);
                i = dfdr.a(new byln(bylnVar.a, bundle2), dfcaVar, getApplicationContext());
            }
            if (fsld.a.a().D()) {
                ((ejhf) ((ejhf) a.h()).ah((char) 11137)).x("Syncing Sms Spam List");
                Bundle bundle3 = bylnVar.b;
                bundle3.putInt("SpamList Type", 1);
                return dfdr.a(new byln(bylnVar.a, bundle3), new dfca(getApplicationContext()), getApplicationContext());
            }
        }
        return i;
    }
}
