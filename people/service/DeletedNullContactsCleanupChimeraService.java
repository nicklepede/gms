package com.google.android.gms.people.service;

import android.content.ContentProviderOperation;
import android.content.ContentUris;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.RemoteException;
import android.os.SystemClock;
import android.provider.ContactsContract;
import android.provider.Settings;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.a;
import defpackage.byjl;
import defpackage.byki;
import defpackage.bykm;
import defpackage.byko;
import defpackage.ctkm;
import defpackage.ctko;
import defpackage.ctpn;
import defpackage.cuey;
import defpackage.eizo;
import defpackage.ejdf;
import defpackage.ekwv;
import defpackage.ekww;
import defpackage.elan;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fnck;
import defpackage.fnde;
import defpackage.frhy;
import defpackage.frib;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class DeletedNullContactsCleanupChimeraService extends GmsTaskChimeraService {
    public static void d(Context context) {
        int i;
        cuey.f("DeletedNullContactsCleanup", "Canceling the service.");
        ctpn.i(context).s(frib.f(), frib.b(), frib.h(), frib.i(), frib.g(), frib.j(), frib.c());
        try {
            byjl.a(context).c("com.google.android.gms.people.service.DeletedNullContactsCleanupService");
            i = 2;
        } catch (IllegalArgumentException e) {
            cuey.d("DeletedNullContactsCleanup", "Error when canceling the service.", e);
            i = 8;
        }
        ctkm a = ctkm.a();
        fecj v = ekww.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        ekww ekwwVar = (ekww) fecpVar;
        ekwwVar.c = i - 1;
        ekwwVar.b |= 1;
        if (!fecpVar.L()) {
            v.U();
        }
        ekww ekwwVar2 = (ekww) v.b;
        ekwwVar2.f = 3;
        ekwwVar2.b |= 32;
        a.e((ekww) v.Q());
    }

    public static void f(Context context) {
        if (!frib.f()) {
            d(context);
            return;
        }
        if (fnck.k()) {
            g(context);
            return;
        }
        SharedPreferences sharedPreferences = ctpn.i(context).a;
        long b = frib.b();
        boolean h = frib.h();
        boolean i = frib.i();
        boolean g = frib.g();
        boolean j = frib.j();
        long c = frib.c();
        if (sharedPreferences.getBoolean("deleted_null_contacts_cleanup_enabled", false) && sharedPreferences.getLong("deleted_null_contacts_cleanup_periodic_interval_seconds", 0L) == b && sharedPreferences.getBoolean("deleted_null_contacts_cleanup_requires_charging", false) == h && sharedPreferences.getBoolean("deleted_null_contacts_cleanup_requires_device_idle", false) == i && sharedPreferences.getBoolean("deleted_null_contacts_cleanup_persisted", false) == g && sharedPreferences.getBoolean("deleted_null_contacts_cleanup_use_flex", false) == j && (!j || sharedPreferences.getLong("deleted_null_contacts_cleanup_flex_seconds", 0L) == c)) {
            return;
        }
        cuey.f("DeletedNullContactsCleanup", "Flags changed. Will re-scheduling the service.");
        g(context);
    }

    public static void g(Context context) {
        cuey.f("DeletedNullContactsCleanup", "Scheduling the service.");
        int i = 8;
        if (fnck.k()) {
            byko bykoVar = new byko();
            bykoVar.j = "com.google.android.gms.people.service.DeletedNullContactsCleanupService";
            bykoVar.t("DeletedNullContactsCleanupPeriodicTask");
            bykoVar.l(false);
            bykoVar.m((int) frib.a.a().a());
            bykoVar.v(2);
            if (frib.h()) {
                bykoVar.e();
            }
            if (frib.i()) {
                bykoVar.j();
            }
            try {
                byjl.a(context).f(bykoVar.b());
            } catch (IllegalArgumentException e) {
                cuey.d("DeletedNullContactsCleanup", "Error when scheduling the periodic task.", e);
            }
        } else {
            bykm bykmVar = new bykm();
            bykmVar.j = "com.google.android.gms.people.service.DeletedNullContactsCleanupService";
            bykmVar.t("DeletedNullContactsCleanupPeriodicTask");
            bykmVar.y(2, 2);
            bykmVar.x(frib.h() ? 1 : 0, 1);
            bykmVar.i(frib.i());
            bykmVar.v(1);
            bykmVar.p = frib.g();
            long b = frib.b();
            if (fnde.h()) {
                bykmVar.j(byki.a(b));
            } else {
                bykmVar.a = b;
            }
            if (frib.j()) {
                bykmVar.b = frib.c();
            }
            ctpn.i(context).s(frib.f(), frib.b(), frib.h(), frib.i(), frib.g(), frib.j(), frib.c());
            try {
                byjl.a(context).f(bykmVar.b());
            } catch (IllegalArgumentException e2) {
                cuey.d("DeletedNullContactsCleanup", "Error when scheduling the periodic task.", e2);
            }
        }
        i = 2;
        ctkm a = ctkm.a();
        fecj v = ekww.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        ekww ekwwVar = (ekww) fecpVar;
        ekwwVar.c = i - 1;
        ekwwVar.b |= 1;
        if (!fecpVar.L()) {
            v.U();
        }
        ekww ekwwVar2 = (ekww) v.b;
        ekwwVar2.f = 1;
        ekwwVar2.b |= 32;
        a.e((ekww) v.Q());
    }

    private final int h() {
        int count;
        Cursor query = getContentResolver().query(ContactsContract.RawContacts.CONTENT_URI, new String[]{"_id"}, null, null, null);
        if (query == null) {
            count = -1;
        } else {
            try {
                count = query.getCount();
            } finally {
            }
        }
        if (query != null) {
            query.close();
        }
        return count;
    }

    private static boolean j(Cursor cursor) {
        if (cursor != null) {
            return false;
        }
        cuey.c("DeletedNullContactsCleanup", "Failed to query dangling contacts.");
        return true;
    }

    private static long k(boolean z) {
        return z ? SystemClock.elapsedRealtime() : System.currentTimeMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00cf  */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(defpackage.byln r21) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.people.service.DeletedNullContactsCleanupChimeraService.a(byln):int");
    }

    public final void e() {
        try {
            HashMap k = eizo.k(1024);
            Cursor query = getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, new String[]{"_id", "contact_last_updated_timestamp"}, null, null, null);
            if (j(query)) {
                k = null;
            } else if (query.getCount() > 0) {
                int columnIndex = query.getColumnIndex("_id");
                int columnIndex2 = query.getColumnIndex("contact_last_updated_timestamp");
                while (query.moveToNext()) {
                    k.put(Long.valueOf(query.getLong(columnIndex)), Long.valueOf(query.getLong(columnIndex2)));
                }
            }
            if (k != null && !k.isEmpty()) {
                HashSet j = ejdf.j(1024);
                Cursor query2 = getContentResolver().query(ContactsContract.RawContacts.CONTENT_URI, new String[]{"contact_id"}, "deleted!=1", null, null);
                if (j(query2)) {
                    j = null;
                } else if (query2.getCount() > 0) {
                    int columnIndex3 = query2.getColumnIndex("contact_id");
                    while (query2.moveToNext()) {
                        j.add(Long.valueOf(query2.getLong(columnIndex3)));
                    }
                }
                if (j == null || k.isEmpty()) {
                    return;
                }
                ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
                int i = 0;
                for (Map.Entry entry : k.entrySet()) {
                    Long l = (Long) entry.getKey();
                    if (!j.contains(l)) {
                        i++;
                        cuey.f("DeletedNullContactsCleanup", a.m(l, "Dangling contacts id : "));
                        Long l2 = (Long) entry.getValue();
                        if (l2 != null) {
                            ContentProviderOperation.Builder withYieldAllowed = ContentProviderOperation.newDelete(ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, l.longValue())).withYieldAllowed(true);
                            Objects.toString(l2);
                            arrayList.add(withYieldAllowed.withSelection("contact_last_updated_timestamp=".concat(l2.toString()), null).build());
                        }
                    }
                }
                int h = h();
                fecj v = ekwv.a.v();
                if (frhy.a.a().a()) {
                    cuey.f("DeletedNullContactsCleanup", "Start cleanup all dangling contacts");
                    int length = getContentResolver().applyBatch("com.android.contacts", arrayList).length;
                    if (!v.b.L()) {
                        v.U();
                    }
                    ekwv ekwvVar = (ekwv) v.b;
                    ekwvVar.b |= 16;
                    ekwvVar.g = length;
                }
                int h2 = h();
                if (!v.b.L()) {
                    v.U();
                }
                fecp fecpVar = v.b;
                ekwv ekwvVar2 = (ekwv) fecpVar;
                ekwvVar2.b |= 2;
                ekwvVar2.d = h;
                if (!fecpVar.L()) {
                    v.U();
                }
                fecp fecpVar2 = v.b;
                ekwv ekwvVar3 = (ekwv) fecpVar2;
                ekwvVar3.b |= 4;
                ekwvVar3.e = h2;
                if (!fecpVar2.L()) {
                    v.U();
                }
                ekwv ekwvVar4 = (ekwv) v.b;
                ekwvVar4.b |= 1;
                ekwvVar4.c = i;
                if (frib.a.a().f()) {
                    int i2 = Settings.Global.getInt(getApplicationContext().getContentResolver(), "new_contact_aggregator", -1);
                    if (!v.b.L()) {
                        v.U();
                    }
                    ekwv ekwvVar5 = (ekwv) v.b;
                    ekwvVar5.b |= 8;
                    ekwvVar5.f = i2;
                }
                ctkm a = ctkm.a();
                ekwv ekwvVar6 = (ekwv) v.Q();
                fecj v2 = elan.a.v();
                if (!v2.b.L()) {
                    v2.U();
                }
                elan elanVar = (elan) v2.b;
                ekwvVar6.getClass();
                elanVar.x = ekwvVar6;
                elanVar.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                ctko ctkoVar = a.b;
                ctko.b(null, v2);
            }
        } catch (OperationApplicationException | RemoteException unused) {
            cuey.c("DeletedNullContactsCleanup", "Failed to cleanup the dangling contacts");
        }
    }
}
