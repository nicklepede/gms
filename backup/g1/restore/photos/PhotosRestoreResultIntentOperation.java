package com.google.android.gms.backup.g1.restore.photos;

import android.content.Intent;
import android.os.Looper;
import android.widget.Toast;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.R;
import com.google.android.gms.backup.g1.restore.photos.PhotosRestoreResultIntentOperation;
import com.google.android.libraries.photos.restore.api.StatusResult;
import defpackage.ajgv;
import defpackage.byhr;
import defpackage.dvwy;
import defpackage.eitj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class PhotosRestoreResultIntentOperation extends IntentOperation {
    private static final eitj a = eitj.p(dvwy.RESTORE_COMPLETE_FAILED, dvwy.RESTORE_COMPLETE_CANCELLED, dvwy.RESTORE_ERROR_DENIED_PERMISSION, dvwy.RESTORE_ERROR_RETRY, dvwy.RESTORE_ERROR_UNKNOWN);
    private static final eitj b = eitj.l(dvwy.RESTORE_COMPLETE_SUCCESS);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        StatusResult statusResult;
        dvwy dvwyVar = null;
        if (intent != null && (statusResult = (StatusResult) intent.getParcelableExtra("com.google.android.libraries.photos.restore.EXTRA_STATUS_RESULT")) != null) {
            dvwyVar = statusResult.a;
        }
        if (a.contains(dvwyVar)) {
            new byhr(Looper.getMainLooper()).post(new Runnable() { // from class: ajds
                @Override // java.lang.Runnable
                public final void run() {
                    PhotosRestoreResultIntentOperation photosRestoreResultIntentOperation = PhotosRestoreResultIntentOperation.this;
                    Toast.makeText(photosRestoreResultIntentOperation, photosRestoreResultIntentOperation.getString(R.string.g1_restore_failed), 1).show();
                }
            });
        } else if (b.contains(dvwyVar)) {
            ajgv.a.e(this, true);
        }
    }
}
