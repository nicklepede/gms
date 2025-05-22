package com.google.android.gms.icing.proxy;

import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.UriMatcher;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import android.util.Pair;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.appdatasearch.CorpusStatus;
import defpackage.a;
import defpackage.aury;
import defpackage.avmr;
import defpackage.bnvy;
import defpackage.bnxe;
import defpackage.bnxj;
import defpackage.bnxx;
import defpackage.bnyb;
import defpackage.bnyc;
import defpackage.bnyd;
import defpackage.bnyn;
import defpackage.dhlw;
import defpackage.dhmr;
import defpackage.elsn;
import defpackage.frtk;
import defpackage.vpq;
import defpackage.vpr;
import defpackage.vpt;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class InternalIcingCorporaChimeraProvider extends bnvy {
    static final Uri.Builder a;
    public static final Uri b;
    private vpr c;
    private UriMatcher d;
    private AtomicBoolean e;

    static {
        Uri.Builder authority = new Uri.Builder().scheme("content").authority("com.google.android.gms.icing.proxy");
        a = authority;
        b = authority.path("contacts").build();
        authority.path("request_indexing").build();
        authority.path("dump").build();
        authority.path("diagnose").build();
    }

    @Override // defpackage.bnvy
    protected final vpq a() {
        return h();
    }

    @Override // defpackage.bnvz
    protected final vpr d() {
        if (this.c == null) {
            this.c = new vpr(bnyd.d());
        }
        return this.c;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.bnvz
    public final String e() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.bnvz
    public final void f() {
        this.d = new UriMatcher(-1);
        this.e = new AtomicBoolean();
        this.d.addURI("com.google.android.gms.icing.proxy", "contacts", 1);
        this.d.addURI("com.google.android.gms.icing.proxy", "request_indexing", 2);
        this.d.addURI("com.google.android.gms.icing.proxy", "dump", 3);
        this.d.addURI("com.google.android.gms.icing.proxy", "diagnose", 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bnvz
    public final Cursor g(Uri uri, String[] strArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        CorpusStatus corpusStatus;
        bnyn.l("query(uri=%s)", uri);
        int callingUid = Binder.getCallingUid();
        if (callingUid != Process.myUid()) {
            throw new SecurityException(avmr.f(uri, callingUid, "No access to query ", " for uid "));
        }
        int match = this.d.match(uri);
        int i6 = 4;
        int i7 = 2;
        if (match != 3) {
            if (match != 4) {
                throw new IllegalArgumentException("illegal uri: ".concat(String.valueOf(String.valueOf(uri))));
            }
            if (!this.e.compareAndSet(false, true)) {
                bnyn.o("Diagnose returning early - external call pending");
                return null;
            }
            try {
                MatrixCursor matrixCursor = new MatrixCursor(new String[]{"corpus", "diagnostic"});
                elsn listIterator = bnyb.e.listIterator();
                while (listIterator.hasNext()) {
                    bnyb bnybVar = (bnyb) listIterator.next();
                    bnyc h = h();
                    vpt a2 = bnybVar.a();
                    try {
                    } catch (RuntimeException e) {
                        e = e;
                        i4 = i6;
                    }
                    if (!Arrays.asList(h.c.b).contains(a2)) {
                        i4 = i6;
                        throw new IllegalArgumentException("The table " + a2.a + " does not have a registered CorpusTableMapping.");
                    }
                    i4 = i6;
                    try {
                        dhlw a3 = h.b.a(h.a.getPackageName(), a2.a);
                        try {
                            dhmr.n(a3);
                            corpusStatus = (CorpusStatus) a3.i();
                        } catch (InterruptedException | ExecutionException unused) {
                            Log.e("AppDataSearchHelper", "Couldn't fetch status for corpus ".concat(a2.a));
                        }
                    } catch (RuntimeException e2) {
                        e = e2;
                    }
                    if (corpusStatus.a) {
                        long a4 = h.a(a2);
                        long j = corpusStatus.b;
                        if (a4 != 0) {
                            if (a4 < j) {
                                Log.e("AppDataSearchHelper", a.E(j, a4, "Local highest seqno=", " less than lastIndexedSeqno="));
                                i5 = i4;
                            } else if (a4 != j) {
                                i5 = j == 0 ? 2 : 1;
                            }
                        }
                        i5 = 0;
                    } else {
                        i5 = 3;
                    }
                    matrixCursor.addRow(new Object[]{bnybVar.c(), Integer.valueOf(i5)});
                    i6 = i4;
                    e = e2;
                    bnyn.i(e, "Exception thrown from diagnoseTable", new Object[0]);
                    if (!aury.o()) {
                        throw e;
                    }
                    i5 = i4;
                    matrixCursor.addRow(new Object[]{bnybVar.c(), Integer.valueOf(i5)});
                    i6 = i4;
                }
                return matrixCursor;
            } finally {
                this.e.set(false);
            }
        }
        boolean equals = strArr != null ? strArr[0].equals(String.valueOf(Boolean.TRUE)) : false;
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.println("InternalIcingCorporaProvider:");
        bnyc h2 = h();
        SQLiteDatabase readableDatabase = h2.getReadableDatabase();
        bnxx.b(printWriter, "  ", "Max seqnos:");
        elsn listIterator2 = bnyb.e.listIterator();
        while (listIterator2.hasNext()) {
            vpt a5 = ((bnyb) listIterator2.next()).a();
            String str = a5.a;
            Long valueOf = Long.valueOf(h2.a(a5));
            int i8 = i7;
            Object[] objArr = new Object[5];
            objArr[0] = "  ";
            objArr[1] = "  ";
            objArr[i8] = str;
            objArr[3] = ": ";
            objArr[4] = valueOf;
            bnxx.b(printWriter, objArr);
            i7 = i8;
        }
        int i9 = i7;
        bnxx.b(printWriter, new Object[0]);
        bnxe bnxeVar = h2.e;
        if (bnxeVar != null) {
            String str2 = "ContactsHelper (" + (true != equals ? "simple" : "extensive") + "):";
            Object[] objArr2 = new Object[i9];
            objArr2[0] = "  ";
            objArr2[1] = str2;
            bnxx.b(printWriter, objArr2);
            try {
                bnxx.b(printWriter, "    ", "Contact count: " + bnxj.a(readableDatabase, "contacts"));
                bnxx.b(printWriter, "    ", "Email count: " + bnxj.a(readableDatabase, "emails"));
                bnxx.b(printWriter, "    ", "Phone count: " + bnxj.a(readableDatabase, "phones"));
                bnxx.b(printWriter, "    ", "Postal count: " + bnxj.a(readableDatabase, "postals"));
                i = 1;
                try {
                    bnxx.b(printWriter, "    ", "Last delta update timestamp: ", bnxx.a(((bnxj) bnxeVar).g().getLong("key_last_contacts_delta_delete_timestamp", 0L)));
                    bnxx.b(printWriter, "    ", "Last delta delete timestamp: ", bnxx.a(((bnxj) bnxeVar).g().getLong("key_last_contacts_delta_update_timestamp", 0L)));
                    bnxx.b(printWriter, new Object[0]);
                    if (equals) {
                        bnxx.c(readableDatabase, printWriter, "contacts");
                        bnxx.c(readableDatabase, printWriter, "emails");
                        bnxx.c(readableDatabase, printWriter, "phones");
                        bnxx.c(readableDatabase, printWriter, "postals");
                    }
                    i2 = 0;
                    i3 = 2;
                } catch (Exception e3) {
                    e = e3;
                    String concat = "Exception while dumping state".concat(e.toString());
                    i3 = 2;
                    Object[] objArr3 = new Object[2];
                    i2 = 0;
                    objArr3[0] = "    ";
                    objArr3[i] = concat;
                    bnxx.b(printWriter, objArr3);
                    Context context = getContext();
                    ContentValues contentValues = UpdateIcingCorporaIntentOperation.a;
                    Object[] objArr4 = new Object[i3];
                    objArr4[i2] = "  ";
                    objArr4[i] = "Alarm status: ";
                    bnxx.b(printWriter, objArr4);
                    Intent startIntent = IntentOperation.getStartIntent(context, UpdateIcingCorporaIntentOperation.class, "com.google.android.gms.icing.proxy.ACTION_MAYBE_UPDATE_CONTACTS");
                    if (startIntent == null) {
                        Boolean valueOf2 = Boolean.valueOf((startIntent == null || PendingIntent.getService(context, i2, startIntent, 536870912) == null) ? i2 : i);
                        Object[] objArr5 = new Object[3];
                        objArr5[i2] = "    ";
                        objArr5[i] = "Contacts pending: ";
                        objArr5[2] = valueOf2;
                        bnxx.b(printWriter, objArr5);
                        MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{"dump"});
                        Object[] objArr6 = new Object[i];
                        objArr6[i2] = stringWriter.toString();
                        matrixCursor2.addRow(objArr6);
                        return matrixCursor2;
                    }
                    Boolean valueOf22 = Boolean.valueOf((startIntent == null || PendingIntent.getService(context, i2, startIntent, 536870912) == null) ? i2 : i);
                    Object[] objArr52 = new Object[3];
                    objArr52[i2] = "    ";
                    objArr52[i] = "Contacts pending: ";
                    objArr52[2] = valueOf22;
                    bnxx.b(printWriter, objArr52);
                    MatrixCursor matrixCursor22 = new MatrixCursor(new String[]{"dump"});
                    Object[] objArr62 = new Object[i];
                    objArr62[i2] = stringWriter.toString();
                    matrixCursor22.addRow(objArr62);
                    return matrixCursor22;
                }
            } catch (Exception e4) {
                e = e4;
                i = 1;
            }
        } else {
            i = 1;
            i2 = 0;
            i3 = i9;
            Object[] objArr7 = new Object[i3];
            objArr7[0] = "  ";
            objArr7[1] = "ContactsHelper not loaded (potentially failed).";
            bnxx.b(printWriter, objArr7);
        }
        Context context2 = getContext();
        ContentValues contentValues2 = UpdateIcingCorporaIntentOperation.a;
        Object[] objArr42 = new Object[i3];
        objArr42[i2] = "  ";
        objArr42[i] = "Alarm status: ";
        bnxx.b(printWriter, objArr42);
        Intent startIntent2 = IntentOperation.getStartIntent(context2, UpdateIcingCorporaIntentOperation.class, "com.google.android.gms.icing.proxy.ACTION_MAYBE_UPDATE_CONTACTS");
        Boolean valueOf222 = Boolean.valueOf((startIntent2 == null || PendingIntent.getService(context2, i2, startIntent2, 536870912) == null) ? i2 : i);
        Object[] objArr522 = new Object[3];
        objArr522[i2] = "    ";
        objArr522[i] = "Contacts pending: ";
        objArr522[2] = valueOf222;
        bnxx.b(printWriter, objArr522);
        MatrixCursor matrixCursor222 = new MatrixCursor(new String[]{"dump"});
        Object[] objArr622 = new Object[i];
        objArr622[i2] = stringWriter.toString();
        matrixCursor222.addRow(objArr622);
        return matrixCursor222;
    }

    final bnyc h() {
        return bnyc.m(getContext());
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        Pair h;
        bnyn.l("update(uri=%s)", uri);
        int callingUid = Binder.getCallingUid();
        if (callingUid != Process.myUid()) {
            throw new SecurityException(avmr.f(uri, callingUid, "No access to update ", " for uid "));
        }
        int match = this.d.match(uri);
        if (match == -1) {
            throw new IllegalArgumentException("invalid uri: ".concat(String.valueOf(String.valueOf(uri))));
        }
        boolean z = true;
        if (match == 2) {
            if (!this.e.compareAndSet(false, true)) {
                bnyn.o("Request indexing returning early - external call pending");
                return 0;
            }
            try {
                vpt[] d = bnyd.d();
                for (int i = 0; i < 4; i++) {
                    vpt vptVar = d[i];
                    bnyn.c("Requesting indexing: ".concat(String.valueOf(String.valueOf(vptVar))));
                    z &= h().o(vptVar);
                }
                if (!z) {
                    bnyn.o("Request indexing failed");
                }
                return 0;
            } finally {
                this.e.set(false);
            }
        }
        bnyc h2 = h();
        SQLiteDatabase k = h2.k();
        if (k == null) {
            return -1;
        }
        if (match != 1) {
            throw new IllegalStateException("unhandled match for uri ".concat(String.valueOf(String.valueOf(uri))));
        }
        Resources resources = getContext().getResources();
        if (h2.l() == null) {
            bnyn.c("ContactsHelper failed to load.");
            h = new Pair(-1, false);
        } else {
            if ("delta".equals(str)) {
                h = ((bnxj) h2.l()).h(k, resources, true, null);
            } else if ("ids".equals(str) && strArr != null) {
                HashSet hashSet = new HashSet();
                for (String str2 : strArr) {
                    hashSet.add(Long.valueOf(Long.parseLong(str2)));
                }
                h = ((bnxj) h2.l()).h(k, resources, false, hashSet);
            } else {
                if (str != null) {
                    throw new IllegalArgumentException("unrecognized selection");
                }
                h = ((bnxj) h2.l()).h(k, resources, false, null);
            }
            h2.n(((Integer) h.first).intValue(), bnyd.a.b());
            h2.n(((Integer) h.first).intValue(), bnyd.b.b());
            h2.n(((Integer) h.first).intValue(), bnyd.c.b());
            h2.n(((Integer) h.first).intValue(), bnyd.d.b());
        }
        Integer num = (Integer) h.first;
        int intValue = num.intValue();
        Boolean bool = (Boolean) h.second;
        boolean booleanValue = bool.booleanValue();
        boolean ae = frtk.a.lK().ae();
        bnyn.n("InternalIcingCorporaChimeraProvider.update numUpdate = %d isSignificant = %b G.sendContactChangedBroadcastNoUpdates = %b", num, bool, Boolean.valueOf(ae));
        if (intValue <= 0 && !ae) {
            bnyn.k("InternalIcingCorporaChimeraProvider doesn't send contact changed broadcast");
            return intValue;
        }
        bnyn.k("InternalIcingCorporaChimeraProvider sending contact changed broadcast");
        getContext().sendBroadcast(new Intent("com.google.android.gms.icing.action.CONTACT_CHANGED").setPackage("com.google.android.gms").putExtra("com.google.android.gms.icing.extra.isSignificant", booleanValue));
        return intValue;
    }
}
