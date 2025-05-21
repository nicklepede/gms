package com.google.android.gms.thunderbird.config.provider;

import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.chimera.ContentProvider;
import com.google.android.gms.thunderbird.config.provider.EmergencyConfigChimeraContentProvider;
import com.google.android.gms.thunderbird.state.DeviceState;
import defpackage.asni;
import defpackage.dfuq;
import defpackage.dfvc;
import defpackage.dfvn;
import defpackage.dfvt;
import defpackage.dfvu;
import defpackage.dfvw;
import defpackage.dfzr;
import defpackage.eiih;
import defpackage.eitj;
import defpackage.eivv;
import defpackage.ejhf;
import defpackage.febw;
import defpackage.fecp;
import defpackage.feep;
import defpackage.fsnb;
import java.io.IOException;
import java.text.ParseException;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class EmergencyConfigChimeraContentProvider extends ContentProvider {
    public static final /* synthetic */ int a = 0;
    private static final UriMatcher b;
    private dfvn c;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        b = uriMatcher;
        uriMatcher.addURI("com.google.android.gms.thunderbird.config", "mock", 1);
        uriMatcher.addURI("com.google.android.gms.thunderbird.config", "mock/*", 2);
        uriMatcher.addURI("com.google.android.gms.thunderbird.config", "real", 3);
        uriMatcher.addURI("com.google.android.gms.thunderbird.config", "real/*", 4);
    }

    private final Iterable a(Iterable iterable) {
        if (!fsnb.a.a().T()) {
            return iterable;
        }
        final Context context = getContext();
        final eitj c = DeviceState.c(context);
        return eivv.d(iterable, new eiih() { // from class: dfvr
            @Override // defpackage.eiih
            public final boolean a(Object obj) {
                boolean f;
                dfvc dfvcVar = (dfvc) obj;
                int i = EmergencyConfigChimeraContentProvider.a;
                int i2 = 0;
                do {
                    eitj eitjVar = eitj.this;
                    if (i2 >= ((ejcb) eitjVar).c) {
                        return false;
                    }
                    f = dfvcVar.f(context, (DeviceState) eitjVar.get(i2));
                    i2++;
                } while (!f);
                return true;
            }
        });
    }

    private static String b(Uri uri, String str) {
        String path = uri.getPath();
        if (path != null) {
            if (path.length() > str.length() + 2) {
                return path.substring(str.length() + 2);
            }
        }
        throw new IllegalArgumentException("Unsupported URI: ".concat(String.valueOf(String.valueOf(uri))));
    }

    private final void c() {
        if (TextUtils.isEmpty(fsnb.n()) || asni.e(fsnb.n().split(","), getCallingPackage())) {
            return;
        }
        throw new SecurityException("Permission Denial: " + getCallingPackage() + " from pid=" + Binder.getCallingPid() + ", uid=" + Binder.getCallingUid() + " not allowed");
    }

    private final void d() {
        for (String str : Build.VERSION.SDK_INT >= 28 ? dfvw.b : dfvw.a) {
            getContext().enforceCallingPermission(str, null);
        }
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        int size;
        d();
        int match = b.match(uri);
        if (match == 1) {
            dfvn dfvnVar = this.c;
            Context context = getContext();
            CopyOnWriteArrayList copyOnWriteArrayList = dfvnVar.a;
            synchronized (copyOnWriteArrayList) {
                dfvnVar.c(context);
                size = copyOnWriteArrayList.size();
                ((ejhf) ((ejhf) dfzr.a.h()).ah(11258)).x("clearing all mock configs");
                copyOnWriteArrayList.clear();
                dfvnVar.g(context);
                dfvnVar.e(dfvu.a);
            }
            return size;
        }
        if (match != 2) {
            throw new IllegalArgumentException("Unsupported URI: ".concat(String.valueOf(String.valueOf(uri))));
        }
        String b2 = b(uri, "mock");
        dfvn dfvnVar2 = this.c;
        Context context2 = getContext();
        CopyOnWriteArrayList copyOnWriteArrayList2 = dfvnVar2.a;
        synchronized (copyOnWriteArrayList2) {
            dfvnVar2.c(context2);
            for (int i = 0; i < copyOnWriteArrayList2.size(); i++) {
                if (((dfvc) copyOnWriteArrayList2.get(i)).a.equals(b2)) {
                    ((ejhf) ((ejhf) dfzr.a.h()).ah(11268)).B("removing mock config: %s", b2);
                    copyOnWriteArrayList2.remove(i);
                    dfvnVar2.g(context2);
                    dfvnVar2.e(dfvu.a.buildUpon().appendPath(b2).build());
                    return 1;
                }
            }
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0152  */
    @Override // com.google.android.chimera.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dump(java.io.FileDescriptor r6, java.io.PrintWriter r7, java.lang.String[] r8) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.thunderbird.config.provider.EmergencyConfigChimeraContentProvider.dump(java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override // com.google.android.chimera.ContentProvider
    public final String getType(Uri uri) {
        int match = b.match(uri);
        if (match == 1) {
            return "vnd.android.cursor.dir/vnd.com.google.android.gms.thunderbird.config";
        }
        if (match == 2) {
            return "vnd.android.cursor.item/vnd.com.google.android.gms.thunderbird.config";
        }
        if (match == 3) {
            return "vnd.android.cursor.dir/vnd.com.google.android.gms.thunderbird.config";
        }
        if (match != 4) {
            return null;
        }
        return "vnd.android.cursor.item/vnd.com.google.android.gms.thunderbird.config";
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        byte[] asByteArray;
        d();
        if (b.match(uri) != 1) {
            throw new IllegalArgumentException("Unsupported URI: ".concat(String.valueOf(String.valueOf(uri))));
        }
        if (contentValues == null || (asByteArray = contentValues.getAsByteArray("config_proto")) == null) {
            throw new IllegalArgumentException("No values provided");
        }
        try {
            dfuq dfuqVar = dfuq.a;
            int length = asByteArray.length;
            febw febwVar = febw.a;
            feep feepVar = feep.a;
            fecp y = fecp.y(dfuqVar, asByteArray, 0, length, febw.a);
            fecp.M(y);
            dfuq dfuqVar2 = (dfuq) y;
            if (this.c.h(getContext(), dfuqVar2, false)) {
                return uri.buildUpon().appendPath(dfuqVar2.c).build();
            }
            return null;
        } catch (IOException | ParseException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    @Override // com.google.android.chimera.ContentProvider
    public final boolean onCreate() {
        dfvn a2 = dfvn.a();
        this.c = a2;
        a2.registerObserver((ContentObserver) new dfvt(this));
        return true;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final void onTrimMemory(int i) {
        if (i >= 60) {
            dfvn.f();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ef  */
    @Override // com.google.android.chimera.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.database.Cursor query(android.net.Uri r17, java.lang.String[] r18, java.lang.String r19, java.lang.String[] r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.thunderbird.config.provider.EmergencyConfigChimeraContentProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        byte[] asByteArray;
        d();
        if (b.match(uri) != 2) {
            throw new IllegalArgumentException("Unsupported URI: ".concat(String.valueOf(String.valueOf(uri))));
        }
        String b2 = b(uri, "mock");
        if (contentValues == null || (asByteArray = contentValues.getAsByteArray("config_proto")) == null) {
            throw new IllegalArgumentException("No values provided");
        }
        try {
            dfuq dfuqVar = dfuq.a;
            int length = asByteArray.length;
            febw febwVar = febw.a;
            feep feepVar = feep.a;
            fecp y = fecp.y(dfuqVar, asByteArray, 0, length, febw.a);
            fecp.M(y);
            dfuq dfuqVar2 = (dfuq) y;
            if (b2.equals(dfuqVar2.c)) {
                return this.c.h(getContext(), dfuqVar2, true) ? 1 : 0;
            }
            throw new IllegalArgumentException("Config name must match updated config name");
        } catch (IOException | ParseException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    @Override // com.google.android.chimera.ContentProvider
    public final void shutdown() {
    }
}
