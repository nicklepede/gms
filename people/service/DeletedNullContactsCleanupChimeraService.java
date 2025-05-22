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
import defpackage.casd;
import defpackage.cata;
import defpackage.cate;
import defpackage.catg;
import defpackage.cvts;
import defpackage.cvtu;
import defpackage.cvyt;
import defpackage.cwof;
import defpackage.elmt;
import defpackage.elqm;
import defpackage.enkh;
import defpackage.enki;
import defpackage.ennz;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fpuj;
import defpackage.fpvd;
import defpackage.fubt;
import defpackage.fubw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class DeletedNullContactsCleanupChimeraService extends GmsTaskChimeraService {
    public static void d(Context context) {
        int i;
        cwof.f("DeletedNullContactsCleanup", "Canceling the service.");
        cvyt.i(context).s(fubw.f(), fubw.b(), fubw.h(), fubw.i(), fubw.g(), fubw.j(), fubw.c());
        try {
            casd.a(context).c("com.google.android.gms.people.service.DeletedNullContactsCleanupService");
            i = 2;
        } catch (IllegalArgumentException e) {
            cwof.d("DeletedNullContactsCleanup", "Error when canceling the service.", e);
            i = 8;
        }
        cvts a = cvts.a();
        fgrc v = enki.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        enki enkiVar = (enki) fgriVar;
        enkiVar.c = i - 1;
        enkiVar.b |= 1;
        if (!fgriVar.L()) {
            v.U();
        }
        enki enkiVar2 = (enki) v.b;
        enkiVar2.f = 3;
        enkiVar2.b |= 32;
        a.e((enki) v.Q());
    }

    public static void f(Context context) {
        if (!fubw.f()) {
            d(context);
            return;
        }
        if (fpuj.k()) {
            g(context);
            return;
        }
        SharedPreferences sharedPreferences = cvyt.i(context).a;
        long b = fubw.b();
        boolean h = fubw.h();
        boolean i = fubw.i();
        boolean g = fubw.g();
        boolean j = fubw.j();
        long c = fubw.c();
        if (sharedPreferences.getBoolean("deleted_null_contacts_cleanup_enabled", false) && sharedPreferences.getLong("deleted_null_contacts_cleanup_periodic_interval_seconds", 0L) == b && sharedPreferences.getBoolean("deleted_null_contacts_cleanup_requires_charging", false) == h && sharedPreferences.getBoolean("deleted_null_contacts_cleanup_requires_device_idle", false) == i && sharedPreferences.getBoolean("deleted_null_contacts_cleanup_persisted", false) == g && sharedPreferences.getBoolean("deleted_null_contacts_cleanup_use_flex", false) == j && (!j || sharedPreferences.getLong("deleted_null_contacts_cleanup_flex_seconds", 0L) == c)) {
            return;
        }
        cwof.f("DeletedNullContactsCleanup", "Flags changed. Will re-scheduling the service.");
        g(context);
    }

    public static void g(Context context) {
        cwof.f("DeletedNullContactsCleanup", "Scheduling the service.");
        int i = 8;
        if (fpuj.k()) {
            catg catgVar = new catg();
            catgVar.j = "com.google.android.gms.people.service.DeletedNullContactsCleanupService";
            catgVar.t("DeletedNullContactsCleanupPeriodicTask");
            catgVar.l(false);
            catgVar.m((int) fubw.a.lK().a());
            catgVar.v(2);
            if (fubw.h()) {
                catgVar.e();
            }
            if (fubw.i()) {
                catgVar.j();
            }
            try {
                casd.a(context).f(catgVar.b());
            } catch (IllegalArgumentException e) {
                cwof.d("DeletedNullContactsCleanup", "Error when scheduling the periodic task.", e);
            }
        } else {
            cate cateVar = new cate();
            cateVar.j = "com.google.android.gms.people.service.DeletedNullContactsCleanupService";
            cateVar.t("DeletedNullContactsCleanupPeriodicTask");
            cateVar.y(2, 2);
            cateVar.x(fubw.h() ? 1 : 0, 1);
            cateVar.i(fubw.i());
            cateVar.v(1);
            cateVar.p = fubw.g();
            long b = fubw.b();
            if (fpvd.h()) {
                cateVar.j(cata.a(b));
            } else {
                cateVar.a = b;
            }
            if (fubw.j()) {
                cateVar.b = fubw.c();
            }
            cvyt.i(context).s(fubw.f(), fubw.b(), fubw.h(), fubw.i(), fubw.g(), fubw.j(), fubw.c());
            try {
                casd.a(context).f(cateVar.b());
            } catch (IllegalArgumentException e2) {
                cwof.d("DeletedNullContactsCleanup", "Error when scheduling the periodic task.", e2);
            }
        }
        i = 2;
        cvts a = cvts.a();
        fgrc v = enki.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        enki enkiVar = (enki) fgriVar;
        enkiVar.c = i - 1;
        enkiVar.b |= 1;
        if (!fgriVar.L()) {
            v.U();
        }
        enki enkiVar2 = (enki) v.b;
        enkiVar2.f = 1;
        enkiVar2.b |= 32;
        a.e((enki) v.Q());
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
        cwof.c("DeletedNullContactsCleanup", "Failed to query dangling contacts.");
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
    public final int a(defpackage.cauf r21) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.people.service.DeletedNullContactsCleanupChimeraService.a(cauf):int");
    }

    public final void e() {
        try {
            HashMap k = elmt.k(1024);
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
                HashSet j = elqm.j(1024);
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
                        cwof.f("DeletedNullContactsCleanup", a.m(l, "Dangling contacts id : "));
                        Long l2 = (Long) entry.getValue();
                        if (l2 != null) {
                            ContentProviderOperation.Builder withYieldAllowed = ContentProviderOperation.newDelete(ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, l.longValue())).withYieldAllowed(true);
                            Objects.toString(l2);
                            arrayList.add(withYieldAllowed.withSelection("contact_last_updated_timestamp=".concat(l2.toString()), null).build());
                        }
                    }
                }
                int h = h();
                fgrc v = enkh.a.v();
                if (fubt.a.lK().a()) {
                    cwof.f("DeletedNullContactsCleanup", "Start cleanup all dangling contacts");
                    int length = getContentResolver().applyBatch("com.android.contacts", arrayList).length;
                    if (!v.b.L()) {
                        v.U();
                    }
                    enkh enkhVar = (enkh) v.b;
                    enkhVar.b |= 16;
                    enkhVar.g = length;
                }
                int h2 = h();
                if (!v.b.L()) {
                    v.U();
                }
                fgri fgriVar = v.b;
                enkh enkhVar2 = (enkh) fgriVar;
                enkhVar2.b |= 2;
                enkhVar2.d = h;
                if (!fgriVar.L()) {
                    v.U();
                }
                fgri fgriVar2 = v.b;
                enkh enkhVar3 = (enkh) fgriVar2;
                enkhVar3.b |= 4;
                enkhVar3.e = h2;
                if (!fgriVar2.L()) {
                    v.U();
                }
                enkh enkhVar4 = (enkh) v.b;
                enkhVar4.b |= 1;
                enkhVar4.c = i;
                if (fubw.a.lK().f()) {
                    int i2 = Settings.Global.getInt(getApplicationContext().getContentResolver(), "new_contact_aggregator", -1);
                    if (!v.b.L()) {
                        v.U();
                    }
                    enkh enkhVar5 = (enkh) v.b;
                    enkhVar5.b |= 8;
                    enkhVar5.f = i2;
                }
                cvts a = cvts.a();
                enkh enkhVar6 = (enkh) v.Q();
                fgrc v2 = ennz.a.v();
                if (!v2.b.L()) {
                    v2.U();
                }
                ennz ennzVar = (ennz) v2.b;
                enkhVar6.getClass();
                ennzVar.x = enkhVar6;
                ennzVar.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                cvtu cvtuVar = a.b;
                cvtu.b(null, v2);
            }
        } catch (OperationApplicationException | RemoteException unused) {
            cwof.c("DeletedNullContactsCleanup", "Failed to cleanup the dangling contacts");
        }
    }
}
