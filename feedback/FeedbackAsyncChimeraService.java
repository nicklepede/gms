package com.google.android.gms.feedback;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.Service;
import com.google.android.gms.common.internal.BinderWrapper;
import defpackage.auid;
import defpackage.aupz;
import defpackage.auqx;
import defpackage.ausn;
import defpackage.bckw;
import defpackage.bclh;
import defpackage.bclm;
import defpackage.bcpc;
import defpackage.bcpj;
import defpackage.bcta;
import defpackage.bctc;
import defpackage.bkzz;
import defpackage.bsj;
import defpackage.eluo;
import defpackage.eqgo;
import defpackage.fqjc;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FeedbackAsyncChimeraService extends Service {
    private final IBinder e = new bcta(this);
    public static final bsj a = new bsj();
    public static bctc d = null;
    public static final ausn b = ausn.b("gf_FeedbackAsyncService", auid.FEEDBACK);
    public static final eqgo c = new aupz(Integer.MAX_VALUE, 10);

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class ReportTransferIntentOperation extends IntentOperation {
        @Override // com.google.android.chimera.IntentOperation
        public final void onHandleIntent(Intent intent) {
            ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = null;
            try {
                try {
                    BinderWrapper binderWrapper = (BinderWrapper) intent.getParcelableExtra("com.google.android.gms.feedback.REPORT_BYTES");
                    int intExtra = intent.getIntExtra("com.google.android.gms.feedback.REPORT_SIZE_BYTES", 0);
                    if (binderWrapper != null && intExtra != 0) {
                        Parcel obtain = Parcel.obtain();
                        Parcel obtain2 = Parcel.obtain();
                        binderWrapper.a.transact(0, obtain2, obtain, 0);
                        obtain2.recycle();
                        byte[] bArr = new byte[intExtra];
                        obtain.readByteArray(bArr);
                        obtain.recycle();
                        ParcelFileDescriptor a = FeedbackAsyncChimeraService.a((BinderWrapper) intent.getParcelableExtra("com.google.android.gms.feedback.REPORT_WRITER_BINDER_WRAPPER"));
                        if (a == null) {
                            ((eluo) ((eluo) FeedbackAsyncChimeraService.b.i()).ai(3550)).x("Failed to get FileDescriptor");
                            return;
                        }
                        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream2 = new ParcelFileDescriptor.AutoCloseOutputStream(a);
                        try {
                            autoCloseOutputStream2.write(bArr);
                            autoCloseOutputStream2.flush();
                            try {
                                autoCloseOutputStream2.close();
                                return;
                            } catch (IOException e) {
                                ((eluo) ((eluo) ((eluo) FeedbackAsyncChimeraService.b.i()).s(e)).ai((char) 3549)).x("Exception while closing report output stream.");
                                return;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            autoCloseOutputStream = autoCloseOutputStream2;
                            ((eluo) ((eluo) ((eluo) FeedbackAsyncChimeraService.b.i()).s(e)).ai(3546)).x("Exception while transferring report.");
                            if (autoCloseOutputStream != null) {
                                try {
                                    autoCloseOutputStream.close();
                                    return;
                                } catch (IOException e3) {
                                    ((eluo) ((eluo) ((eluo) FeedbackAsyncChimeraService.b.i()).s(e3)).ai((char) 3547)).x("Exception while closing report output stream.");
                                    return;
                                }
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                            autoCloseOutputStream = autoCloseOutputStream2;
                            if (autoCloseOutputStream != null) {
                                try {
                                    autoCloseOutputStream.close();
                                } catch (IOException e4) {
                                    ((eluo) ((eluo) ((eluo) FeedbackAsyncChimeraService.b.i()).s(e4)).ai((char) 3548)).x("Exception while closing report output stream.");
                                }
                            }
                            throw th;
                        }
                    }
                    ((eluo) ((eluo) FeedbackAsyncChimeraService.b.i()).ai(3545)).x("Failed to get report bytes");
                } catch (Exception e5) {
                    e = e5;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    static ParcelFileDescriptor a(BinderWrapper binderWrapper) {
        if (binderWrapper == null) {
            ((eluo) ((eluo) b.i()).ai((char) 3553)).x("No binder wrapper found");
            return null;
        }
        IBinder iBinder = binderWrapper.a;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            iBinder.transact(0, obtain2, obtain, 0);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            obtain2.recycle();
            return parcelFileDescriptor;
        } catch (RemoteException e) {
            ((eluo) ((eluo) ((eluo) b.i()).s(e)).ai((char) 3552)).x("Failed to get FileDescriptor.");
            return null;
        }
    }

    public static void c(Context context, ErrorReport errorReport) {
        byte[] bArr;
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
            ParcelFileDescriptor parcelFileDescriptor2 = createPipe[1];
            try {
                Parcel obtain = Parcel.obtain();
                bckw.a(errorReport, obtain, 0);
                bArr = obtain.marshall();
                obtain.recycle();
            } catch (NullPointerException e) {
                if (!Build.MODEL.toLowerCase(Locale.ENGLISH).contains("vivo")) {
                    throw e;
                }
                ((eluo) ((eluo) ((eluo) b.i()).s(e)).ai((char) 3555)).x("Got NPE when trying to create report for Vivo.");
                bArr = null;
            }
            if (bArr == null) {
                return;
            }
            Intent startIntent = IntentOperation.getStartIntent(context, ReportTransferIntentOperation.class, "com.google.android.gms.feedback.transfer_report");
            if (startIntent != null) {
                startIntent.putExtra("com.google.android.gms.feedback.REPORT_SIZE_BYTES", bArr.length);
                startIntent.putExtra("com.google.android.gms.feedback.REPORT_BYTES", new BinderWrapper(new bclm(bArr)));
                startIntent.putExtra("com.google.android.gms.feedback.REPORT_WRITER_BINDER_WRAPPER", e(parcelFileDescriptor2));
                context.startService(startIntent);
            }
            context.startService(new Intent().setClassName(context, "com.google.android.gms.feedback.FeedbackAsyncService").putExtra("com.google.android.gms.feedback.REPORT_SIZE_BYTES", bArr.length).putExtra("com.google.android.gms.feedback.REPORT_READER_BINDER", e(parcelFileDescriptor)));
        } catch (IOException e2) {
            ((eluo) ((eluo) ((eluo) b.i()).s(e2)).ai((char) 3566)).x("Exception while creating IPC pipe to transfer report.");
        }
    }

    public static final void d(Context context, ErrorReport errorReport) {
        try {
            bcpj.c(context, bcpj.b(errorReport, context));
            OfflineReportSendTaskChimeraService.d(context);
        } catch (bcpc | IllegalArgumentException e) {
            ((eluo) ((eluo) ((eluo) b.i()).s(e)).ai((char) 3569)).x("invalid report.");
        } catch (IOException e2) {
            ((eluo) ((eluo) ((eluo) b.i()).s(e2)).ai((char) 3568)).x("Error saving report.");
        }
    }

    private static BinderWrapper e(ParcelFileDescriptor parcelFileDescriptor) {
        return new BinderWrapper(new bclh(parcelFileDescriptor));
    }

    public final void b(ErrorReport errorReport) {
        String str = errorReport.B;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.toLowerCase(Locale.ENGLISH).equals("anonymous")) {
            errorReport.B = "";
            return;
        }
        if (bkzz.b(fqjc.c()) && errorReport.B.endsWith("@google.com")) {
            return;
        }
        List h = auqx.h(this, getPackageName());
        int size = h.size();
        for (int i = 0; i < size; i++) {
            if (((Account) h.get(i)).name.equals(str)) {
                return;
            }
        }
        ((eluo) ((eluo) b.i()).ai((char) 3551)).x("Requested account was not found on device. Submitting anonymously");
        errorReport.B = "";
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return this.e;
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        final ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream;
        if (intent == null) {
            stopSelf();
            return 2;
        }
        final int intExtra = intent.getIntExtra("com.google.android.gms.feedback.REPORT_SIZE_BYTES", 0);
        if (intExtra == 0) {
            ((eluo) ((eluo) b.i()).ai((char) 3558)).x("Empty report!");
            stopSelf();
            return 2;
        }
        ParcelFileDescriptor a2 = a((BinderWrapper) intent.getParcelableExtra("com.google.android.gms.feedback.REPORT_READER_BINDER"));
        if (a2 == null) {
            ((eluo) ((eluo) b.i()).ai((char) 3554)).x("Failed to get FileDescriptor");
            autoCloseInputStream = null;
        } else {
            autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(a2);
        }
        if (autoCloseInputStream != null) {
            c.execute(new Runnable() { // from class: bclg
                /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:
                
                    ((defpackage.eluo) ((defpackage.eluo) com.google.android.gms.feedback.FeedbackAsyncChimeraService.b.j()).ai(3562)).x("Unexpectedly reached EOF while reading an ErrorReport");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:65:0x006e, code lost:
                
                    r4.close();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:72:0x0072, code lost:
                
                    r3 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:73:0x0073, code lost:
                
                    ((defpackage.eluo) ((defpackage.eluo) ((defpackage.eluo) com.google.android.gms.feedback.FeedbackAsyncChimeraService.b.i()).s(r3)).ai(3561)).x("Exception while closing report input stream.");
                 */
                /* JADX WARN: Removed duplicated region for block: B:18:0x00a5 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x00a6  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 322
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.bclg.run():void");
                }
            });
            return 2;
        }
        ((eluo) ((eluo) b.i()).ai((char) 3557)).x("Unable to get input stream.");
        stopSelf();
        return 2;
    }
}
