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
import defpackage.asit;
import defpackage.blmk;
import defpackage.blrd;
import defpackage.blrh;
import defpackage.blrv;
import defpackage.blsb;
import defpackage.byjl;
import defpackage.bykj;
import defpackage.eihn;
import defpackage.eiid;
import defpackage.fmwx;
import defpackage.fpas;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
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
        long e = fpas.a.a().e();
        if (e < 0) {
            blrv.j("Not scheduling contacts sync");
        } else {
            b = true;
            g(context, e, -1, 0);
        }
    }

    private final blrd f() {
        return new blrd(new blmk(this), getContentResolver());
    }

    private static void g(Context context, long j, int i, int i2) {
        blrv.d("Scheduling task in %d s: for updating contacts.", Long.valueOf(j / 1000));
        byjl a2 = byjl.a(context);
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_LAST_RAW_CONTACT_COUNT", i);
        bundle.putInt("EXTRA_ATTEMPT", i2);
        bykj bykjVar = new bykj();
        bykjVar.j = "com.google.android.gms.icing.service.IcingGcmTaskChimeraService";
        bykjVar.e(j, 3600 + j);
        bykjVar.t("UpdateIcingIntentCorpora");
        bykjVar.p = false;
        bykjVar.v(1);
        bykjVar.u = bundle;
        a2.f(bykjVar.b());
    }

    private final void h(String str, String[] strArr) {
        blrv.d("Updating corpora: CONTACTS=%s", str);
        new blsb(getSharedPreferences("icing_internal_corpora_prefs", 0), f(), str, strArr).a();
    }

    private static final boolean i(Intent intent) {
        Uri data = intent.getData();
        if (data == null) {
            return false;
        }
        return "com.android.providers.contacts".equals(data.getSchemeSpecificPart());
    }

    public final void d(int i, int i2) {
        blrv.c(a.j(i2, "maybeUpdateContacts attempt "));
        Cursor b2 = f().b(ContactsContract.RawContacts.CONTENT_URI, null, null, null, null);
        if (b2 == null) {
            blrv.o("Could not fetch contact count - no contacts provider present?");
            return;
        }
        try {
            int count = b2.getCount();
            b2.close();
            fpas fpasVar = fpas.a;
            int f = (int) fpasVar.a().f();
            blrv.e("Curr/Prev: %d/%d", Integer.valueOf(count), Integer.valueOf(i));
            if (count == i || i2 >= f) {
                if (count != i) {
                    blrv.o(a.j(i2, "Number of contacts did not stabilize after attempt "));
                }
                h("FORCE_ALL", null);
                return;
            }
            int i3 = i2 + 1;
            long g = fpasVar.a().g();
            if (g < 0) {
                blrv.j("Not rescheduling contacts sync");
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
            blrv.e("Scheduling alarm in %d s: %s", Long.valueOf(g / 1000), startIntent);
            new asit(this).d("Icing:CorporaIntent", 3, SystemClock.elapsedRealtime() + g, service, null);
        } catch (Throwable th) {
            b2.close();
            throw th;
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            blrv.o("Received null intent.");
            return;
        }
        if (eihn.a(intent.getAction(), "android.intent.action.PACKAGE_CHANGED") && fmwx.c()) {
            return;
        }
        if (eihn.a(intent.getAction(), "com.google.android.gms.ENTIRE_PACKAGE_CHANGED")) {
            intent.setAction("android.intent.action.PACKAGE_CHANGED");
        }
        synchronized (blrh.a) {
            if (blrh.b == null) {
                eiid a2 = blrh.a(this);
                synchronized (blrh.a) {
                    if (blrh.b == null && a2.h()) {
                        blrh.b = Boolean.valueOf(((GetGlobalSearchSourcesCall$GlobalSearchSource) a2.c()).j);
                    }
                }
            }
        }
        if (!blrh.g()) {
            blrv.o("Contacts corpus disabled.");
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
                blrv.c("maybeUpdateContacts extras is null.");
                return;
            } else {
                d(extras.getInt("EXTRA_LAST_RAW_CONTACT_COUNT", -1), extras.getInt("EXTRA_ATTEMPT", 0));
                return;
            }
        }
        String action2 = intent.getAction();
        blrv.k("Received ".concat(intent.toString()));
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
            blrv.o("Received unrecognized action.");
        }
    }
}
