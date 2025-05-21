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
import defpackage.asej;
import defpackage.asmf;
import defpackage.asnd;
import defpackage.asot;
import defpackage.baha;
import defpackage.bahl;
import defpackage.bahq;
import defpackage.balg;
import defpackage.baln;
import defpackage.bape;
import defpackage.bapg;
import defpackage.bivk;
import defpackage.bry;
import defpackage.ejhf;
import defpackage.ensv;
import defpackage.fnqt;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class FeedbackAsyncChimeraService extends Service {
    private final IBinder e = new bape(this);
    public static final bry a = new bry();
    public static bapg d = null;
    public static final asot b = asot.b("gf_FeedbackAsyncService", asej.FEEDBACK);
    public static final ensv c = new asmf(Integer.MAX_VALUE, 10);

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
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
                            ((ejhf) ((ejhf) FeedbackAsyncChimeraService.b.i()).ah(3546)).x("Failed to get FileDescriptor");
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
                                ((ejhf) ((ejhf) ((ejhf) FeedbackAsyncChimeraService.b.i()).s(e)).ah((char) 3545)).x("Exception while closing report output stream.");
                                return;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            autoCloseOutputStream = autoCloseOutputStream2;
                            ((ejhf) ((ejhf) ((ejhf) FeedbackAsyncChimeraService.b.i()).s(e)).ah(3542)).x("Exception while transferring report.");
                            if (autoCloseOutputStream != null) {
                                try {
                                    autoCloseOutputStream.close();
                                    return;
                                } catch (IOException e3) {
                                    ((ejhf) ((ejhf) ((ejhf) FeedbackAsyncChimeraService.b.i()).s(e3)).ah((char) 3543)).x("Exception while closing report output stream.");
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
                                    ((ejhf) ((ejhf) ((ejhf) FeedbackAsyncChimeraService.b.i()).s(e4)).ah((char) 3544)).x("Exception while closing report output stream.");
                                }
                            }
                            throw th;
                        }
                    }
                    ((ejhf) ((ejhf) FeedbackAsyncChimeraService.b.i()).ah(3541)).x("Failed to get report bytes");
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
            ((ejhf) ((ejhf) b.i()).ah((char) 3549)).x("No binder wrapper found");
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
            ((ejhf) ((ejhf) ((ejhf) b.i()).s(e)).ah((char) 3548)).x("Failed to get FileDescriptor.");
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
                baha.a(errorReport, obtain, 0);
                bArr = obtain.marshall();
                obtain.recycle();
            } catch (NullPointerException e) {
                if (!Build.MODEL.toLowerCase(Locale.ENGLISH).contains("vivo")) {
                    throw e;
                }
                ((ejhf) ((ejhf) ((ejhf) b.i()).s(e)).ah((char) 3551)).x("Got NPE when trying to create report for Vivo.");
                bArr = null;
            }
            if (bArr == null) {
                return;
            }
            Intent startIntent = IntentOperation.getStartIntent(context, ReportTransferIntentOperation.class, "com.google.android.gms.feedback.transfer_report");
            if (startIntent != null) {
                startIntent.putExtra("com.google.android.gms.feedback.REPORT_SIZE_BYTES", bArr.length);
                startIntent.putExtra("com.google.android.gms.feedback.REPORT_BYTES", new BinderWrapper(new bahq(bArr)));
                startIntent.putExtra("com.google.android.gms.feedback.REPORT_WRITER_BINDER_WRAPPER", e(parcelFileDescriptor2));
                context.startService(startIntent);
            }
            context.startService(new Intent().setClassName(context, "com.google.android.gms.feedback.FeedbackAsyncService").putExtra("com.google.android.gms.feedback.REPORT_SIZE_BYTES", bArr.length).putExtra("com.google.android.gms.feedback.REPORT_READER_BINDER", e(parcelFileDescriptor)));
        } catch (IOException e2) {
            ((ejhf) ((ejhf) ((ejhf) b.i()).s(e2)).ah((char) 3562)).x("Exception while creating IPC pipe to transfer report.");
        }
    }

    public static final void d(Context context, ErrorReport errorReport) {
        try {
            baln.c(context, baln.b(errorReport, context));
            OfflineReportSendTaskChimeraService.d(context);
        } catch (balg | IllegalArgumentException e) {
            ((ejhf) ((ejhf) ((ejhf) b.i()).s(e)).ah((char) 3565)).x("invalid report.");
        } catch (IOException e2) {
            ((ejhf) ((ejhf) ((ejhf) b.i()).s(e2)).ah((char) 3564)).x("Error saving report.");
        }
    }

    private static BinderWrapper e(ParcelFileDescriptor parcelFileDescriptor) {
        return new BinderWrapper(new bahl(parcelFileDescriptor));
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
        if (bivk.b(fnqt.c()) && errorReport.B.endsWith("@google.com")) {
            return;
        }
        List h = asnd.h(this, getPackageName());
        int size = h.size();
        for (int i = 0; i < size; i++) {
            if (((Account) h.get(i)).name.equals(str)) {
                return;
            }
        }
        ((ejhf) ((ejhf) b.i()).ah((char) 3547)).x("Requested account was not found on device. Submitting anonymously");
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
            ((ejhf) ((ejhf) b.i()).ah((char) 3554)).x("Empty report!");
            stopSelf();
            return 2;
        }
        ParcelFileDescriptor a2 = a((BinderWrapper) intent.getParcelableExtra("com.google.android.gms.feedback.REPORT_READER_BINDER"));
        if (a2 == null) {
            ((ejhf) ((ejhf) b.i()).ah((char) 3550)).x("Failed to get FileDescriptor");
            autoCloseInputStream = null;
        } else {
            autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(a2);
        }
        if (autoCloseInputStream != null) {
            c.execute(new Runnable() { // from class: bahk
                /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:
                
                    ((defpackage.ejhf) ((defpackage.ejhf) com.google.android.gms.feedback.FeedbackAsyncChimeraService.b.j()).ah(3558)).x("Unexpectedly reached EOF while reading an ErrorReport");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:65:0x006e, code lost:
                
                    r4.close();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:72:0x0072, code lost:
                
                    r3 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:73:0x0073, code lost:
                
                    ((defpackage.ejhf) ((defpackage.ejhf) ((defpackage.ejhf) com.google.android.gms.feedback.FeedbackAsyncChimeraService.b.i()).s(r3)).ah(3557)).x("Exception while closing report input stream.");
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
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.bahk.run():void");
                }
            });
            return 2;
        }
        ((ejhf) ((ejhf) b.i()).ah((char) 3553)).x("Unable to get input stream.");
        stopSelf();
        return 2;
    }
}
