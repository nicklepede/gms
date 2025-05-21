package com.google.android.gms.common.appdoctor;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.chimera.ContentProvider;
import defpackage.arhg;
import defpackage.asej;
import defpackage.asng;
import defpackage.asot;
import defpackage.ejhf;
import defpackage.enpf;
import defpackage.tux;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class AppDoctorChimeraProvider extends ContentProvider {
    public static final /* synthetic */ int a = 0;
    private static final asot b = asot.b("AppDoctorProvider", asej.CONTAINER);
    private arhg c;

    public static void a(Context context) {
        asng.H(context, "com.google.android.gms.common.appdoctor.AppDoctorProvider", true);
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
        asng.N(getContext(), string);
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
                bundle2.putByteArray("com.google.android.gms.common.appdoctor.teledoctorconfig", ((tux) ((enpf) this.c.b(string)).u()).r());
                return bundle2;
            } catch (InterruptedException | ExecutionException e) {
                ((ejhf) ((ejhf) ((ejhf) b.j()).s(e)).ah((char) 3125)).x("Failed to get fixes.");
                bundle2.putByteArray("com.google.android.gms.common.appdoctor.teledoctorconfig", tux.a.r());
            }
        } else if (c == 1) {
            String string2 = bundle.getString("com.google.android.gms.common.appdoctor.uuid");
            if (string2 == null) {
                throw new IllegalArgumentException("Need to provide a UUID");
            }
            try {
                ((enpf) this.c.e(getContext(), string, string2)).u();
                return bundle2;
            } catch (InterruptedException | ExecutionException e2) {
                ((ejhf) ((ejhf) ((ejhf) b.j()).s(e2)).ah((char) 3126)).x("Failed to mark fix completed.");
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
                ((enpf) this.c.d(getContext(), string, string3)).u();
                return bundle2;
            } catch (InterruptedException | ExecutionException e3) {
                ((ejhf) ((ejhf) ((ejhf) b.j()).s(e3)).ah((char) 3127)).x("Failed to mark fix attempted.");
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
                ((enpf) this.c.c(getContext(), string4)).u();
                return bundle2;
            } catch (InterruptedException | ExecutionException e4) {
                ((ejhf) ((ejhf) ((ejhf) b.j()).s(e4)).ah((char) 3128)).x("Failed to log fix in progress.");
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
        this.c = arhg.a();
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
