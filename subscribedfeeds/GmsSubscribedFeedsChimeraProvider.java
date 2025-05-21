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
import defpackage.aqup;
import defpackage.asej;
import defpackage.asot;
import defpackage.byhj;
import defpackage.byhp;
import defpackage.deuf;
import defpackage.devk;
import defpackage.dxnw;
import defpackage.dxob;
import defpackage.eiuu;
import defpackage.ejhf;
import defpackage.erdc;
import defpackage.erdd;
import defpackage.fskq;
import j$.util.Objects;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class GmsSubscribedFeedsChimeraProvider extends ContentProvider {
    private static final asot a = asot.b("GmsSubscribedFeeds", asej.SUBSCRIBED_FEEDS);
    private static final eiuu b = eiuu.K("com.google.android.gms", "com.google.android.gsf");
    private UriMatcher c;
    private ContentResolver d;
    private final ScheduledExecutorService e = byhj.b.h(1, byhp.LOW_POWER);
    private deuf f;

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
                aqup.d(getContext()).e(callingPackage);
            } catch (SecurityException e) {
                ((ejhf) ((ejhf) ((ejhf) a.i()).s(e)).ah((char) 11039)).x("Signature check failed. The calling package is not google signed.");
                return false;
            }
        }
        boolean b2 = b(callingPackage);
        String str = i != 1 ? i != 2 ? i != 3 ? "QUERY" : "DELETE" : "UPDATE" : "INSERT";
        deuf deufVar = this.f;
        if (deufVar != null) {
            ((dxob) deufVar.b.a()).b(str, true != b2 ? "OPERATION_BLOCKED" : "OPERATION_ALLOWED");
        }
        if (b2 && !Objects.equals(callingPackage, "com.google.android.gms")) {
            ejhf ejhfVar = (ejhf) ((ejhf) a.j()).ah(11041);
            erdc erdcVar = erdc.NO_USER_DATA;
            ejhfVar.P("Unsupported API %s called by package %s", new erdd(erdcVar, str), new erdd(erdcVar, callingPackage));
            deuf deufVar2 = this.f;
            if (deufVar2 != null) {
                ((dxob) deufVar2.c.a()).b(str, callingPackage);
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
            ((ejhf) ((ejhf) ((ejhf) a.i()).s(e)).ah((char) 11033)).x("Could not perform the delete operation.");
            return 0;
        }
    }

    @Override // com.google.android.chimera.ContentProvider
    public final String getType(Uri uri) {
        asot asotVar = a;
        ((ejhf) ((ejhf) asotVar.h()).ah((char) 11034)).B("GetType: Uri: %s", uri);
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
        ((ejhf) ((ejhf) asotVar.i()).ah((char) 11035)).x("Unknown URL.");
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
            ((ejhf) ((ejhf) ((ejhf) a.i()).s(e)).ah((char) 11037)).x("Could not perform the insert operation.");
            return null;
        }
    }

    @Override // com.google.android.chimera.ContentProvider
    public final boolean onCreate() {
        this.d = getContext().getContentResolver();
        try {
            Context createPackageContext = getContext().createPackageContext("com.google.android.gsf", 0);
            createPackageContext.getDatabasePath("subscribedfeeds.db");
            new devk(createPackageContext);
        } catch (Exception e) {
            ((ejhf) ((ejhf) ((ejhf) a.i()).s(e)).ah((char) 11044)).B("Can't find package: %s", "com.google.android.gsf");
        }
        deuf deufVar = new deuf(this.e, new dxnw(getContext(), "STREAMZ_SUBSCRIBEDFEEDS"));
        this.f = deufVar;
        deufVar.a(fskq.b());
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
            ((ejhf) ((ejhf) ((ejhf) a.i()).s(e)).ah((char) 11046)).x("Could not process the query.");
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
            ((ejhf) ((ejhf) ((ejhf) a.i()).s(e)).ah((char) 11048)).x("Could not perform the update operation.");
            return 0;
        }
    }
}
