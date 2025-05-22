package com.google.android.gms.icing.proxy;

import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.provider.ContactsContract;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$GlobalSearchSource;
import defpackage.a;
import defpackage.aumn;
import defpackage.bntc;
import defpackage.bnxv;
import defpackage.bnxz;
import defpackage.bnyn;
import defpackage.bnyt;
import defpackage.casd;
import defpackage.catb;
import defpackage.ekus;
import defpackage.ekvi;
import defpackage.fpow;
import defpackage.frtz;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class UpdateIcingCorporaIntentOperation extends IntentOperation {
    public static final ContentValues a = new ContentValues();
    private static boolean b = false;

    public static Intent a(Context context) {
        return c(context, "DELTA");
    }

    public static Intent b(Context context) {
        return c(context, "MAYBE");
    }

    public static Intent c(Context context, String str) {
        Intent startIntent = IntentOperation.getStartIntent(context, UpdateIcingCorporaIntentOperation.class, "com.google.android.gms.icing.proxy.ACTION_UPDATE");
        if (startIntent != null) {
            startIntent.putExtra("KEY_CONTACTS_UPDATE_MODE", str);
        }
        return startIntent;
    }

    static void e(Context context) {
        long e = frtz.a.lK().e();
        if (e < 0) {
            bnyn.j("Not scheduling contacts sync");
        } else {
            b = true;
            g(context, e, -1, 0);
        }
    }

    private final bnxv f() {
        return new bnxv(new bntc(this), getContentResolver());
    }

    private static void g(Context context, long j, int i, int i2) {
        bnyn.d("Scheduling task in %d s: for updating contacts.", Long.valueOf(j / 1000));
        casd a2 = casd.a(context);
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_LAST_RAW_CONTACT_COUNT", i);
        bundle.putInt("EXTRA_ATTEMPT", i2);
        catb catbVar = new catb();
        catbVar.j = "com.google.android.gms.icing.service.IcingGcmTaskChimeraService";
        catbVar.e(j, 3600 + j);
        catbVar.t("UpdateIcingIntentCorpora");
        catbVar.p = false;
        catbVar.v(1);
        catbVar.u = bundle;
        a2.f(catbVar.b());
    }

    private final void h(String str, String[] strArr) {
        bnyn.d("Updating corpora: CONTACTS=%s", str);
        new bnyt(getSharedPreferences("icing_internal_corpora_prefs", 0), f(), str, strArr).a();
    }

    private static final boolean i(Intent intent) {
        Uri data = intent.getData();
        if (data == null) {
            return false;
        }
        return "com.android.providers.contacts".equals(data.getSchemeSpecificPart());
    }

    public final void d(int i, int i2) {
        bnyn.c(a.j(i2, "maybeUpdateContacts attempt "));
        Cursor b2 = f().b(ContactsContract.RawContacts.CONTENT_URI, null, null, null, null);
        if (b2 == null) {
            bnyn.o("Could not fetch contact count - no contacts provider present?");
            return;
        }
        try {
            int count = b2.getCount();
            b2.close();
            frtz frtzVar = frtz.a;
            int f = (int) frtzVar.lK().f();
            bnyn.e("Curr/Prev: %d/%d", Integer.valueOf(count), Integer.valueOf(i));
            if (count == i || i2 >= f) {
                if (count != i) {
                    bnyn.o(a.j(i2, "Number of contacts did not stabilize after attempt "));
                }
                h("FORCE_ALL", null);
                return;
            }
            int i3 = i2 + 1;
            long g = frtzVar.lK().g();
            if (g < 0) {
                bnyn.j("Not rescheduling contacts sync");
                return;
            }
            if (b) {
                g(this, g, count, i3);
                return;
            }
            Intent startIntent = IntentOperation.getStartIntent(this, UpdateIcingCorporaIntentOperation.class, "com.google.android.gms.icing.proxy.ACTION_MAYBE_UPDATE_CONTACTS");
            if (startIntent == null) {
                return;
            }
            startIntent.putExtra("EXTRA_ATTEMPT", i3);
            startIntent.putExtra("EXTRA_LAST_RAW_CONTACT_COUNT", count);
            PendingIntent service = PendingIntent.getService(this, 0, startIntent, 134217728);
            bnyn.e("Scheduling alarm in %d s: %s", Long.valueOf(g / 1000), startIntent);
            new aumn(this).d("Icing:CorporaIntent", 3, SystemClock.elapsedRealtime() + g, service, null);
        } catch (Throwable th) {
            b2.close();
            throw th;
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            bnyn.o("Received null intent.");
            return;
        }
        if (ekus.a(intent.getAction(), "android.intent.action.PACKAGE_CHANGED") && fpow.c()) {
            return;
        }
        if (ekus.a(intent.getAction(), "com.google.android.gms.ENTIRE_PACKAGE_CHANGED")) {
            intent.setAction("android.intent.action.PACKAGE_CHANGED");
        }
        synchronized (bnxz.a) {
            if (bnxz.b == null) {
                ekvi a2 = bnxz.a(this);
                synchronized (bnxz.a) {
                    if (bnxz.b == null && a2.h()) {
                        bnxz.b = Boolean.valueOf(((GetGlobalSearchSourcesCall$GlobalSearchSource) a2.c()).j);
                    }
                }
            }
        }
        if (!bnxz.g()) {
            bnyn.o("Contacts corpus disabled.");
            return;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.icing.proxy.ACTION_UPDATE".equals(action)) {
            h(intent.getStringExtra("KEY_CONTACTS_UPDATE_MODE"), intent.getStringArrayExtra("KEY_CONTACTS_ARGS"));
            return;
        }
        if ("com.google.android.gms.icing.proxy.ACTION_MAYBE_UPDATE_CONTACTS".equals(action)) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                bnyn.c("maybeUpdateContacts extras is null.");
                return;
            } else {
                d(extras.getInt("EXTRA_LAST_RAW_CONTACT_COUNT", -1), extras.getInt("EXTRA_ATTEMPT", 0));
                return;
            }
        }
        String action2 = intent.getAction();
        bnyn.k("Received ".concat(intent.toString()));
        if ("android.intent.action.PACKAGE_CHANGED".equals(action2)) {
            if (i(intent)) {
                h("FORCE_ALL", null);
            }
        } else if ("android.intent.action.PACKAGE_DATA_CLEARED".equals(action2)) {
            if (i(intent)) {
                h("FORCE_ALL", null);
            }
        } else if ("android.provider.Contacts.DATABASE_CREATED".equals(action2)) {
            e(this);
        } else if ("android.intent.action.LOCALE_CHANGED".equals(action2)) {
            h("FORCE_ALL", null);
        } else {
            bnyn.o("Received unrecognized action.");
        }
    }
}
