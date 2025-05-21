package com.google.android.gms.locationsharingreporter.service;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.chimera.modules.locationsharingreporter.AppContextProvider;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import defpackage.asej;
import defpackage.asnd;
import defpackage.asot;
import defpackage.caym;
import defpackage.cbbn;
import defpackage.cbbx;
import defpackage.ebfs;
import defpackage.eigb;
import defpackage.eiid;
import defpackage.ejhf;
import defpackage.enpf;
import defpackage.fpxh;
import defpackage.unx;
import defpackage.uny;
import defpackage.uoh;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class GcmReceiverChimeraService extends TracingIntentService {
    private static final asot a = asot.b("LSR", asej.LOCATION_SHARING_REPORTER);

    public GcmReceiverChimeraService() {
        super("GcmReceiverChimeraService");
    }

    private static final eiid b(String str) {
        String str2;
        Context a2 = AppContextProvider.a();
        for (Account account : asnd.h(a2, a2.getPackageName())) {
            try {
                str2 = account.name;
                String str3 = uny.a;
            } catch (IOException | unx e) {
                ((ejhf) ((ejhf) ((ejhf) a.j()).s(e)).ah((char) 5690)).x("Failed to retrieve account ID");
            }
            if (str.equals(uoh.e(a2, str2))) {
                return eiid.j(account);
            }
            continue;
        }
        return eigb.a;
    }

    private static final void c(Intent intent) {
        cbbx cbbxVar;
        eiid i = eiid.i(intent.getStringExtra("gaia_id"));
        if (!i.h()) {
            ((ejhf) ((ejhf) a.j()).ah((char) 5697)).x("Received GCM intent doesn't have related gaia ID, returning");
            cbbn.d(null, ebfs.STATUS_GCM_PING_FAILED_MISSING_OBFUSCATED_GAIA_ID);
            return;
        }
        eiid i2 = eiid.i(intent.getStringExtra("ovenfresh_id"));
        if (!i2.h()) {
            ((ejhf) ((ejhf) a.j()).ah((char) 5696)).x("Received ovenfresh GCM intent doesn't have necessary extras, returning");
            cbbn.d(null, ebfs.STATUS_GCM_PING_FAILED_MISSING_NECESSARY_EXTRAS);
            return;
        }
        eiid b = b((String) i.c());
        try {
            synchronized (cbbx.b) {
                if (cbbx.c == null) {
                    cbbx.c = new cbbx();
                }
                cbbxVar = cbbx.c;
            }
            cbbxVar.a(b, (String) i2.c(), !fpxh.J() ? false : ((String) eiid.i(intent.getStringExtra("requested_super_fresh")).e("")).equals("1")).get(fpxh.a.a().v(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e = e;
            ((ejhf) ((ejhf) ((ejhf) a.j()).s(e)).ah((char) 5694)).x("Failed to handle ovenfresh");
            cbbn.k(null, 12);
        } catch (CancellationException e2) {
            ((ejhf) ((ejhf) ((ejhf) a.j()).s(e2)).ah((char) 5695)).x("Failed to handle ovenfresh");
            cbbn.k(null, 17);
        } catch (ExecutionException e3) {
            e = e3;
            ((ejhf) ((ejhf) ((ejhf) a.j()).s(e)).ah((char) 5694)).x("Failed to handle ovenfresh");
            cbbn.k(null, 12);
        } catch (TimeoutException e4) {
            ((ejhf) ((ejhf) ((ejhf) a.j()).s(e4)).ah((char) 5693)).x("Failed to handle ovenfresh");
            cbbn.k(null, 11);
        }
    }

    private static final void d(Intent intent) {
        if (!fpxh.a.a().aq()) {
            ((ejhf) ((ejhf) a.j()).ah((char) 5702)).x("Ignoring received refresh reporting state GCM ping, GCM handling is disabled");
            return;
        }
        cbbn.d(null, ebfs.STATUS_REFRESH_REPORTING_STATE_GCM_PING_RECEIVED);
        eiid i = eiid.i(intent.getStringExtra("gaia_id"));
        if (!i.h()) {
            ((ejhf) ((ejhf) a.j()).ah((char) 5701)).x("Refresh reporting state GCM ping doesn't have necessary extras, ignoring");
            cbbn.d(null, ebfs.STATUS_REFRESH_REPORTING_MISSING_OBFUSCATED_GAIA_ID);
            return;
        }
        eiid b = b((String) i.c());
        if (!b.h()) {
            ((ejhf) ((ejhf) a.j()).ah((char) 5700)).x("Failed to find account for which reporting refresh was requested in GCM ping, returning");
            cbbn.d(null, ebfs.STATUS_REFRESH_REPORTING_STATE_FAILED_TO_FIND_ACCOUNT);
            return;
        }
        String str = ((Account) b.c()).name;
        try {
            ((ejhf) ((ejhf) a.h()).ah(5698)).x("Refresh reporting state after GCM ping from backend");
            ((enpf) caym.a().c(str)).v(fpxh.k(), TimeUnit.MILLISECONDS);
            cbbn.d(str, ebfs.STATUS_REFRESH_REPORTING_STATE_SUCCEEDED);
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
            ((ejhf) ((ejhf) ((ejhf) a.i()).s(e)).ah((char) 5699)).x("Failed to refresh reporting state for account after GCM ping");
            cbbn.d(str, ebfs.STATUS_REFRESH_REPORTING_STATE_FAILED_DURING_EXECUTION);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0233 A[Catch: all -> 0x023a, TRY_LEAVE, TryCatch #1 {all -> 0x023a, blocks: (B:3:0x0012, B:5:0x001e, B:10:0x002f, B:11:0x003e, B:13:0x0046, B:15:0x004e, B:18:0x0056, B:19:0x005d, B:21:0x0063, B:34:0x009f, B:35:0x00a7, B:37:0x00b3, B:39:0x00f1, B:41:0x00f7, B:43:0x00fd, B:45:0x0103, B:48:0x010b, B:50:0x0143, B:51:0x014c, B:53:0x0152, B:54:0x015b, B:56:0x018a, B:58:0x019c, B:61:0x0202, B:62:0x01a4, B:64:0x01aa, B:67:0x01b0, B:68:0x01b8, B:74:0x01ca, B:76:0x01e4, B:78:0x01ee, B:79:0x01fd, B:84:0x0207, B:85:0x021b, B:86:0x022f, B:87:0x0233), top: B:2:0x0012 }] */
    @Override // com.google.android.gms.framework.tracing.wrapper.TracingIntentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.content.Intent r20) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.locationsharingreporter.service.GcmReceiverChimeraService.a(android.content.Intent):void");
    }
}
