package com.google.android.gms.subscribedfeeds;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Binder;
import android.os.Process;
import com.google.android.chimera.ContentProvider;
import defpackage.asxe;
import defpackage.auid;
import defpackage.ausn;
import defpackage.caqb;
import defpackage.caqh;
import defpackage.dhfi;
import defpackage.dhgn;
import defpackage.dzzw;
import defpackage.eaab;
import defpackage.elhz;
import defpackage.eluo;
import defpackage.etry;
import defpackage.etrz;
import defpackage.fvfp;
import j$.util.Objects;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class GmsSubscribedFeedsChimeraProvider extends ContentProvider {
    private static final ausn a = ausn.b("GmsSubscribedFeeds", auid.SUBSCRIBED_FEEDS);
    private static final elhz b = elhz.K("com.google.android.gms", "com.google.android.gsf");
    private UriMatcher c;
    private ContentResolver d;
    private final ScheduledExecutorService e = caqb.b.h(1, caqh.LOW_POWER);
    private dhfi f;

    private static Uri a(Uri uri) {
        return uri.buildUpon().authority("subscribedfeeds").build();
    }

    private static boolean b(String str) {
        if (Binder.getCallingUid() != Process.myUid()) {
            return false;
        }
        return b.contains(str);
    }

    private final boolean c(int i) {
        String callingPackage = getCallingPackage();
        if (!b(callingPackage)) {
            try {
                asxe.d(getContext()).e(callingPackage);
            } catch (SecurityException e) {
                ((eluo) ((eluo) ((eluo) a.i()).s(e)).ai((char) 11042)).x("Signature check failed. The calling package is not google signed.");
                return false;
            }
        }
        boolean b2 = b(callingPackage);
        String str = i != 1 ? i != 2 ? i != 3 ? "QUERY" : "DELETE" : "UPDATE" : "INSERT";
        dhfi dhfiVar = this.f;
        if (dhfiVar != null) {
            ((eaab) dhfiVar.b.lK()).b(str, true != b2 ? "OPERATION_BLOCKED" : "OPERATION_ALLOWED");
        }
        if (b2 && !Objects.equals(callingPackage, "com.google.android.gms")) {
            eluo eluoVar = (eluo) ((eluo) a.j()).ai(11044);
            etry etryVar = etry.NO_USER_DATA;
            eluoVar.P("Unsupported API %s called by package %s", new etrz(etryVar, str), new etrz(etryVar, callingPackage));
            dhfi dhfiVar2 = this.f;
            if (dhfiVar2 != null) {
                ((eaab) dhfiVar2.c.lK()).b(str, callingPackage);
                return true;
            }
        }
        return b2;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        Arrays.toString(strArr);
        try {
            if (c(3)) {
                return this.d.delete(a(uri), str, strArr);
            }
            return 0;
        } catch (SQLiteException | UnsupportedOperationException e) {
            ((eluo) ((eluo) ((eluo) a.i()).s(e)).ai((char) 11036)).x("Could not perform the delete operation.");
            return 0;
        }
    }

    @Override // com.google.android.chimera.ContentProvider
    public final String getType(Uri uri) {
        ausn ausnVar = a;
        ((eluo) ((eluo) ausnVar.h()).ai((char) 11037)).B("GetType: Uri: %s", uri);
        if (this.c == null) {
            UriMatcher uriMatcher = new UriMatcher(-1);
            this.c = uriMatcher;
            uriMatcher.addURI("com.google.android.gms.subscribedfeeds", "feeds", 1);
            this.c.addURI("com.google.android.gms.subscribedfeeds", "feeds/#", 2);
            this.c.addURI("com.google.android.gms.subscribedfeeds", "deleted_feeds", 3);
            this.c.addURI("com.google.android.gms.subscribedfeeds", "accounts", 4);
        }
        int match = this.c.match(uri);
        if (match == 1) {
            return "vnd.android.cursor.dir/com.google.android.gms.subscribedfeeds.feeds";
        }
        if (match == 2) {
            return "vnd.android.cursor.item/com.google.android.gms.subscribedfeeds.feeds";
        }
        ((eluo) ((eluo) ausnVar.i()).ai((char) 11038)).x("Unknown URL.");
        return "";
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        try {
            if (c(1)) {
                return this.d.insert(a(uri), contentValues);
            }
            return null;
        } catch (SQLiteException | UnsupportedOperationException e) {
            ((eluo) ((eluo) ((eluo) a.i()).s(e)).ai((char) 11040)).x("Could not perform the insert operation.");
            return null;
        }
    }

    @Override // com.google.android.chimera.ContentProvider
    public final boolean onCreate() {
        this.d = getContext().getContentResolver();
        try {
            Context createPackageContext = getContext().createPackageContext("com.google.android.gsf", 0);
            createPackageContext.getDatabasePath("subscribedfeeds.db");
            new dhgn(createPackageContext);
        } catch (Exception e) {
            ((eluo) ((eluo) ((eluo) a.i()).s(e)).ai((char) 11047)).B("Can't find package: %s", "com.google.android.gsf");
        }
        dhfi dhfiVar = new dhfi(this.e, new dzzw(getContext(), "STREAMZ_SUBSCRIBEDFEEDS"));
        this.f = dhfiVar;
        dhfiVar.a(fvfp.b());
        return true;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Arrays.toString(strArr);
        Arrays.toString(strArr2);
        try {
            if (c(4)) {
                return this.d.query(a(uri), strArr, str, strArr2, str2);
            }
            return null;
        } catch (SQLiteException | UnsupportedOperationException e) {
            ((eluo) ((eluo) ((eluo) a.i()).s(e)).ai((char) 11049)).x("Could not process the query.");
            return null;
        }
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        try {
            if (c(2)) {
                return this.d.update(a(uri), contentValues, str, strArr);
            }
            return 0;
        } catch (SQLiteException | UnsupportedOperationException e) {
            ((eluo) ((eluo) ((eluo) a.i()).s(e)).ai((char) 11051)).x("Could not perform the update operation.");
            return 0;
        }
    }
}
