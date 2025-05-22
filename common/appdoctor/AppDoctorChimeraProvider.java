package com.google.android.gms.common.appdoctor;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.chimera.ContentProvider;
import defpackage.atjv;
import defpackage.auid;
import defpackage.aura;
import defpackage.ausn;
import defpackage.eluo;
import defpackage.eqcy;
import defpackage.vqx;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class AppDoctorChimeraProvider extends ContentProvider {
    public static final /* synthetic */ int a = 0;
    private static final ausn b = ausn.b("AppDoctorProvider", auid.CONTAINER);
    private atjv c;

    public static void a(Context context) {
        aura.H(context, "com.google.android.gms.common.appdoctor.AppDoctorProvider", true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.chimera.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        char c;
        if (bundle == null) {
            throw new IllegalArgumentException("No package name in the extras Bundle");
        }
        String string = bundle.getString("com.google.android.common.appdoctor.package_name");
        if (string == null) {
            throw new IllegalArgumentException("No package name in the extras Bundle");
        }
        aura.N(getContext(), string);
        Bundle bundle2 = new Bundle();
        switch (str.hashCode()) {
            case -1563427184:
                if (str.equals("mark_fix_attempted")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 359482338:
                if (str.equals("log_fix_in_progress")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1134395738:
                if (str.equals("get_fixes")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1683592367:
                if (str.equals("mark_fix_completed")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            try {
                bundle2.putByteArray("com.google.android.gms.common.appdoctor.teledoctorconfig", ((vqx) ((eqcy) this.c.b(string)).u()).r());
                return bundle2;
            } catch (InterruptedException | ExecutionException e) {
                ((eluo) ((eluo) ((eluo) b.j()).s(e)).ai((char) 3129)).x("Failed to get fixes.");
                bundle2.putByteArray("com.google.android.gms.common.appdoctor.teledoctorconfig", vqx.a.r());
            }
        } else if (c == 1) {
            String string2 = bundle.getString("com.google.android.gms.common.appdoctor.uuid");
            if (string2 == null) {
                throw new IllegalArgumentException("Need to provide a UUID");
            }
            try {
                ((eqcy) this.c.e(getContext(), string, string2)).u();
                return bundle2;
            } catch (InterruptedException | ExecutionException e2) {
                ((eluo) ((eluo) ((eluo) b.j()).s(e2)).ai((char) 3130)).x("Failed to mark fix completed.");
                if (e2.getCause() instanceof IllegalArgumentException) {
                    throw ((IllegalArgumentException) e2.getCause());
                }
            }
        } else if (c == 2) {
            String string3 = bundle.getString("com.google.android.gms.common.appdoctor.uuid");
            if (string3 == null) {
                throw new IllegalArgumentException("Need to provide a UUID");
            }
            try {
                ((eqcy) this.c.d(getContext(), string, string3)).u();
                return bundle2;
            } catch (InterruptedException | ExecutionException e3) {
                ((eluo) ((eluo) ((eluo) b.j()).s(e3)).ai((char) 3131)).x("Failed to mark fix attempted.");
                if (e3.getCause() instanceof IllegalArgumentException) {
                    throw ((IllegalArgumentException) e3.getCause());
                }
            }
        } else {
            if (c != 3) {
                throw new IllegalArgumentException(String.valueOf(str).concat(" is not a valid method."));
            }
            String string4 = bundle.getString("com.google.android.gms.common.appdoctor.uuid");
            if (string4 == null) {
                throw new IllegalArgumentException("Need to provide a UUID");
            }
            try {
                ((eqcy) this.c.c(getContext(), string4)).u();
                return bundle2;
            } catch (InterruptedException | ExecutionException e4) {
                ((eluo) ((eluo) ((eluo) b.j()).s(e4)).ai((char) 3132)).x("Failed to log fix in progress.");
                if (e4.getCause() instanceof IllegalArgumentException) {
                    throw ((IllegalArgumentException) e4.getCause());
                }
            }
        }
        return bundle2;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("This provider doesn't work like that");
    }

    @Override // com.google.android.chimera.ContentProvider
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.c.i(printWriter);
    }

    @Override // com.google.android.chimera.ContentProvider
    public final String getType(Uri uri) {
        throw new UnsupportedOperationException("This provider doesn't work like that");
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("This provider doesn't work like that");
    }

    @Override // com.google.android.chimera.ContentProvider
    public final boolean onCreate() {
        this.c = atjv.a();
        return true;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new UnsupportedOperationException("This provider doesn't work like that");
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("This provider doesn't work like that");
    }
}
