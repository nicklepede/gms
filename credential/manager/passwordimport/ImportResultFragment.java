package com.google.android.gms.credential.manager.passwordimport;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.provider.DocumentsContract;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.credential.manager.passwordimport.ImportResultFragment;
import defpackage.avnd;
import defpackage.avri;
import defpackage.avrn;
import defpackage.avro;
import defpackage.avrp;
import defpackage.avrq;
import defpackage.avrr;
import defpackage.avta;
import defpackage.avto;
import defpackage.awzk;
import defpackage.dg;
import defpackage.fuuw;
import defpackage.fuux;
import defpackage.fuuy;
import defpackage.fvaq;
import defpackage.fvbi;
import defpackage.fvbo;
import defpackage.fvcc;
import defpackage.jqx;
import defpackage.qfp;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class ImportResultFragment extends avto {
    public avnd a;

    public static final avta y(fuuw fuuwVar) {
        return (avta) fuuwVar.a();
    }

    public static final awzk z(final String str) {
        return new awzk(R.layout.pwm_import_result_header, new fvaq() { // from class: avrh
            @Override // defpackage.fvaq
            public final Object a(Object obj) {
                View view = (View) obj;
                fvbo.f(view, "$this$SingleViewAdapter");
                ((TextView) view.findViewById(R.id.pwm_import_status_file_hint)).setText(view.getResources().getString(R.string.pwm_import_result_file_hint, str));
                return fuvs.a;
            }
        });
    }

    @Override // defpackage.dg
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        fvbo.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.pwm_import_result, viewGroup, false);
        dg h = ((qfp) requireContext()).getSupportFragmentManager().h("PWMImportScreenFragment");
        fvbo.c(h);
        fuuw a = fuux.a(fuuy.c, new avrn(new avri(h)));
        int i = fvcc.a;
        final jqx jqxVar = new jqx(new fvbi(avta.class), new avro(a), new avrq(this, a), new avrp(a));
        final RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.pwm_import_result_recycler_view);
        y(jqxVar).r.g(getViewLifecycleOwner(), new avrr(new fvaq() { // from class: avrj
            @Override // defpackage.fvaq
            public final Object a(Object obj) {
                avst avstVar = (avst) obj;
                final String b = ImportResultFragment.y(jqxVar).b();
                boolean z = avstVar instanceof avsq;
                RecyclerView recyclerView2 = RecyclerView.this;
                if (z) {
                    fvbo.c(recyclerView2);
                    final avsq avsqVar = (avsq) avstVar;
                    recyclerView2.ah(new qs(ImportResultFragment.z(b), new awzk(R.layout.pwm_import_status, new fvaq() { // from class: avrg
                        @Override // defpackage.fvaq
                        public final Object a(Object obj2) {
                            View view = (View) obj2;
                            fvbo.f(view, "$this$SingleViewAdapter");
                            ((TextView) view.findViewById(R.id.pwm_import_status_file_name)).setText(b);
                            TextView textView = (TextView) view.findViewById(R.id.pwm_import_status_valid_passwords_count);
                            Resources resources = textView.getResources();
                            int i2 = avsqVar.a;
                            textView.setText(resources.getQuantityString(R.plurals.pwm_import_result_imported_passwords_count, i2, Integer.valueOf(i2)));
                            textView.setVisibility(0);
                            view.findViewById(R.id.pwm_import_status_ok_icon).setVisibility(0);
                            return fuvs.a;
                        }
                    })));
                } else if (avstVar instanceof avss) {
                    fvbo.c(recyclerView2);
                    final avss avssVar = (avss) avstVar;
                    recyclerView2.ah(new qs(ImportResultFragment.z(b), new awzk(R.layout.pwm_import_status, new fvaq() { // from class: avrb
                        @Override // defpackage.fvaq
                        public final Object a(Object obj2) {
                            View view = (View) obj2;
                            fvbo.f(view, "$this$SingleViewAdapter");
                            ((TextView) view.findViewById(R.id.pwm_import_status_file_name)).setText(b);
                            TextView textView = (TextView) view.findViewById(R.id.pwm_import_status_valid_passwords_count);
                            Resources resources = textView.getResources();
                            avss avssVar2 = avssVar;
                            List list = avssVar2.a;
                            textView.setText(resources.getQuantityString(R.plurals.pwm_import_result_imported_passwords_count, list.size(), Integer.valueOf(list.size())));
                            textView.setVisibility(0);
                            TextView textView2 = (TextView) view.findViewById(R.id.pwm_import_status_invalid_passwords_count);
                            Resources resources2 = textView2.getResources();
                            List list2 = avssVar2.b;
                            textView2.setText(resources2.getQuantityString(R.plurals.pwm_import_result_not_imported_passwords_count, list2.size(), Integer.valueOf(list2.size())));
                            textView2.setVisibility(0);
                            view.findViewById(R.id.pwm_import_status_warning_icon).setVisibility(0);
                            return fuvs.a;
                        }
                    }), new awzk(R.layout.pwm_import_password_list_header, new fvaq() { // from class: avrc
                        @Override // defpackage.fvaq
                        public final Object a(Object obj2) {
                            View view = (View) obj2;
                            fvbo.f(view, "$this$SingleViewAdapter");
                            ((TextView) view.findViewById(R.id.pwm_import_password_list_header)).setText(view.getResources().getString(R.string.pwm_import_result_not_imported_passwords_header));
                            return fuvs.a;
                        }
                    }), new avtl(avssVar.b), new awzk(), new awzk(R.layout.pwm_import_password_list_header, new fvaq() { // from class: avrd
                        @Override // defpackage.fvaq
                        public final Object a(Object obj2) {
                            View view = (View) obj2;
                            fvbo.f(view, "$this$SingleViewAdapter");
                            ((TextView) view.findViewById(R.id.pwm_import_password_list_header)).setText(view.getResources().getString(R.string.pwm_import_result_imported_passwords_header));
                            return fuvs.a;
                        }
                    }), new avtl(avssVar.a)));
                } else {
                    if (!(avstVar instanceof avsr)) {
                        throw new fuuz();
                    }
                    fvbo.c(recyclerView2);
                    final avsr avsrVar = (avsr) avstVar;
                    recyclerView2.ah(new qs(ImportResultFragment.z(b), new awzk(R.layout.pwm_import_status, new fvaq() { // from class: avrf
                        @Override // defpackage.fvaq
                        public final Object a(Object obj2) {
                            View view = (View) obj2;
                            fvbo.f(view, "$this$SingleViewAdapter");
                            ((TextView) view.findViewById(R.id.pwm_import_status_file_name)).setText(b);
                            TextView textView = (TextView) view.findViewById(R.id.pwm_import_status_invalid_passwords_count);
                            Resources resources = textView.getResources();
                            int i2 = avsrVar.a;
                            textView.setText(resources.getQuantityString(R.plurals.pwm_import_result_not_imported_passwords_count, i2, Integer.valueOf(i2)));
                            textView.setVisibility(0);
                            view.findViewById(R.id.pwm_import_status_error_icon).setVisibility(0);
                            return fuvs.a;
                        }
                    })));
                }
                return fuvs.a;
            }
        }));
        final Button button = (Button) inflate.findViewById(R.id.pwm_import_result_delete_file);
        y(jqxVar).t.g(getViewLifecycleOwner(), new avrr(new fvaq() { // from class: avrk
            @Override // defpackage.fvaq
            public final Object a(Object obj) {
                button.setVisibility(true != ((Boolean) obj).booleanValue() ? 8 : 0);
                return fuvs.a;
            }
        }));
        button.setOnClickListener(new View.OnClickListener() { // from class: avrl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImportResultFragment.y(fuuw.this).u.l(true);
            }
        });
        y(jqxVar).v.g(getViewLifecycleOwner(), new avrr(new fvaq() { // from class: avrm
            @Override // defpackage.fvaq
            public final Object a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    fuuw fuuwVar = jqxVar;
                    final Button button2 = button;
                    final ImportResultFragment importResultFragment = ImportResultFragment.this;
                    final avta y = ImportResultFragment.y(fuuwVar);
                    fvbo.c(button2);
                    String string = importResultFragment.getResources().getString(R.string.pwm_import_result_delete_file_confirmation, y.b());
                    fvbo.e(string, "getString(...)");
                    ebna ebnaVar = new ebna(importResultFragment.requireContext(), R.style.PwmAlertDialogThemeOverlay);
                    ebnaVar.C(string);
                    ebnaVar.K(R.string.pwm_import_result_delete_file, new DialogInterface.OnClickListener() { // from class: avqz
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            avta avtaVar = avta.this;
                            Uri uri = avtaVar.e;
                            if (uri == null) {
                                fvbo.j("importFileUri");
                                uri = null;
                            }
                            ImportResultFragment importResultFragment2 = importResultFragment;
                            avtv avtvVar = avtaVar.b;
                            fvbo.f(uri, "fileUri");
                            boolean deleteDocument = DocumentsContract.deleteDocument(((avts) avtvVar).b.getContentResolver(), uri);
                            avtaVar.u.l(false);
                            avtaVar.s.l(Boolean.valueOf(!deleteDocument));
                            String string2 = deleteDocument ? importResultFragment2.getResources().getString(R.string.pwm_import_result_file_deleted, avtaVar.b()) : importResultFragment2.getResources().getString(R.string.common_something_went_wrong);
                            Button button3 = button2;
                            fvbo.c(string2);
                            ebzi t = ebzi.t(button3, string2, -1);
                            t.q(button3);
                            t.i();
                        }
                    });
                    ebnaVar.E(R.string.common_cancel, new DialogInterface.OnClickListener() { // from class: avre
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            avta.this.u.l(false);
                        }
                    });
                    ebnaVar.a();
                }
                return fuvs.a;
            }
        }));
        if (y(jqxVar).r.hT() == null) {
            x().a();
        }
        ((Button) inflate.findViewById(R.id.pwm_import_result_done)).setOnClickListener(new View.OnClickListener() { // from class: avra
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImportResultFragment.this.x().a();
            }
        });
        fvbo.c(inflate);
        return inflate;
    }

    public final avnd x() {
        avnd avndVar = this.a;
        if (avndVar != null) {
            return avndVar;
        }
        fvbo.j("navigationController");
        return null;
    }
}
